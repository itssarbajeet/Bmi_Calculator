package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText eedtw , eedtf,eedti ;
        Button bbtnc;
        TextView txtre;
        LinearLayout linearl;

        eedtw=findViewById(R.id.eedtw);
        eedtf=findViewById(R.id.eedtf);
        eedti=findViewById(R.id.eedti);
        bbtnc=findViewById(R.id.bbtnc);
        txtre =findViewById(R.id.txtre);
        linearl=findViewById((R.id.linearl));

        bbtnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(eedtw.getText().toString());
                int fe = Integer.parseInt(eedtf.getText().toString());
                int in = Integer.parseInt(eedti.getText().toString());

                int inc= fe*12 + in;
                double m=(inc * 30.48)/100;
                double bmi = wt/m*m;
                if (bmi<18.5){

                    txtre.setText("YOU'RE UNDER WEIGHT");
                    linearl.setBackgroundColor(getResources().getColor(R.color.Yellow));


                }
                else if (bmi>25.5){
                    txtre.setText("YOU'RE OVER WEIGHT");
                    linearl.setBackgroundColor(getResources().getColor(R.color.Red));


                }
                else {
                    txtre.setText("YOU'RE HEALTHY");
                    linearl.setBackgroundColor(getResources().getColor(R.color.Green));


                }










            }
        });

    }
}

