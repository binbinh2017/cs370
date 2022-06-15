package edu.qc.seclass.fim.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import edu.qc.seclass.fim.Model.Product;
import com.example.floorsupplystores.R;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ExampleViewHolder> {

    private ArrayList<Product> productArrayList;


    public ProductAdapter(ArrayList<Product> productArrayList) {
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
        Product currentItem = productArrayList.get(position);

        holder.productIdEt.setText("Id :"+currentItem.getId());
        holder.nameEt.setText("Name :"+currentItem.getName());
        holder.colorEt.setText("Color :"+currentItem.getColor());
        holder.sizeEt.setText("Size :"+currentItem.getSize());
        holder.brandEt.setText("Brand :"+currentItem.getBrand());
        holder.typeEt.setText("Type :"+currentItem.getType());
        holder.priceEt.setText("Price :"+currentItem.getPrice());
        holder.categoryEt.setText("Category :"+currentItem.getCategory());
        holder.spefiiesEt.setText("Species :"+currentItem.getSpecies());
        holder.storeNameEt.setText("Storename :"+currentItem.getStorename());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }


    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        TextView productIdEt,nameEt,colorEt,sizeEt,brandEt,typeEt,priceEt,categoryEt,spefiiesEt,storeNameEt;


        public ExampleViewHolder(View itemView) {
            super(itemView);
            productIdEt = itemView.findViewById(R.id.productIdEt);
            nameEt = itemView.findViewById(R.id.productNameEt);
            colorEt = itemView.findViewById(R.id.productColorEt);
            sizeEt = itemView.findViewById(R.id.productSizeEt);
            brandEt = itemView.findViewById(R.id.productBrandEt);
            typeEt = itemView.findViewById(R.id.productTypeEt);
            priceEt = itemView.findViewById(R.id.productPriceEt);
            spefiiesEt = itemView.findViewById(R.id.speiciesEt);
            categoryEt = itemView.findViewById(R.id.productCategoryEt);
            storeNameEt = itemView.findViewById(R.id.storeNameEt);
        }
    }

}
