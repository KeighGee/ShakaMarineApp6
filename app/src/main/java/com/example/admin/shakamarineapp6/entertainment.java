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
 * Created by Admin on 8/15/2017.
 */

public class entertainment extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words(getString(R.string.aquarium), R.drawable.aquarium2,"Ushaka Marine World Durban"));
        words.add(new Words(getString(R.string.shark_diving), R.drawable.sharkdive,"Ushaka Marine World Durban"));
        words.add(new Words(getString(R.string.fun_world), R.drawable.funworld,"73 OR Tambo Parade, South Beach, Durban, 4001"));
        words.add(new Words(getString(R.string.bike_saddle), R.drawable.bikesaddle,"170 Mahatma Gandhi Road, Durban 4001, South Africa"));
        words.add(new Words(getString(R.string.dolphin_stadium), R.drawable.dolphinstad," Ushaka Marine World Durban"));

        InputAdapter adapter = new InputAdapter(this, words, R.color.entertainment);
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


