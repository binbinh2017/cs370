package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.floorsupplystores.R;

public class EmployeeOptionActivity extends AppCompatActivity {

    Button addProductButton,updateButton,deletedButton;

    public static  boolean isDeleted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_option);

        addProductButton = findViewById(R.id.btnAddProduct);
        updateButton = findViewById(R.id.updatedButton);
        deletedButton = findViewById(R.id.deletedButton);

        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeOptionActivity.this,ProductAddActivity.class));
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDeleted = false;
                startActivity(new Intent(EmployeeOptionActivity.this,EmployeeProductList.class));
            }
        });
        deletedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDeleted = true;
                startActivity(new Intent(EmployeeOptionActivity.this,EmployeeProductList.class));
            }
        });
    }
}