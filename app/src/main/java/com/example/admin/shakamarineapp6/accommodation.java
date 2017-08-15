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

public class accommodation extends AppCompatActivity {

    public static Class getposition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words(getString(R.string.balmoral_hotel), R.drawable.balmoral,"125 Marine Parade, Beach Road, 4001 Durban, South Africa "));
        words.add(new Words(getString(R.string.protea_hotel), R.drawable.proteahot,"Corner Lighthouse Road and Chartwell Road, Umhlanga Rocks, Umhlanga, 4001 Durban, South Africa"));
        words.add(new Words(getString(R.string.gooderson_hotel), R.drawable.ggodersonhot,"107 Marine Parade, Durban, 4001 Durban, South Africa"));
        words.add(new Words(getString(R.string.waterfront_hotel), R.drawable.waterfront,"40 MAHATMA GANDHI, CORNER OF BROWNS, 4000 , Durban"));
        words.add(new Words(getString(R.string.hilton_hotel), R.drawable.hilton_hotel,"12-14 Walnut Road, 4001 Durban, South Africa"));

        InputAdapter adapter = new InputAdapter(this, words, R.color.accommodation);
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
