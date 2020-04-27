package com.example.delhi_metro;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class OUTLETS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outlets);
        final ListView listView;
        final TextView tv1,tv2,tv3,tv4,tv5;
        final ImageView imageView,imageView1;
        final String places[]={"Akshardham Temple","Dilli Haat","Gurudwara Bangla Sahib","Hauz Khas Village","Humayun's Tomb","India Gate","Jama Masjid","Jantar Mantar","Lotus Temple","National Museum","Purana Qila","Qutub Minar","Red Fort","Sacred Heart Cathedral","Saket District Centre","The Garden of Five Senses"};
        listView=(ListView)findViewById(R.id.listView13);
        tv1=(TextView)findViewById(R.id.textView12);
        tv2=(TextView)findViewById(R.id.textView16);
        tv3=(TextView)findViewById(R.id.textView13);
        tv4=(TextView)findViewById(R.id.textView14);
        tv5=(TextView)findViewById(R.id.textView15);
        imageView=(ImageView)findViewById(R.id.imageView39);
        imageView1=(ImageView)findViewById(R.id.imageView40);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.select_dialog_item, places);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listView.setVisibility(View.GONE);
                tv1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.VISIBLE);
                switch (position)
                {
                    case 0:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Akshardham");
                        tv3.setText(" Distance : 300m");
                        imageView1.setImageResource(R.drawable.akshardham);
                        break;
                    case 1:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : INA/Netaji Subash Place");
                        tv3.setText(" Distance : 200m,200m");
                        imageView1.setImageResource(R.drawable.dillihaat);
                        break;
                    case 2:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Patel Chowk");
                        tv3.setText(" Distance : 300m");
                        imageView1.setImageResource(R.drawable.banglasahib);
                        break;
                    case 3:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Hauz Khas");
                        tv3.setText(" Distance : 2600m");
                        imageView1.setImageResource(R.drawable.hauzkhasvillage);
                        break;
                    case 4:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Khan Market/Jangpra");
                        tv3.setText(" Distance : 1000m,1000m");
                        imageView1.setImageResource(R.drawable.humayunstomb);
                        break;
                    case 5:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Central Secretariat");
                        tv3.setText(" Distance : 900m");
                        imageView1.setImageResource(R.drawable.indiagate);
                        break;
                    case 6:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Chandni Chowk");
                        tv3.setText(" Distance : 500m");
                        imageView1.setImageResource(R.drawable.jamamasjid);
                        break;
                    case 7:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Rajiv Chowk");
                        tv3.setText(" Distance : 300m");
                        imageView1.setImageResource(R.drawable.jantarmantar);
                        break;
                    case 8:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Nehru Place/Kalkaji Mandir");
                        tv3.setText(" Distance : 300m,300m");
                        imageView1.setImageResource(R.drawable.lotustemple);
                        break;
                    case 9:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Central Secretariat");
                        tv3.setText(" Distance : 800m");
                        imageView1.setImageResource(R.drawable.nationalmuseum);
                        break;
                    case 10:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Pragati Maidan");
                        tv3.setText(" Distance : 300m");
                        imageView1.setImageResource(R.drawable.puranaqila);
                        break;

                    case 11:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Qutub Minar");
                        tv3.setText(" Distance : 1900m");
                        imageView1.setImageResource(R.drawable.qutubminar);
                        break;
                    case 12:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Chandni Chowk");
                        tv3.setText(" Distance : 300m");
                        imageView1.setImageResource(R.drawable.redfort);
                        break;
                    case 13:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Patel Chowk");
                        tv3.setText(" Distance : 300m");
                        imageView1.setImageResource(R.drawable.sacredheart);
                        break;
                    case 14:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Malviya Nagar");
                        tv3.setText(" Distance : 1200m");
                        imageView1.setImageResource(R.drawable.saketdc);
                        break;
                    case 15:
                        tv1.setText(places[position]);
                        tv2.setText("Nearest Metro Station : Saket");
                        tv3.setText(" Distance : 500m");
                        imageView1.setImageResource(R.drawable.gardenoffive);
                        break;

                }
            }
        });

    }
    public void activity_outlets(View view) {
        Intent intent=new Intent(this, OUTLETS.class);
        startActivity(intent);

    }
}

