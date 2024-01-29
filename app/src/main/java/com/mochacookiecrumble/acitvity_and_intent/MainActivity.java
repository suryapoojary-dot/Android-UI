package com.mochacookiecrumble.acitvity_and_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView starterscard ;
    CardView mainscard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterscard = findViewById(R.id.text_view_restaurant_menu);
        mainscard = findViewById(R.id.text_main_menu);
    }
}