package com.example.admin.shakamarineapp6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Admin on 8/14/2017.
 */

public class restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words(getString(R.string.rocco_mamas), R.drawable.rocomamas,"uShaka Marine World, 1 Bell St, Point, Durban, 4001"));
        words.add(new Words(getString(R.string.nadias_restaurant), R.drawable.nadiasrestaurant,"uShaka Marine World 1, King Shaka Ave, Point Durban, 4001"));
        words.add(new Words(getString(R.string.piatto_restaurant), R.drawable.piattopic,"Shop L08 Ushaka Marine World, 1 Bell St, Point, Durban, 4001"));
        words.add(new Words(getString(R.string.moyo_restaurant), R.drawable.moyoresturant,"uShaka Marine World, 1 Bell St, Point, Durban, 4001"));
        words.add(new Words(getString(R.string.cargo_hold_restaurant), R.drawable.cargohold,"uShaka Marine World"));

        InputAdapter adapter = new InputAdapter(this, words, R.color.restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words pos = words.get(position);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + "?q=" + pos.getText() + " Durban"));
                startActivity(mapIntent);

            }
        });
    }
}


