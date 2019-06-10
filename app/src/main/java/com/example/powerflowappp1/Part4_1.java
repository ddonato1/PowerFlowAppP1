package com.example.powerflowappp1;

import android.content.Intent;
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

        Intent intent = getIntent();
        String voltage1 = getIntent().getStringExtra("Voltage 1: ");
        String voltage2 = getIntent().getStringExtra("Voltage 2: ");
        String voltage3 = getIntent().getStringExtra("Voltage 3: ");
        String iter = getIntent().getStringExtra("Iterations: ");

        TextView mresultTV = findViewById(R.id.resultTV);

        mresultTV.setText("Voltage 1: " +voltage1 +"\nVoltage 2: " +voltage2 +"\nVoltage 3: " +voltage3
                +"\nIterations: " +iter);

        Intent intent2 = getIntent();
        String voltages1 = getIntent().getStringExtra("");
        String voltages2 = getIntent().getStringExtra("");
        String voltages3 = getIntent().getStringExtra("");
        String voltages4 = getIntent().getStringExtra("");
        String iteration = getIntent().getStringExtra("");

        TextView mresultTv = findViewById(R.id.resultTV);

        mresultTv.setText("Voltage 1: " +voltages1 +"\nVoltage 2: " +voltages2 +"\nVoltage 3: " +voltages3
                +"\nVoltage 4: " +voltages4 +"\nIterations: " +iteration);
    }

    private void nextBUTTON(){
        Intent intent = new Intent(Part4_1.this, MainActivity.class);
        startActivity(intent);
    }
}
