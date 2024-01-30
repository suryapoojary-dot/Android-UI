package com.mochacookiecrumble.acitvity_and_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    String[] dishes = {
            "Chicken Crispy",
            "Egg 65",
            "Chicken Manchow",
            "Veg Spring Roll",
            "Mushroom and tofu maki",
            "Egg and avocado uramaki",
            "Melon and lemon soup",
            "Coconut and chocolate mousse",
            "Spinach and cabbage wontons",
            "Broccoli and cucumber soup",
            "Chilli and aubergine dip",
            "Chickpea and chilli gyoza",
            "Sprout and pineapple soup",
            "Egusi and borscht soup",
            "Aubergine and egg sushi",
            "Artichoke and mustard soup",
            "Peppercorn and tamarind soup",
            "Parsley and celeriac parcels",
            "Pasta and broccoli soup",
            "Potato and courgette soup",
            "Chickpea and cabbage parcels",
            "Coriander and peppercorn gyoza",
            "Pear and chestnut soup",
            "Pesto and garam masala parcels"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView starterslist = findViewById(R.id.list_view_starters);


    }
}