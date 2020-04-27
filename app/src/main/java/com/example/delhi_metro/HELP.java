package com.example.delhi_metro;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class HELP extends AppCompatActivity {
   private Button submit;
     public EditText adinfo;
     public CheckBox wheel,med_em,comp,others;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_help);
            submit=(Button)findViewById(R.id.button8);
            adinfo=(EditText)findViewById(R.id.editText15);
            wheel=(CheckBox)findViewById(R.id.checkBox);
            med_em=(CheckBox)findViewById(R.id.checkBox2);
            comp=(CheckBox)findViewById(R.id.checkBox3);
            others=(CheckBox)findViewById(R.id.checkBox4);
            submit.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String sr=adinfo.getText().toString();
                        String ans="";
                        if(wheel.isChecked() &&!med_em.isChecked() && !comp.isChecked() && !others.isChecked())
                        { ans="Request for a wheelchair is accepted.";
                            openact();}
                        else if(med_em.isChecked() &&!wheel.isChecked() && !comp.isChecked() && !others.isChecked())
                        {ans="Request for medical emergency is accepted.";
                            openact();}
                        else if( !wheel.isChecked()&& !med_em.isChecked() && (comp.isChecked() ||others.isChecked()))
                        {  ans="Thank you for your patience:)";
                            openact();}
                        else
                            ans="OOPS SOMETHING WENT WRONG :(";

                    Toast.makeText(getApplicationContext(),ans, Toast.LENGTH_LONG).show();

                }
            });
        }
    public void openact(){

        Intent intent=new Intent(this, submit.class);

        startActivity(intent);

    }

    }


