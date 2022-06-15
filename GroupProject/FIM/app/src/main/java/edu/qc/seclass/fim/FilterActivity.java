package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.floorsupplystores.R;

public class FilterActivity extends AppCompatActivity {

    public static  String category, type;

    public static boolean isFilter =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        findViewById(R.id.tilePorcelain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "tile";
                type = "porcelain";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));


            }
        });
        findViewById(R.id.tileResin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "tile";
                type = "resin";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.tileCeramic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "tile";
                type = "ceramic";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });


        findViewById(R.id.stoneMarble).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "stone";
                type = "marble";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.stonePebble).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "stone";
                type = "pebble";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.stoneSlate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "stone";
                type = "slate";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });



        findViewById(R.id.woodSolid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "wood";
                type = "solid";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.woodBamboo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "wood";
                type = "bamboo";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.woodEngineering).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "wood";
                type = "bamboo";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });


        findViewById(R.id.wSpeciesOak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "wood species";
                type = "oak";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.wSpeciesMaple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "wood species";
                type = "maple";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.wSpeciesHickory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "wood species";
                type = "hickory";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.laminateRegular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "laminate";
                type = "regular";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.laminateWaterResistant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "laminate";
                type = "water resistant";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.vinylWaterResistant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "vinyl";
                type = "water resistant";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
        findViewById(R.id.vinylWaterProof).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category = "vinyl";
                type = "waterproof";
                isFilter = true;
                startActivity(new Intent(FilterActivity.this,UserAllProductList.class));
            }
        });
    }
}