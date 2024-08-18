package com.example.restauranteapp.model;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restauranteapp.R;
import com.example.restauranteapp.adapter.FoodAdapter;
import com.example.restauranteapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<Food>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();
    }

    private void getFood(){
        Food food1 = new Food(
                R.drawable.xbacondog,
                "X-Bacon Dog",
                "Com pão, salada, milho e batata - carne, bacon, salsicha, presunto e mussarela. Serve 1 pessoa",
                "R$ 23,20"
        );

        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.xbaconespecial,
                "X-Bacon Especial",
                "Delicioso xis bacon (pão, salada, milho, batata palha,hamburguer, bacon, ovo, presunto e mussarela). Serve 1 pessoa",
                "R$ 26,90"
        );

        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.xbaconsimples,
                "X-Bacon Simples",
                "Com pão, salada, milho e batata - carne, bacon, presunto e mussarela. Serve 1 pessoa",
                "R$ 22,50"
        );

        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.xsaladasimples,
                "X-Salada Simples",
                "Com pão, salada, milho e batata - carne presunto e mussarela. Serve 1 pessoa",
                "R$ 19,91"
        );

        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.xtudo,
                "X-Tudo",
                "Com pão, salada, milho e batata - carne,salsicha, bacon, ovo, presunto e mussarela. Serve 1 pessoa",
                "R$ 27,50"
        );

        foodList.add(food5);
    }
}