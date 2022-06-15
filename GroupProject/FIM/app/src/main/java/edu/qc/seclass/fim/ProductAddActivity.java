package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.floorsupplystores.R;

public class ProductAddActivity extends AppCompatActivity {

    EditText nameEt,colorEt,sizeEt,brandEt,typeEt,priceEt,categoryEt,specifiesEt;

    Button addProductButton;

    String name;
    String color;
    double size;
    String brand;
    String type;
    double price;
    int quantity;
    String category;
    String specises;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_add);


        nameEt = findViewById(R.id.productNameEt);
        colorEt = findViewById(R.id.productColorEt);
        sizeEt = findViewById(R.id.productSizeEt);
        brandEt = findViewById(R.id.productBrandEt);
        typeEt = findViewById(R.id.productTypeEt);
        priceEt = findViewById(R.id.productPriceEt);
        categoryEt = findViewById(R.id.productCategoryEt);
        specifiesEt = findViewById(R.id.floorSpecisEt);

        addProductButton = findViewById(R.id.productAddButton);

        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameEt.getText().toString();
                color = colorEt.getText().toString();
                String sSize = sizeEt.getText().toString();

                brand = brandEt.getText().toString();
                type = typeEt.getText().toString();
                String sPrice = priceEt.getText().toString();
                category = categoryEt.getText().toString();
                specises = specifiesEt.getText().toString();

                if(TextUtils.isEmpty(name))
                {
                    Toast.makeText(ProductAddActivity.this, "enter product name", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(color))
                {
                    Toast.makeText(ProductAddActivity.this, "enter product color", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(sSize))
                {
                    Toast.makeText(ProductAddActivity.this, "enter product size", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(brand))
                {
                    Toast.makeText(ProductAddActivity.this, "enter product brand", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(type))
                {
                    Toast.makeText(ProductAddActivity.this, "enter product type", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(sPrice))
                {
                    Toast.makeText(ProductAddActivity.this, "enter product price", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(category))
                {
                    Toast.makeText(ProductAddActivity.this, "enter product category", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(specises))
                {
                    Toast.makeText(ProductAddActivity.this, "enter floor specises", Toast.LENGTH_SHORT).show();
                    return;
                }else
                {

                    size = Double.parseDouble(sSize);
                    price = Double.parseDouble(sPrice);

                    Database database = new Database(ProductAddActivity.this);


                   boolean isInserted = database.productInsert(name,category,color,sSize,brand,type,sPrice,specises,StoreSelectActivity.shopName);

                   if(isInserted){
                       Toast.makeText(ProductAddActivity.this, "Product added", Toast.LENGTH_SHORT).show();
                       nameEt.setText("");
                       colorEt.setText("");
                       sizeEt.setText("");
                       brandEt.setText("");
                       typeEt.setText("");
                       priceEt.setText("");
                       specifiesEt.setText("");
                       categoryEt.setText("");
                   }

                }
            }
        });
    }
}