package com.example.admin.shakamarineapp6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Admin on 8/14/2017.
 */

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        TextView restaurantsTextView = (TextView) findViewById(R.id.restaurants);
        TextView attractionsTextView = (TextView) findViewById(R.id.attractions);
        TextView accommodationTextView = (TextView) findViewById(R.id.accommodation);
        final TextView entertainmentTextView = (TextView) findViewById(R.id.entertainment);

        restaurantsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurant = new Intent(category.this, restaurant.class);
                startActivity(restaurant);
            }
        });
        accommodationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accommodation = new Intent(category.this, accommodation.class);
                startActivity(accommodation);
            }
        });

        attractionsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractions = new Intent(category.this, attractions.class);
                startActivity(attractions);
            }
        });
        entertainmentTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entertainment = new Intent(category.this, entertainment.class);
                startActivity(entertainment);
            }
        });

    }

}
