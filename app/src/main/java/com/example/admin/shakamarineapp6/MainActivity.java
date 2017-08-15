package com.example.admin.shakamarineapp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        LinearLayout click = (LinearLayout) findViewById(R.id.click);
        if (click != null) {
            click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent category = new Intent(MainActivity.this,category.class);
                    startActivity(category);
                }
            });
        }
    }


    //  public boolean onCreateOptionsMenu(Menu menu) {
  //      inflater.inflate(R.menu.exit, menu);
      //  return true;
  //  }
}
