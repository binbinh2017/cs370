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

import edu.qc.seclass.fim.Model.Employee;

import com.example.floorsupplystores.R;

import java.util.ArrayList;

public class EmployeeLoginActivity extends AppCompatActivity {

    EditText usernameEt;
    EditText passwordEt;

    Button loginButton;

    TextView registrationTextView;
    
    boolean isEmployeeExist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_employee);

        usernameEt = findViewById(R.id.usernameEditText);
        passwordEt = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.btnLogin);
        registrationTextView = findViewById(R.id.registrationTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = usernameEt.getText().toString().trim();
                String password = passwordEt.getText().toString().trim();

                if(TextUtils.isEmpty(username))
                {
                    Toast.makeText(EmployeeLoginActivity.this, "enter user name", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(EmployeeLoginActivity.this, "enter user password", Toast.LENGTH_SHORT).show();
                    return;
                }

                Database database = new Database(EmployeeLoginActivity.this);

                ArrayList<Employee> allEmployee = database.getEmployeeAll();
                
                for(Employee employee : allEmployee)
                {
                    if(employee.getUsername().equals(username) && employee.getPassword().equals(password))
                    {
                        isEmployeeExist = true;
                    }else
                    {
                        isEmployeeExist = false;
                    }
                }
                
                if(isEmployeeExist)
                {
                    Toast.makeText(EmployeeLoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(EmployeeLoginActivity.this,StoreSelectActivity.class));
                }else
                {
                    Toast.makeText(EmployeeLoginActivity.this, "Employee does not exist", Toast.LENGTH_SHORT).show();
                }
                  
                
            }
        });

        registrationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeLoginActivity.this,EmployeeRegistrationActivity.class));
            }
        });




    }
}