package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.floorsupplystores.R;

public class UserFilterSearch extends AppCompatActivity {

    Button searchButton,filterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_filter_search);

        findViewById(R.id.searchFloorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FilterActivity.isFilter =false;
                startActivity(new Intent(UserFilterSearch.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.filterFloorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserFilterSearch.this,FilterActivity.class));
            }
        });
    }
}