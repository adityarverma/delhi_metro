package com.example.delhi_metro;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class submit extends AppCompatActivity {
       private Button sub;
    AutoCompleteTextView src;
       private EditText name;
       private EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        String stations[]={"AIIMS","Adarsh Nagar","Akshardham","Anand Vihar ISBT","Arjangarh","Ashok Park Main","Azadpur","Badarpur Border","Badkal Mor","Barakhamba Road","Bata chowk","Botanical Garden","Central Secretariat","Chandni Chowk","Chawri Bazaar","Chhattarpur","City Centre","Civil Lines","Delhi Aero City Centre","Dhaula Kuan","Dilshad Garden","Dwarka","Dwarka Mor","Dwarka Sec 10","Dwarka Sec 11","Dwarka Sec 12","Dwarka Sec 13","Dwarka Sec 14","Dwarka Sec 21","Dwarka Sec 8","Dwarka Sec 9","Escort Mujesar","GTB Nagar","Ghitorni","Golf Course","Govind Puri","Green Park","Guru Dronacharya","HUDA City Centre","Haiderpur","Hauz Khas","IFFCO Chowk","IGI Airport","INA","ITO","Inderlok","Indraprastha","JLN Stadium","Jahangirpuri","Janakpuri East","Janakpuri West","Jangpura","Janpath","Jasola-Apollo","Jhandewalan","Jhilmil","Jor Bagh","Kailash Colony","Kalkaji Mandir","Kanhaiya Nagar","Karkarduma","Karol Bagh","Kashmere Gate","Kaushambhi","Keshav Puram","Khan Market","Kirti Nagar","Kohat Enclave","Lajpat Nagar","Laxmi Nagar","MG Road","Madipur","Malviya Nagar","Mandi House","Mansarover Park","Mayur Vihar","Mayur Vihar Extn","Mewala Maharajpur","Model town","Mohan Estate","Moolchand","Moti Nagar","Mundka","NHPC Chowk","Nangloi","Nangloi Railway Stadium","Nawada","Neelam Chowk","Nehru Place","Netaji Subhash Place","New Ashok Nagar","New Delhi","Nirman Vihar","Noida Sec 15","Noida Sec 16","Noida Sector 18","Okhla","Old Faridabad","Paschim Vihar East","Paschim Vihar West","Patel Chowk","Patel Nagar","Peeragarhi","Pitampura","Pragati Madian","Pratap Nagar","Preet Vihar","Pulbangash","Punjabi Bagh","Qutab Minar","R.K Ashram Marg","Race Course","Rajdhani Park","Rajendra Place","Rajiv Chowk","Rajouri Garden","Ramesh Nagar","Rithala","Rohini East","Rohini West","Rohini sec 18","Saket","Samaypur Badli","Sarai","Sarita Vihar","Satguru Ram Singh Marg","Sector 28","Seelampur","Shadipur","Shahdra","Shastri Nagar","Shastri Park","Shivaji Park","Shivaji Stadium","Sikanderpur","Subhash Nagar","Sultanpur","Surajmal Stadium","Tagore Garden","Tilak Nagar","Tis Hazari","Tughlakabad","Udyog Bhawan","Udyog Nagar","Uttam Nagar East","Uttam Nagar West","Vaishali","Vidhan Sabha","Vishwavidyalaya","Welcome","Yamuna Bank"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,stations);
        sub=(Button)findViewById(R.id.button37);
        name=(EditText)findViewById(R.id.editText3);
        phone=(EditText)findViewById(R.id.editText4);
        src=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        src.setThreshold(1);//will start working from first character
        src.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String sr=name.getText().toString();
                String dt =phone.getText().toString();
                String sv=src.getText().toString();
                String ans="";
                if(sr.isEmpty()|| dt.isEmpty()|| sv.isEmpty())
                    ans="OOPS SOMETHING WENT WRONG :(";
                else
                    ans="Thank you for your patience:)";
                Toast.makeText(getApplicationContext(),ans, Toast.LENGTH_LONG).show();
                sr="";
                dt="";
                sv="";

            }
        });
        }
    }


