package edu.qc.seclass.fim;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import edu.qc.seclass.fim.Model.User;

import com.example.floorsupplystores.R;

import java.util.ArrayList;

public class UserLoginActivity extends AppCompatActivity {

    EditText usernameEt;
    EditText employeePasswordEt;

    Button loginButton;

    TextView registrationTextView;
    boolean isUserExist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        usernameEt = findViewById(R.id.usernameEditText);
        employeePasswordEt = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.btnLogin);
        registrationTextView = findViewById(R.id.registrationTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = usernameEt.getText().toString().trim();
                String password = employeePasswordEt.getText().toString().trim();

                if(TextUtils.isEmpty(username))
                {
                    Toast.makeText(UserLoginActivity.this, "enter user name", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(UserLoginActivity.this, "enter user password", Toast.LENGTH_SHORT).show();
                    return;
                }
                Database database = new Database(UserLoginActivity.this);

                ArrayList<User> allUser = database.getUsersAll();

                for(User user : allUser)
                {
                    if(user.getUsername().equals(username) && user.getPassword().equals(password))
                    {
                        isUserExist = true;
                    }else
                    {
                        isUserExist = false;
                    }
                }

                if(isUserExist)
                {
                    Toast.makeText(UserLoginActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(UserLoginActivity.this,UserStoreSelectActivity.class));
                }else
                {
                    Toast.makeText(UserLoginActivity.this, "Not exist need to registration first", Toast.LENGTH_SHORT).show();
                }

            }
        });

        registrationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserLoginActivity.this,UserRegistrationActivity.class));
            }
        });




    }
}