package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import edu.qc.seclass.fim.Adapter.ProductAdapterEmployee;
import edu.qc.seclass.fim.Model.Product;

import com.example.floorsupplystores.R;

public class UpdateProduct extends AppCompatActivity {

    EditText nameEt,colorEt,sizeEt,brandEt,typeEt,priceEt,specifiesEt,categoryEt,categoryTypeEt;

    Button productUpdateButton;

    String name;
    String color;
    double size;
    String brand;
    String type;
    double price;
    int quantity;
    String category;
    String species;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_product);

        nameEt = findViewById(R.id.productNameEt);
        categoryEt = findViewById(R.id.productCategoryEt);
        colorEt = findViewById(R.id.productColorEt);
        sizeEt = findViewById(R.id.productSizeEt);
        brandEt = findViewById(R.id.productBrandEt);
        typeEt = findViewById(R.id.productTypeEt);
        priceEt = findViewById(R.id.productPriceEt);
        specifiesEt = findViewById(R.id.floorSpecisEt);
        productUpdateButton = findViewById(R.id.productUpdateButton);

        //set all text

        Product product = ProductAdapterEmployee.selectedProduct;
        nameEt.setText(product.getName());
        colorEt.setText(product.getColor());
        sizeEt.setText(product.getSize());
        brandEt.setText(product.getBrand());
        typeEt.setText(product.getType());
        priceEt.setText(product.getPrice());
        categoryEt.setText(product.getCategory());
        specifiesEt.setText(product.getSpecies());


        productUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameEt.getText().toString();
                color = colorEt.getText().toString();
                String sSize = sizeEt.getText().toString();
                brand = brandEt.getText().toString();
                type = typeEt.getText().toString();
                String sPrice = priceEt.getText().toString();
                category = categoryEt.getText().toString();
                species = specifiesEt.getText().toString();

                if(TextUtils.isEmpty(name))
                {
                    Toast.makeText(UpdateProduct.this, "enter product name", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(color))
                {
                    Toast.makeText(UpdateProduct.this, "enter product color", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(sSize))
                {
                    Toast.makeText(UpdateProduct.this, "enter product size", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(brand))
                {
                    Toast.makeText(UpdateProduct.this, "enter product brand", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(type))
                {
                    Toast.makeText(UpdateProduct.this, "enter product type", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(sPrice))
                {
                    Toast.makeText(UpdateProduct.this, "enter product price", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(category))
                {
                    Toast.makeText(UpdateProduct.this, "enter floor category", Toast.LENGTH_SHORT).show();
                    return;
                }else if(TextUtils.isEmpty(species))
                {
                    Toast.makeText(UpdateProduct.this, "enter product species Type", Toast.LENGTH_SHORT).show();
                    return;
                }else
                {



                    Database database = new Database(UpdateProduct.this);

                    boolean isUpdated = database.productUpdate(product.getId(),name,category,color,sSize,brand,type,sPrice,species,StoreSelectActivity.shopName);

                    if(isUpdated){
                        Toast.makeText(UpdateProduct.this, "Product Updated", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(UpdateProduct.this,EmployeeProductList.class));
                        finish();
                    }

                }

            }
        });


    }
}