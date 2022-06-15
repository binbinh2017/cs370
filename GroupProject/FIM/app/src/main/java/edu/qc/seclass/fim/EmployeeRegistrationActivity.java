package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.floorsupplystores.R;

public class EmployeeRegistrationActivity extends AppCompatActivity {

    EditText usernameEt;
    EditText employeePasswordEt;

    Button registrationButton;

    TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_employee);

        usernameEt = findViewById(R.id.usernameEditText);
        employeePasswordEt = findViewById(R.id.passwordEditText);
        registrationButton = findViewById(R.id.btnRegistration);
        loginTextView = findViewById(R.id.loginTextView);

        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = usernameEt.getText().toString().trim();
                String password = employeePasswordEt.getText().toString().trim();

                if(TextUtils.isEmpty(username))
                {
                    Toast.makeText(EmployeeRegistrationActivity.this, "enter user name", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(EmployeeRegistrationActivity.this, "enter user name", Toast.LENGTH_SHORT).show();
                    return;
                }

                Database database = new Database(EmployeeRegistrationActivity.this);
                boolean isInserted = database.employeeInsert(username,password);
                if(isInserted)
                {
                    Toast.makeText(EmployeeRegistrationActivity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(EmployeeRegistrationActivity.this,EmployeeOptionActivity.class));
                }
            }
        });

        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeRegistrationActivity.this,StoreSelectActivity.class));
            }
        });




    }
}