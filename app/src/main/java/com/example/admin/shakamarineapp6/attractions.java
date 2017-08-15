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

public class attractions extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words(getString(R.string.bird_park), R.drawable.birdpark,"490 Riverside Road, Durban North, Durban"));
        words.add(new Words(getString(R.string.botanic_garden), R.drawable.botanic,"70 St Thomas Rd, Musgrave, Berea, 4001"));
        words.add(new Words(getString(R.string.science_museum), R.drawable.sciencemuseum,"City Hall, 234 Anton Lembede St, Durban Central, Durban, 4000"));
        words.add(new Words(getString(R.string.moses_mabida_stadium), R.drawable.mosesstadium2,"44 Isaiah Ntshangase Rd, Stamford Hill, Durban, 4001"));
        words.add(new Words(getString(R.string.church), R.drawable.stpaulls2,"161 Monty Naicker Rd, Durban Central, Durban, 4001"));


        InputAdapter adapter = new InputAdapter(this, words, R.color.attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Words pos = words.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:"+pos.getLocation()+"?q="+pos.getText() + " Durban"));
                startActivity(intent);
            }
        });
    }
}


