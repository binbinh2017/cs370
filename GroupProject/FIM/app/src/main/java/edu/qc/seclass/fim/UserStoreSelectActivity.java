package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.floorsupplystores.R;

public class UserStoreSelectActivity extends AppCompatActivity {

    Button shop1Btn,shop2Btn,shop3Btn;

    public static String shopName="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_store_select);

        shop1Btn = findViewById(R.id.shop1Button);
        shop2Btn = findViewById(R.id.shop2Button);
        shop3Btn = findViewById(R.id.shop3Button);

        shop1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shopName = "shop1";
                startActivity(new Intent(UserStoreSelectActivity.this, UserFilterSearch.class));
            }
        });
        shop2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shopName = "shop2";
                startActivity(new Intent(UserStoreSelectActivity.this, UserFilterSearch.class));
            }
        });
        shop3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shopName = "shop3";
                startActivity(new Intent(UserStoreSelectActivity.this, UserFilterSearch.class));
            }
        });
    }
}