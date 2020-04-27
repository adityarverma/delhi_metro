package com.example.delhi_metro;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MAP extends AppCompatActivity {
private Button rch;
private EditText mcd;
private EditText cd;
private EditText amt;
private EditText cvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        rch=(Button)findViewById(R.id.button9);
        mcd=(EditText) findViewById(R.id.editText10);
        amt=(EditText) findViewById(R.id.editText12);
        cd= (EditText) findViewById(R.id.editText11);
        cvv=(EditText) findViewById(R.id.editText13);


        rch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String sr=mcd.getText().toString();
                String dt =amt.getText().toString();
                String st=cd.getText().toString();
                String dr=cvv.getText().toString();
                if(!sr.equals("")&& sr.length()==10 && !dt.equals("")&& dt.length()<=3&& !st.equals("") && st.length()==10 && !dr.equals("")&& dr.length()==3)
                Toast.makeText(getApplicationContext(),"RECHARGE SUCCESSFULLY DONE FOR AMOUNT "+dt, Toast.LENGTH_LONG).show();
               else
                   Toast.makeText(getApplicationContext(), "OOPS!!! SOMETHING WENT WRONG :(", Toast.LENGTH_LONG).show();
                mcd.setText("");
                amt.setText("");
                cd.setText("");
                cvv.setText("");


            }
        });
    }
    }


