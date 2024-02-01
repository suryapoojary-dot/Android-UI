package com.mochacookiecrumble.acitvity_and_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        Dish[] desserts = {

                new Dish("Caramel custard", "Sweet caramel with custard", 299),
                new Dish("Vanilla Ice-cream", "Simple Vanilla Ice-cream", 99),
                new Dish("Sizzling Chocolate Brownie", "Hot Brownie with Vanilla ice-cream", 299)


        };

        ListView dessert_list_view = findViewById(R.id.sweet);

        ArrayAdapter<Dish> Dessert = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);

        dessert_list_view.setAdapter(Dessert);
    }

}