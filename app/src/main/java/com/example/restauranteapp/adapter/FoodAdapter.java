package com.example.restauranteapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restauranteapp.databinding.FoodItemBinding;
import com.example.restauranteapp.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{
    
    private final Context context;
    private final ArrayList<Food> foodList;

    public FoodAdapter(ArrayList<Food> foodList, Context context) {
        this.context = context;
        this.foodList = foodList;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.binding.imgFood.setBackgroundResource(foodList.get(position).getImgFood());
        holder.binding.txtFoodName.setText(foodList.get(position).getFoodName());
        holder.binding.txtFoodDescription.setText(foodList.get(position).getFoodDescription());
        holder.binding.txtPrice.setText(foodList.get(position).getPrice());
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FoodItemBinding listItem;
        listItem = FoodItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new FoodViewHolder(listItem);
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder{

        FoodItemBinding binding;

        public FoodViewHolder(FoodItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
