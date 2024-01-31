package com.mochacookiecrumble.acitvity_and_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {



   /* String[] dishes = {
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

*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView starterslist = findViewById(R.id.list_view_starters);

        Dish[] dishes = {

                new Dish("Chicken Crispy","Chicken fried in tangy sauce",499),

                new Dish("Chicken fingers","Chicken fried with fries in tangy sauce",599),

                new Dish("Fish Tempura","Fishe baked in tempura sauce",599),

                new Dish("Calamiri Crispy","Calamiri fried in tangy sauce",499),

                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);
        starterslist.setAdapter(dishesAdapter);


    }
}