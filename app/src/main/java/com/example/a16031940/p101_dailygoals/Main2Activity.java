package com.example.a16031940.p101_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ListView lv;
    String name;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv = (ListView)findViewById(R.id.lv);
        List<String> arrayList = new ArrayList<String>();

        Intent Recieve = getIntent();

        String r1 = Recieve.getStringExtra("r1");
        String r2 = Recieve.getStringExtra("r2");
        String r3 = Recieve.getStringExtra("r3");
        String r4 = Recieve.getStringExtra("r4");

        String N1 = "";
        String N2 = "";
        String N3 = "";
        String Total = "";
        if(r1.equalsIgnoreCase("yes")){
            N1 = "I read up today's materials";
        }else{
            N1 = "I did not read up today's materials";
        }

        if(r2.equalsIgnoreCase("yes")){
            N2 = "I came on time!";
        }else{
            N2 = "I did not come on time";
        }

        if(r3.equalsIgnoreCase("yes")){
            N3 = "I attempt the problem myself";
        }else{
            N3 = "I did not attend the problem myself";
        }

        Total = N1 + ". " + N2 + ". " + N3 + ". " +  r4;


        arrayList.add(Total);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arrayList );

        lv.setAdapter(arrayAdapter);


    }
}
