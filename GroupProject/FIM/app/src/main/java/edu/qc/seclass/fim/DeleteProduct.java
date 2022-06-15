package edu.qc.seclass.fim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import edu.qc.seclass.fim.Adapter.ProductAdapterEmployee;
import edu.qc.seclass.fim.Model.Product;

import com.example.floorsupplystores.R;

public class DeleteProduct extends AppCompatActivity {

    TextView productIdEt,nameEt,colorEt,sizeEt,brandEt,typeEt,priceEt,categoryEt,speciesEt,storeNameEt;
    Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_product);

        productIdEt = findViewById(R.id.productIdEt);
        nameEt = findViewById(R.id.productNameEt);
        colorEt = findViewById(R.id.productColorEt);
        sizeEt = findViewById(R.id.productSizeEt);
        brandEt = findViewById(R.id.productBrandEt);
        typeEt = findViewById(R.id.productTypeEt);
        priceEt = findViewById(R.id.productPriceEt);
        categoryEt = findViewById(R.id.productCategoryEt);
        speciesEt = findViewById(R.id.speiciesEt);
        storeNameEt = findViewById(R.id.storeNameEt);

        //set all text
        Product product = ProductAdapterEmployee.selectedProduct;
        productIdEt.setText("id : "+product.getId());
        nameEt.setText("Name : "+product.getName());
        categoryEt.setText("Category : "+product.getCategory());
        colorEt.setText("Color : "+product.getColor());
        sizeEt.setText("Size : "+product.getSize());
        brandEt.setText("Brand : "+product.getBrand());
        typeEt.setText("Type : "+product.getType());
        priceEt.setText("Price : "+product.getPrice());
        speciesEt.setText("Species : "+product.getSpecies());
        storeNameEt.setText("Store Name : "+product.getStorename());

        deleteButton = findViewById(R.id.productDeleteButton);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database database = new Database(DeleteProduct.this);
                int isDeleted = database.productDelete(product.getId());

                if(isDeleted > 0)
                {
                    Toast.makeText(DeleteProduct.this, "Product Deleted", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(DeleteProduct.this,EmployeeProductList.class));
                    finish();
                }

            }
        });


    }
}