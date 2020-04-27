package com.example.delhi_metro;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public dbhandle db;

    private Button route;
    private Button fare;
    private Button duration;
    private Button outlets;
    private Button map;
    private Button help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        route=(Button)findViewById(R.id.button);
        fare=(Button)findViewById(R.id.button5);
        duration=(Button)findViewById(R.id.button4);
        outlets=(Button)findViewById(R.id.button2);
        map=(Button)findViewById(R.id.button6);
        help=(Button)findViewById(R.id.button7);

        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact();

            }
        });
        fare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact1();

            }
        });
        duration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact2();

            }
        });
        outlets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact3();

            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact4();

            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact5();

            }
        });



    }
    public void openact(){
        Intent intent=new Intent(this, ROUTE.class);
        startActivity(intent);
    }
    public void openact1(){
        Intent intent=new Intent(this, FARE.class);
        startActivity(intent);
    }
    public void openact2(){
        Intent intent=new Intent(this, DURATION.class);
        startActivity(intent);
    }
    public void openact3(){
        Intent intent=new Intent(this, OUTLETS.class);
        startActivity(intent);
    }
    public void openact4(){
        Intent intent=new Intent(this, MAP.class);
        startActivity(intent);
    }
    public void openact5(){
        Intent intent=new Intent(this, HELP.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
