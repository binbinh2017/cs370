package edu.qc.seclass.fim;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import edu.qc.seclass.fim.Adapter.ProductAdapterEmployee;
import edu.qc.seclass.fim.Model.Product;

import com.example.floorsupplystores.R;

import java.util.ArrayList;

public class EmployeeProductList extends AppCompatActivity {

   RecyclerView recyclerView;
   ArrayList<Product> allProducts;
   ArrayList<Product> productSelectedShop;

   EditText searchTextEt;
   Button searchButton;
   TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_all_product_list);

        recyclerView = findViewById(R.id.productListRecyclerView);
        searchTextEt = findViewById(R.id.searchTextEt);
        searchButton = findViewById(R.id.searchButton);
        textView = findViewById(R.id.textView);

        Database database = new Database(EmployeeProductList.this);

        allProducts = database.getProductsAll();
        productSelectedShop = new ArrayList<>();

        for(Product product: allProducts)
        {
            if(product.getStorename().equals(StoreSelectActivity.shopName)){
                productSelectedShop.add(product);
            }
        }


        if(productSelectedShop.size() > 0)
        {


            textView.setText("Long click for update/delete product");
            ProductAdapterEmployee adapter = new ProductAdapterEmployee(EmployeeProductList.this,productSelectedShop);
            recyclerView.setAdapter(adapter);
            recyclerView.setVisibility(View.VISIBLE);
            recyclerView.setLayoutManager(new LinearLayoutManager(EmployeeProductList.this));
            recyclerView.setNestedScrollingEnabled(false);

        }else
        {
            textView.setText("Not available any product at "+UserStoreSelectActivity.shopName);
        }



    }
}