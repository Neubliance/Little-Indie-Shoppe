package com.example.littleindieshoppe.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.littleindieshoppe.Interface.ItemClickListener;
import com.example.littleindieshoppe.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListener itemClickListener;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.product_image);
        txtProductName = itemView.findViewById(R.id.product_name);
        txtProductDescription = itemView.findViewById(R.id.product_description);
        txtProductPrice = itemView.findViewById(R.id.product_price);
    }

    public void setItemClickListener(ItemClickListener listener) {
        this.itemClickListener = listener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }
}
