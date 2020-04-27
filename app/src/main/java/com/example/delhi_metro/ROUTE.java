package com.example.delhi_metro;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import java.util.*;
import android.widget.*;
public class ROUTE extends AppCompatActivity {
    private Button submitrt;
     AutoCompleteTextView src;
     AutoCompleteTextView dest;
     private Button map;
   ArrayList<String> arr =new ArrayList<String>();
    String stations[]={"AIIMS","Adarsh Nagar","Akshardham","Anand Vihar ISBT","Arjangarh","Ashok Park Main","Azadpur","Badarpur Border","Badkal Mor","Barakhamba Road","Bata chowk","Botanical Garden","Central Secretariat","Chandni Chowk","Chawri Bazaar","Chhattarpur","City Centre","Civil Lines","Delhi Aero City Centre","Dhaula Kuan","Dilshad Garden","Dwarka","Dwarka Mor","Dwarka Sec 10","Dwarka Sec 11","Dwarka Sec 12","Dwarka Sec 13","Dwarka Sec 14","Dwarka Sec 21","Dwarka Sec 8","Dwarka Sec 9","Escort Mujesar","GTB Nagar","Ghitorni","Golf Course","Govind Puri","Green Park","Guru Dronacharya","HUDA City Centre","Haiderpur","Hauz Khas","IFFCO Chowk","IGI Airport","INA","ITO","Inderlok","Indraprastha","JLN Stadium","Jahangirpuri","Janakpuri East","Janakpuri West","Jangpura","Janpath","Jasola-Apollo","Jhandewalan","Jhilmil","Jor Bagh","Kailash Colony","Kalkaji Mandir","Kanhaiya Nagar","Karkarduma","Karol Bagh","Kashmere Gate","Kaushambhi","Keshav Puram","Khan Market","Kirti Nagar","Kohat Enclave","Lajpat Nagar","Laxmi Nagar","MG Road","Madipur","Malviya Nagar","Mandi House","Mansarover Park","Mayur Vihar","Mayur Vihar Extn","Mewala Maharajpur","Model town","Mohan Estate","Moolchand","Moti Nagar","Mundka","NHPC Chowk","Nangloi","Nangloi Railway Stadium","Nawada","Neelam Chowk","Nehru Place","Netaji Subhash Place","New Ashok Nagar","New Delhi","Nirman Vihar","Noida Sec 15","Noida Sec 16","Noida Sector 18","Okhla","Old Faridabad","Paschim Vihar East","Paschim Vihar West","Patel Chowk","Patel Nagar","Peeragarhi","Pitampura","Pragati Madian","Pratap Nagar","Preet Vihar","Pulbangash","Punjabi Bagh","Qutab Minar","R.K Ashram Marg","Race Course","Rajdhani Park","Rajendra Place","Rajiv Chowk","Rajouri Garden","Ramesh Nagar","Rithala","Rohini East","Rohini West","Rohini sec 18","Saket","Samaypur Badli","Sarai","Sarita Vihar","Satguru Ram Singh Marg","Sector 28","Seelampur","Shadipur","Shahdra","Shastri Nagar","Shastri Park","Shivaji Park","Shivaji Stadium","Sikanderpur","Subhash Nagar","Sultanpur","Surajmal Stadium","Tagore Garden","Tilak Nagar","Tis Hazari","Tughlakabad","Udyog Bhawan","Udyog Nagar","Uttam Nagar East","Uttam Nagar West","Vaishali","Vidhan Sabha","Vishwavidyalaya","Welcome","Yamuna Bank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,stations);
        submitrt=(Button)findViewById(R.id.button3);
        map=(Button)findViewById(R.id.button11);
        src=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        dest=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView3);
        src.setThreshold(1);//will start working from first character
        src.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        dest.setThreshold(1);//will start working from first character
        dest.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView


        submitrt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String sr=src.getText().toString();
                String dt =dest.getText().toString();
                arr.clear();
                arr.add(sr);
                arr.add(dt);
                openact();

            }
        });
        map.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openact1();

            }
        });
    }
    public void openact(){

        Intent intent=new Intent(this, display.class);

        intent.putExtra("message",arr);

        startActivity(intent);

    }
    public void openact1(){

        Intent intent=new Intent(this, map_out.class);

        startActivity(intent);

    }


}
