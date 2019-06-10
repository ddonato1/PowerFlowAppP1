package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Part4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4_1);

        Intent intent = getIntent();
        String voltage1 = getIntent().getStringExtra("Voltage 1: ");
        String voltage2 = getIntent().getStringExtra("Voltage 2: ");
        String voltage3 = getIntent().getStringExtra("Voltage 3: ");
        String iter = getIntent().getStringExtra("Iterations: ");

        TextView mresultTV = findViewById(R.id.resultTV);

        mresultTV.setText("Voltage 1: " +voltage1 +"\nVoltage 2: " +voltage2 +"\nVoltage 3: " +voltage3
                +"\nIterations: " +iter);

        Intent intent2 = getIntent();
        String voltages1 = getIntent().getStringExtra("Voltage 1: ");
        String voltages2 = getIntent().getStringExtra("Voltage 2: ");
        String voltages3 = getIntent().getStringExtra("Voltage 3: ");
        String voltages4 = getIntent().getStringExtra("Voltage 4: ");
        String iteration = getIntent().getStringExtra("Iterations: ");

        mresultTV.setText("Voltage 1: " +voltages1 +"\nVoltage 2: " +voltages2 +"\nVoltage 3: " +voltages3
                +"\nVoltage 4: " +voltages4 +"\nIterations: " +iter);
    }
}
