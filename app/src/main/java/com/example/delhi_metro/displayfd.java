package com.example.delhi_metro;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.*;

public class displayfd extends AppCompatActivity {
    private EditText result;
    int b=Color.BLUE;
    int y=Color.YELLOW;
    int gr=Color.GREEN;
    int p=Color.MAGENTA;//PURPLE
    int r=Color.RED;
    int o=Color.rgb(255, 165, 0);
    int fare=0;
    int duration=0;
    String stations[]={"AIIMS","Adarsh Nagar","Akshardham","Anand Vihar ISBT","Arjangarh","Ashok Park Main","Azadpur","Badarpur Border","Badkal Mor","Barakhamba Road","Bata chowk","Botanical Garden","Central Secretariat","Chandni Chowk","Chawri Bazaar","Chhattarpur","City Centre","Civil Lines","Delhi Aero City Centre","Dhaula Kuan","Dilshad Garden","Dwarka","Dwarka Mor","Dwarka Sec 10","Dwarka Sec 11","Dwarka Sec 12","Dwarka Sec 13","Dwarka Sec 14","Dwarka Sec 21","Dwarka Sec 8","Dwarka Sec 9","Escort Mujesar","GTB Nagar","Ghitorni","Golf Course","Govind Puri","Green Park","Guru Dronacharya","HUDA City Centre","Haiderpur","Hauz Khas","IFFCO Chowk","IGI Airport","INA","ITO","Inderlok","Indraprastha","JLN Stadium","Jahangirpuri","Janakpuri East","Janakpuri West","Jangpura","Janpath","Jasola-Apollo","Jhandewalan","Jhilmil","Jor Bagh","Kailash Colony","Kalkaji Mandir","Kanhaiya Nagar","Karkarduma","Karol Bagh","Kashmere Gate","Kaushambhi","Keshav Puram","Khan Market","Kirti Nagar","Kohat Enclave","Lajpat Nagar","Laxmi Nagar","MG Road","Madipur","Malviya Nagar","Mandi House","Mansarover Park","Mayur Vihar","Mayur Vihar Extn","Mewala Maharajpur","Model town","Mohan Estate","Moolchand","Moti Nagar","Mundka","NHPC Chowk","Nangloi","Nangloi Railway Stadium","Nawada","Neelam Chowk","Nehru Place","Netaji Subhash Place","New Ashok Nagar","New Delhi","Nirman Vihar","Noida Sec 15","Noida Sec 16","Noida Sector 18","Okhla","Old Faridabad","Paschim Vihar East","Paschim Vihar West","Patel Chowk","Patel Nagar","Peeragarhi","Pitampura","Pragati Madian","Pratap Nagar","Preet Vihar","Pulbangash","Punjabi Bagh","Qutab Minar","R.K Ashram Marg","Race Course","Rajdhani Park","Rajendra Place","Rajiv Chowk","Rajouri Garden","Ramesh Nagar","Rithala","Rohini East","Rohini West","Rohini sec 18","Saket","Samaypur Badli","Sarai","Sarita Vihar","Satguru Ram Singh Marg","Sector 28","Seelampur","Shadipur","Shahdra","Shastri Nagar","Shastri Park","Shivaji Park","Shivaji Stadium","Sikanderpur","Subhash Nagar","Sultanpur","Surajmal Stadium","Tagore Garden","Tilak Nagar","Tis Hazari","Tughlakabad","Udyog Bhawan","Udyog Nagar","Uttam Nagar East","Uttam Nagar West","Vaishali","Vidhan Sabha","Vishwavidyalaya","Welcome","Yamuna Bank"};
    String stations1[]={"HUDA City Centre","IFFCO Chowk","MG Road","Sikanderpur","Guru Dronacharya","Arjangarh","Ghitorni","Sultanpur","Chhattarpur","Qutab Minar","Saket","Malviya Nagar","Hauz Khas","Green Park","AIIMS","INA","Jor Bagh","Race Course","Udyog Bhawan","Central Secretariat","Patel Chowk","Rajiv Chowk","New Delhi","Chawri Bazaar","Chandni Chowk","Kashmere Gate","Civil Lines","Vidhan Sabha","Vishwavidyalaya","GTB Nagar","Model town","Azadpur","Adarsh Nagar","Jahangirpuri","Haiderpur","Rohini sec 18","Samaypur Badli","Dilshad Garden","Jhilmil","Mansarover Park","Shahdra","Welcome","Seelampur","Shastri Park","Tis Hazari","Pulbangash","Pratap Nagar","Shastri Nagar","Inderlok","Kanhaiya Nagar","Keshav Puram","Netaji Subhash Place","Kohat Enclave","Pitampura","Rohini East","Rohini West","Rithala","Satguru Ram Singh Marg","Ashok Park Main","Punjabi Bagh","Shivaji Park","Madipur","Paschim Vihar East","Paschim Vihar West","Peeragarhi","Udyog Nagar","Surajmal Stadium","Nangloi","Nangloi Railway Stadium","Rajdhani Park","Mundka","Dwarka Sec 21","Dwarka Sec 8","Dwarka Sec 9","Dwarka Sec 10","Dwarka Sec 11","Dwarka Sec 12","Dwarka Sec 13","Dwarka Sec 14","Dwarka","Dwarka Mor","Nawada","Uttam Nagar West","Uttam Nagar East","Janakpuri West","Janakpuri East","Tilak Nagar","Subhash Nagar","Tagore Garden","Rajouri Garden","Ramesh Nagar","Moti Nagar","Kirti Nagar","Shadipur","Patel Nagar","Rajendra Place","Karol Bagh","Jhandewalan","R.K Ashram Marg","Barakhamba Road","Mandi House","Pragati Madian","Indraprastha","Yamuna Bank","Akshardham","Mayur Vihar","Mayur Vihar Extn","New Ashok Nagar","Noida Sector 15","Noida Sec 16","Noida Sec 18","Botanical Garden","Golf Course","City Centre","Laxmi Nagar","Nirman Vihar","Preet Vihar","Karkarduma","Anand Vihar ISBT","Kaushambhi","Vaishali","Shivaji Stadium","Dhaula Kuan","Delhi Aero City Centre","IGI Airport","ITO","Janpath","Khan Market","JLN Stadium","Jangpura","Lajpat Nagar","Moolchand","Kailash Colony","Nehru Place","Kalkaji Mandir","Govind Puri","Okhla","Jasola-Apollo","Sarita Vihar","Mohan Estate","Tughlakabad","Badarpur Border","Sarai","NHPC Chowk","Mewala Maharajpur","Sector 28","Badkal Mor","Old Faridabad","Neelam Chowk","Bata Chowk","Escort Mujesar"};
    HashSet<String>set=new HashSet<String>();
    HashMap<String,Integer>color=new HashMap<String,Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare);
        dbhandle g=new dbhandle(200);
        for(int i=0;i<36;i++)
            g.addedge(i, i+1);
        for(int i=36;i>=1;i--)
            g.addedge(i,i-1);

        //RED Line : 43 is Shastri park and 44 is tis hazari 48 is inderlok 37 is dilshad garden, 56 is rithala
        for(int i=37;i<56;i++)
            g.addedge(i,i+1);
        for(int i=56;i>=38;i--)
            g.addedge(i,i-1);

        //GREEN LINE : 57 is satguru ram singh 70 is mundka
        for(int i=57;i<70;i++)
            g.addedge(i,i+1);
        for(int i=70;i>=58;i--)
            g.addedge(i,i-1);

        //BLUE LINE: 71 is dwarka sec21,92 is kirti nagar ,98 is ramakrishna ashram marg,99 barakhamba, 100 mandi house, 103 yamuna bank,113 city centre, 114 laxmi nagar, 120 Vaishali;
        for(int i=71;i<113;i++)
            if(i!=98)
                g.addedge(i,i+1);
        for(int i=113;i>=72;i--)
            if(i!=99)
                g.addedge(i,i-1);

        for(int i=114;i<120;i++)
            g.addedge(i,i+1);
        for(int i=120;i>=115;i--)
            g.addedge(i,i-1);

        //Orange Line : 121 is shivaji stadium, 124 is IGI airport
        for(int i=121;i<124;i++)
            g.addedge(i,i+1);
        for(int i=124;i>=122;i--)
            g.addedge(i,i-1);

        //Violet Line :125 is ITO,125 is janpath,126 is khan market,150 is escorts mujesar
        for(int i=125;i<150;i++)
            g.addedge(i,i+1);
        for(int i=150;i>=126;i--)
            g.addedge(i,i-1);
        for(int i=0;i<=36;i++)
            color.put(stations1[i],y);
        for(int j=37;j<=56;j++)
            color.put(stations1[j],r);
        for(int i=57;i<=70;i++)
            color.put(stations1[i],gr);
        for(int j=71;j<=120;j++)
            color.put(stations1[j],b);
        for(int j=121;j<=124;j++)
            color.put(stations1[j],o);
        for(int i=125;i<=150;i++)
            color.put(stations1[i],p);


        /* FOLLOWING ARE THE LINE JUNCTIONS*/
        set.add("Kashmere Gate");
        set.add("Inderlok");
        set.add("Kirti Nagar");
        set.add("Yamuna Bank");
        set.add("Rajiv Chowk");
        set.add("New Delhi");
        set.add("Dwarka Sector 21");
        set.add("Mandi House");
        set.add("Central Secretariat");
        g.addedge(25,43); //Kashmere Gate and shastri park//
        g.addedge(43,25);
        g.addedge(25,44); //Kashmere Gate and Tis Hazari
        g.addedge(44,25);
        g.addedge(48,58); //inderlok and APM
        g.addedge(58,48);
        g.addedge(92,57);//Kirti nagar and satguru ram singh marg
        g.addedge(57,92);
        g.addedge(103,114);//yamuna nagar and laxmi nagar
        g.addedge(114,103);
        g.addedge(21,98);//Rajiv chowk and rk ashram
        g.addedge(98,21);
        g.addedge(21,99);//rajiv chowk and barakhamba
        g.addedge(99,21);
        g.addedge(121,22);//new delhi and shivaji stadium
        g.addedge(22,121);
        g.addedge(71,124);//IGI Airport and dwarka sec 21
        g.addedge(124,71);
        g.addedge(100,125);//mandi house and ITO
        g.addedge(125,100);
        g.addedge(100,126);//mandi house and janpath
        g.addedge(126,100);
        g.addedge(126,19);//janpath and central secretariat
        g.addedge(19,126);
        g.addedge(19,127);//central secretariatc and khan market
        g.addedge(127,19);

        Bundle bundle = getIntent().getExtras();
        ArrayList<String> arr = getIntent().getStringArrayListExtra("message");
        String a=arr.get(0);
        String b=arr.get(1);
        int source=-1;
        int destination=-1;
        for(int i=0;i<stations1.length;i++)
        {
            if (a.equals(stations1[i]))
            {
                source=i;
            }
            else if(b.equals(stations1[i]))
            {
                destination=i;
            }
        }
        ArrayList<String> ans = new ArrayList<String>();
        String res="";
        if(source!=destination) {
            ans = g.BFS(source, destination);
            for (int i = 0; i < ans.size(); i++) {
                res += ans.get(i);
                fare += 5;
                duration += 2;
                if (set.contains(ans.get(i))) {
                    res += "(Interchange)";
                    fare += 2;
                    duration += 5;

                }
                res += "\n";
            }
        }
        else
        { fare=-1;
            duration=-1;
        }


        if(fare!=-1)
            Toast.makeText(getApplicationContext(), "Total fare = "+fare+" rupees", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(),"Seems like you made mistake :(",Toast.LENGTH_SHORT).show();

    }

}
