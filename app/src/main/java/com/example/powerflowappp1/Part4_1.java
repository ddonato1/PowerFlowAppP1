package com.example.powerflowappp1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Part4_1 extends AppCompatActivity {
    private Button nextBUTTON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4_1);

        nextBUTTON = findViewById(R.id.nextBUTTON);
        nextBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextBUTTON();
            }
        });

        Intent intent1 = getIntent();
        String voltages1 = getIntent().getStringExtra("Voltage 1: ");
        String voltages2 = getIntent().getStringExtra("Voltage 2: ");
        String voltages3 = getIntent().getStringExtra("Voltage 3: ");
        String iter = getIntent().getStringExtra("Iterations: ");
        String angles1 = getIntent().getStringExtra("Angle 1: ");
        String angles2 = getIntent().getStringExtra("Angle 2: ");
        String angles3 = getIntent().getStringExtra("Angle 3: ");
        String zbus11 = getIntent().getStringExtra("Zbus 11: ");
        String zbus12 = getIntent().getStringExtra("Zbus 12: ");
        String zbus13 = getIntent().getStringExtra("Zbus 13: ");
        String zbus21 = getIntent().getStringExtra("Zbus 21: ");
        String zbus22 = getIntent().getStringExtra("Zbus 22: ");
        String zbus23 = getIntent().getStringExtra("Zbus 23: ");
        String zbus31 = getIntent().getStringExtra("Zbus 31: ");
        String zbus32 = getIntent().getStringExtra("Zbus 32: ");
        String zbus33 = getIntent().getStringExtra("Zbus 33: ");


        TextView mresultTV = findViewById(R.id.resultTV);

        mresultTV.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3
                +"\nIterations: " +iter +"\nAngles: \n" +angles1 +"\n" +angles2 +"\n" +angles3
                +"\nZbuses: \n" +zbus11 +"\n" +zbus12 +"\n" +zbus13 +"\n" +zbus21 +"\n" +zbus22
                +"\n" +zbus23 +"\n" +zbus31 +"\n" +zbus32 +"\n" +zbus33);

        /* Intent intent2 = getIntent();
        String voltages1 = getIntent().getStringExtra("");
        String voltages2 = getIntent().getStringExtra("");
        String voltages3 = getIntent().getStringExtra("");
        String voltages4 = getIntent().getStringExtra("");
        String iteration = getIntent().getStringExtra("");

        TextView mresultTv = findViewById(R.id.resultTV);

        mresultTv.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3
                +"\n" +voltages4 +"\nIterations: " +iteration);*/
    }

    private void nextBUTTON(){
        Intent intent = new Intent(Part4_1.this, MainActivity.class);
        startActivity(intent);
    }
}
