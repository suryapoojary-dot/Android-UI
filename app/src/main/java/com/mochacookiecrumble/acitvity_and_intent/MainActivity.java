package com.mochacookiecrumble.acitvity_and_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterscard ;
    CardView mainscard;

    CardView dessertcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterscard = findViewById(R.id.text_view_restaurant_menu);
        mainscard = findViewById(R.id.text_main_menu);
        TextView emailtexview = findViewById(R.id.email);
        dessertcard = findViewById(R.id.dess);

        starterscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this,StarterActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainsActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
                startActivity(mainsActivityIntent);
            }
        });

        emailtexview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchemailapp = new Intent(Intent.ACTION_SENDTO);
                launchemailapp.setData(Uri.parse("mailto:throwxception@gmail.com"));
                startActivity(launchemailapp);
            }
        });


        dessertcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dessert_intent = new Intent(MainActivity.this,DessertActivity.class);
                startActivity(dessert_intent);

            }
        });
    }
}