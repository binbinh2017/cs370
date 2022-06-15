package edu.qc.seclass.fim.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import edu.qc.seclass.fim.DeleteProduct;
import edu.qc.seclass.fim.EmployeeOptionActivity;
import edu.qc.seclass.fim.Model.Product;

import com.example.floorsupplystores.R;
import edu.qc.seclass.fim.UpdateProduct;

import java.util.ArrayList;

public class ProductAdapterEmployee extends RecyclerView.Adapter<ProductAdapterEmployee.ExampleViewHolder> {

    private ArrayList<Product> productArrayList;
    
    public  static  Product selectedProduct;

    Context context;


    public ProductAdapterEmployee(Context context,ArrayList<Product> productArrayList) {
        this.context = context;
        this.productArrayList = productArrayList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_product, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        Product currentProduct = productArrayList.get(position);


        TextView nameEt,colorEt,sizeEt,brandEt,typeEt,priceEt,quantityEt,categoryEt,categoryTypeEt;
        holder.productIdEt.setText("Id :"+currentProduct.getId());
        holder.nameEt.setText("Name :"+currentProduct.getName());
        holder.colorEt.setText("Color :"+currentProduct.getColor());
        holder.sizeEt.setText("Size :"+currentProduct.getSize());
        holder.brandEt.setText("Brand :"+currentProduct.getBrand());
        holder.typeEt.setText("Type :"+currentProduct.getType());
        holder.priceEt.setText("Price :"+currentProduct.getPrice());
        holder.categoryEt.setText("Quantity :"+currentProduct.getCategory());
        holder.specifiesEt.setText("Species :"+currentProduct.getSpecies());
        holder.storeNameEt.setText("Storename :"+currentProduct.getStorename());
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                selectedProduct = currentProduct;

                if(EmployeeOptionActivity.isDeleted)
                {
                    context.startActivity(new Intent(context, DeleteProduct.class));
                    return false;
                }else {
                    context.startActivity(new Intent(context, UpdateProduct.class));
                    return false;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }


    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        TextView productIdEt,nameEt,colorEt,sizeEt,brandEt,typeEt,priceEt,categoryEt,specifiesEt,storeNameEt;


        public ExampleViewHolder(View itemView) {
            super(itemView);
            productIdEt = itemView.findViewById(R.id.productIdEt);
            nameEt = itemView.findViewById(R.id.productNameEt);
            colorEt = itemView.findViewById(R.id.productColorEt);
            sizeEt = itemView.findViewById(R.id.productSizeEt);
            brandEt = itemView.findViewById(R.id.productBrandEt);
            typeEt = itemView.findViewById(R.id.productTypeEt);
            priceEt = itemView.findViewById(R.id.productPriceEt);
            categoryEt = itemView.findViewById(R.id.productCategoryEt);
            specifiesEt = itemView.findViewById(R.id.speiciesEt);
            storeNameEt = itemView.findViewById(R.id.storeNameEt);
        }
    }

}
