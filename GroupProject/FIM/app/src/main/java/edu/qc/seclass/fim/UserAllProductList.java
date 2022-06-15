package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import edu.qc.seclass.fim.Adapter.ProductAdapter;
import edu.qc.seclass.fim.Model.Product;

import com.example.floorsupplystores.R;

import java.util.ArrayList;

public class UserAllProductList extends AppCompatActivity {

   RecyclerView recyclerView;
   ArrayList<Product> allProducts;
  ArrayList<Product> productSelectedShop;;

   EditText searchTextEt;
   Button searchButton;
   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_all_product_list);

        recyclerView = findViewById(R.id.productListRecyclerView);
        searchTextEt = findViewById(R.id.searchTextEt);
        searchButton = findViewById(R.id.searchButton);
        textView = findViewById(R.id.textView);

        Database database = new Database(UserAllProductList.this);

        allProducts = database.getProductsAll();

        productSelectedShop = new ArrayList<>();

        for(Product product : allProducts)
        {
            if(product.getStorename().equals(UserStoreSelectActivity.shopName))
            {
                if(FilterActivity.isFilter)
                {
                    if(product.getCategory().equals(FilterActivity.category) && product.getType().equals(FilterActivity.type))
                    {
                        productSelectedShop.add(product);
                    }
                }else
                {
                    productSelectedShop.add(product);
                }

            }
        }



        if(productSelectedShop.size() > 0)
        {
            textView.setText("All available products");
            ProductAdapter adapter = new ProductAdapter(productSelectedShop);
            recyclerView.setAdapter(adapter);
            recyclerView.setVisibility(View.VISIBLE);
            recyclerView.setLayoutManager(new LinearLayoutManager(UserAllProductList.this));
            recyclerView.setNestedScrollingEnabled(false);

        }else
        {
            textView.setText("Not available any product at "+UserStoreSelectActivity.shopName);
        }



        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchText = searchTextEt.getText().toString().trim();
                if(TextUtils.isEmpty(searchText))
                {
                    Toast.makeText(UserAllProductList.this, "search text empty", Toast.LENGTH_SHORT).show();
                    textView.setText("All available products");
                    ProductAdapter adapter = new ProductAdapter(allProducts);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setVisibility(View.VISIBLE);
                    recyclerView.setLayoutManager(new LinearLayoutManager(UserAllProductList.this));
                    recyclerView.setNestedScrollingEnabled(false);
                    return;
                }

                ArrayList<Product> searchProduct = new ArrayList<>();

                for(Product product : productSelectedShop)
                {
                    if(product.getName().trim().equals(searchText))
                    {
                        searchProduct.add(product);
                    }
                }
                if(searchProduct.size() > 0)
                {
                    textView.setText("All available products");
                    ProductAdapter adapter = new ProductAdapter(searchProduct);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setVisibility(View.VISIBLE);
                    recyclerView.setLayoutManager(new LinearLayoutManager(UserAllProductList.this));
                    recyclerView.setNestedScrollingEnabled(false);

                }else
                {
                    textView.setText("Not available any product");
                    ProductAdapter adapter = new ProductAdapter(productSelectedShop);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setVisibility(View.VISIBLE);
                    recyclerView.setLayoutManager(new LinearLayoutManager(UserAllProductList.this));
                    recyclerView.setNestedScrollingEnabled(false);
                }

            }
        });
    }
}