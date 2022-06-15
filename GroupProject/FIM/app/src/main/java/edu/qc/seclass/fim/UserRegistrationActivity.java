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

import com.example.floorsupplystores.R;

public class UserRegistrationActivity extends AppCompatActivity {

    EditText usernameEt;
    EditText passwordEt;

    Button registrationButton;

    TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_user);

        usernameEt = findViewById(R.id.usernameEditText);
        passwordEt = findViewById(R.id.passwordEditText);
        registrationButton = findViewById(R.id.btnRegistration);
        loginTextView = findViewById(R.id.loginTextView);

        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = usernameEt.getText().toString().trim();
                String password = passwordEt.getText().toString().trim();

                if(TextUtils.isEmpty(username))
                {
                    Toast.makeText(UserRegistrationActivity.this, "enter user name", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(UserRegistrationActivity.this, "enter user name", Toast.LENGTH_SHORT).show();
                    return;
                }
                Database database = new Database(UserRegistrationActivity.this);
                boolean isInserted = database.userInsert(username,password);
                if(isInserted)
                {
                    Toast.makeText(UserRegistrationActivity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(UserRegistrationActivity.this,UserStoreSelectActivity.class));
                }
            }
        });



        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserRegistrationActivity.this,UserLoginActivity.class));
            }
        });



    }
}