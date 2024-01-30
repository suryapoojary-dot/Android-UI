package com.mochacookiecrumble.acitvity_and_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    String[] dishes = {"Chicken Crispy", "Egg 65", "Chicken Manchow", "Veg Spring Roll"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView starterslist = findViewById(R.id.list_view_starters);


    }
}