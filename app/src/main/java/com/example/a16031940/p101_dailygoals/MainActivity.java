package com.example.a16031940.p101_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup rg;
    RadioGroup rg1;
    RadioGroup rg2;
    EditText et;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.etTexts);
        btn = (Button)findViewById(R.id.btn);
        rg = (RadioGroup)findViewById(R.id.rg1);
        rg1 = (RadioGroup)findViewById(R.id.rg2);
        rg2 = (RadioGroup)findViewById(R.id.rg3);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        int selectedId1 = rg.getCheckedRadioButtonId();
        int selectedId2 = rg1.getCheckedRadioButtonId();
        int selectedId3 = rg2.getCheckedRadioButtonId();


        radioButton1 = (RadioButton) findViewById(selectedId1);
        radioButton2 = (RadioButton) findViewById(selectedId2);
        radioButton3 = (RadioButton) findViewById(selectedId3);

        Intent intent = new Intent(getBaseContext() , Main2Activity.class);


            if(et.getText().equals("")){
                et.setError("Please fill in");
            }else{

                intent.putExtra("r4" , et.getText().toString());

            }
            startActivity(intent);
            }
        });
    }
}
