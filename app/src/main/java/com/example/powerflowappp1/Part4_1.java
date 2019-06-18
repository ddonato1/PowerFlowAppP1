package com.example.powerflowappp1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Part4_1 extends AppCompatActivity {
    private Button nextBUTTON;
    //TextView mresultTV;
    String voltages1, voltages2, voltages3, voltages4, voltages5, voltages6, voltages7, iter,
            angles1, angles2,angles3, angles4, angles5, angles6, angles7,
            zbus11,zbus12,zbus13,zbus14,zbus15,zbus16,zbus17,zbus21, zbus22,zbus23,zbus24,zbus25,
            zbus26, zbus27, zbus31, zbus32, zbus33,zbus34,zbus35,zbus36,zbus37, zbus41, zbus42,
            zbus43, zbus44,zbus45, zbus46,zbus47,zbus51, zbus52, zbus53, zbus54, zbus55, zbus56,
            zbus57,zbus61, zbus62, zbus63, zbus64, zbus65, zbus66,zbus67,zbus71, zbus72, zbus73,
            zbus74, zbus75, zbus76, zbus77;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //mresultTV = findViewById(R.id.resultTV);

        nextBUTTON = findViewById(R.id.nextBUTTON);
        nextBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextBUTTON();
            }
        });

        //callingBusesInputs();

        bus3Inputs();
       // bus4Inputs();
       // bus5Inputs();
       // bus6Inputs();
       // bus7Inputs();

        /*Intent  intent1 = getIntent();
        //voltages values
        voltages1 = intent1.getStringExtra("Voltage 1:");
        voltages2 = intent1.getStringExtra("Voltage 2:");
        voltages3 = intent1.getStringExtra("Voltage 3:");

        //number of iterations
        iter = intent1.getStringExtra("Iterations:");

        //angles values
        angles1 = intent1.getStringExtra("Angle 1:");
        angles2 = intent1.getStringExtra("Angle 2:");
        angles3 = intent1.getStringExtra("Angle 3:");

        //zbus values
        zbus11 = intent1.getStringExtra("Zbus 11:");
        zbus12 = intent1.getStringExtra("Zbus 12:");
        zbus13 = intent1.getStringExtra("Zbus 13:");
        zbus21 = intent1.getStringExtra("Zbus 21:");
        zbus22 = intent1.getStringExtra("Zbus 22:");
        zbus23 = intent1.getStringExtra("Zbus 23:");
        zbus31 = intent1.getStringExtra("Zbus 31:");
        zbus32 = intent1.getStringExtra("Zbus 32:");
        zbus33 = intent1.getStringExtra("Zbus 33:");

        TextView mresultTV = findViewById(R.id.resultTV);

        mresultTV.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3
                +"\nIterations: " +iter +"\nAngles: \n" +angles1 +"\n" +angles2 +"\n" +angles3
                +"\nZbuses: \n" +zbus11 +"\n" +zbus12 +"\n" +zbus13 +"\n" +zbus21 +"\n" +zbus22
                +"\n" +zbus23 +"\n" +zbus31 +"\n" +zbus32 +"\n" +zbus33);*/

        /*Intent intent1 = getIntent();
        voltages1 = getIntent().getStringExtra("Voltage 1: ");
        voltages2 = getIntent().getStringExtra("Voltage 2: ");
        voltages3 = getIntent().getStringExtra("Voltage 3: ");
        voltages4 = getIntent().getStringExtra("Voltage 4: ");
        voltages5 = getIntent().getStringExtra("Voltage 5: ");
        voltages6 = getIntent().getStringExtra("Voltage 6: ");
        voltages7 = getIntent().getStringExtra("Voltage 7: ");

        iter = getIntent().getStringExtra("Iterations: ");

        angles1 = getIntent().getStringExtra("Angle 1: ");
        angles2 = getIntent().getStringExtra("Angle 2: ");
        angles3 = getIntent().getStringExtra("Angle 3: ");
        angles4 = getIntent().getStringExtra("Angle 4: ");
        angles5 = getIntent().getStringExtra("Angle 5: ");
        angles6 = getIntent().getStringExtra("Angle 6: ");
        angles7 = getIntent().getStringExtra("Angle 7: ");

        zbus11 = getIntent().getStringExtra("Zbus 11: ");
        zbus12 = getIntent().getStringExtra("Zbus 12: ");
        zbus13 = getIntent().getStringExtra("Zbus 13: ");
        zbus14 = getIntent().getStringExtra("Zbus 14: ");
        zbus15 = getIntent().getStringExtra("Zbus 15: ");
        zbus16 = getIntent().getStringExtra("Zbus 16: ");
        zbus17 = getIntent().getStringExtra("Zbus 17: ");
        zbus21 = getIntent().getStringExtra("Zbus 21: ");
        zbus22 = getIntent().getStringExtra("Zbus 22: ");
        zbus23 = getIntent().getStringExtra("Zbus 23: ");
        zbus24 = getIntent().getStringExtra("Zbus 24: ");
        zbus25 = getIntent().getStringExtra("Zbus 25: ");
        zbus26 = getIntent().getStringExtra("Zbus 26: ");
        zbus27 = getIntent().getStringExtra("Zbus 27: ");
        zbus31 = getIntent().getStringExtra("Zbus 31: ");
        zbus32 = getIntent().getStringExtra("Zbus 32: ");
        zbus33 = getIntent().getStringExtra("Zbus 33: ");
        zbus34 = getIntent().getStringExtra("Zbus 34: ");
        zbus35 = getIntent().getStringExtra("Zbus 35: ");
        zbus36 = getIntent().getStringExtra("Zbus 36: ");
        zbus37 = getIntent().getStringExtra("Zbus 37: ");
        zbus41 = getIntent().getStringExtra("Zbus 41: ");
        zbus42 = getIntent().getStringExtra("Zbus 42: ");
        zbus43 = getIntent().getStringExtra("Zbus 43: ");
        zbus44 = getIntent().getStringExtra("Zbus 44: ");
        zbus45 = getIntent().getStringExtra("Zbus 45: ");
        zbus46 = getIntent().getStringExtra("Zbus 46: ");
        zbus47 = getIntent().getStringExtra("Zbus 47: ");
        zbus51 = getIntent().getStringExtra("Zbus 51: ");
        zbus52 = getIntent().getStringExtra("Zbus 52: ");
        zbus53 = getIntent().getStringExtra("Zbus 53: ");
        zbus54 = getIntent().getStringExtra("Zbus 54: ");
        zbus55 = getIntent().getStringExtra("Zbus 55: ");
        zbus56 = getIntent().getStringExtra("Zbus 56: ");
        zbus57 = getIntent().getStringExtra("Zbus 57: ");
        zbus61 = getIntent().getStringExtra("Zbus 61: ");
        zbus62 = getIntent().getStringExtra("Zbus 62: ");
        zbus63 = getIntent().getStringExtra("Zbus 63: ");
        zbus64 = getIntent().getStringExtra("Zbus 64: ");
        zbus65 = getIntent().getStringExtra("Zbus 65: ");
        zbus66 = getIntent().getStringExtra("Zbus 66: ");
        zbus67 = getIntent().getStringExtra("Zbus 67: ");
        zbus71 = getIntent().getStringExtra("Zbus 71: ");
        zbus72 = getIntent().getStringExtra("Zbus 72: ");
        zbus73 = getIntent().getStringExtra("Zbus 73: ");
        zbus74 = getIntent().getStringExtra("Zbus 74: ");
        zbus75 = getIntent().getStringExtra("Zbus 75: ");
        zbus76 = getIntent().getStringExtra("Zbus 76: ");
        zbus77 = getIntent().getStringExtra("Zbus 77: ");

        TextView mresultTV = findViewById(R.id.resultTV);

        mresultTV.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3
                +"\nIterations: " +iter +"\nAngles: \n" +angles1 +"\n" +angles2 +"\n" +angles3
                +"\nZbuses: \n" +zbus11 +"\n" +zbus12 +"\n" +zbus13 +"\n" +zbus21 +"\n" +zbus22
                +"\n" +zbus23 +"\n" +zbus31 +"\n" +zbus32 +"\n" +zbus33);*/
    }

    private void nextBUTTON(){
        Intent intent = new Intent(Part4_1.this, Functions3buses.class);
        startActivity(intent);
    }

    public void bus3Inputs(){
        Intent  intent1 = getIntent();
        //voltages values
        voltages1 = intent1.getStringExtra("Voltage 1:");
        voltages2 = intent1.getStringExtra("Voltage 2:");
        voltages3 = intent1.getStringExtra("Voltage 3:");

        //number of iterations
        iter = intent1.getStringExtra("Iterations:");

        //angles values
        angles1 = intent1.getStringExtra("Angle 1:");
        angles2 = intent1.getStringExtra("Angle 2:");
        angles3 = intent1.getStringExtra("Angle 3:");

        //zbus values
        zbus11 = intent1.getStringExtra("Zbus 11:");
        zbus12 = intent1.getStringExtra("Zbus 12:");
        zbus13 = intent1.getStringExtra("Zbus 13:");
        zbus21 = intent1.getStringExtra("Zbus 21:");
        zbus22 = intent1.getStringExtra("Zbus 22:");
        zbus23 = intent1.getStringExtra("Zbus 23:");
        zbus31 = intent1.getStringExtra("Zbus 31:");
        zbus32 = intent1.getStringExtra("Zbus 32:");
        zbus33 = intent1.getStringExtra("Zbus 33:");

        TextView displayInputs = findViewById(R.id.displayInputs);

        displayInputs.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3
                +"\nIterations: " +iter +"\nAngles: \n" +angles1 +"\n" +angles2 +"\n" +angles3
                +"\nZbuses: \n" +zbus11 +"\n" +zbus12 +"\n" +zbus13 +"\n" +zbus21 +"\n" +zbus22
                +"\n" +zbus23 +"\n" +zbus31 +"\n" +zbus32 +"\n" +zbus33);
    }

    public void bus4Inputs(){
        Intent intent1 = getIntent();
        //voltages values
        voltages1 = getIntent().getStringExtra("Voltage 1: ");
        voltages2 = getIntent().getStringExtra("Voltage 2: ");
        voltages3 = getIntent().getStringExtra("Voltage 3: ");
        voltages4 = getIntent().getStringExtra("Voltage 4: ");

        //number of iterations
        iter = getIntent().getStringExtra("Iterations: ");

        //angles values
        angles1 = getIntent().getStringExtra("Angle 1: ");
        angles2 = getIntent().getStringExtra("Angle 2: ");
        angles3 = getIntent().getStringExtra("Angle 3: ");
        angles4 = getIntent().getStringExtra("Angle 4: ");

        //zbus values
        zbus11 = getIntent().getStringExtra("Zbus 11: ");
        zbus12 = getIntent().getStringExtra("Zbus 12: ");
        zbus13 = getIntent().getStringExtra("Zbus 13: ");
        zbus14 = getIntent().getStringExtra("Zbus 14: ");
        zbus21 = getIntent().getStringExtra("Zbus 21: ");
        zbus22 = getIntent().getStringExtra("Zbus 22: ");
        zbus23 = getIntent().getStringExtra("Zbus 23: ");
        zbus24 = getIntent().getStringExtra("Zbus 24: ");
        zbus31 = getIntent().getStringExtra("Zbus 31: ");
        zbus32 = getIntent().getStringExtra("Zbus 32: ");
        zbus33 = getIntent().getStringExtra("Zbus 33: ");
        zbus34 = getIntent().getStringExtra("Zbus 34: ");
        zbus41 = getIntent().getStringExtra("Zbus 41: ");
        zbus42 = getIntent().getStringExtra("Zbus 42: ");
        zbus43 = getIntent().getStringExtra("Zbus 43: ");
        zbus44 = getIntent().getStringExtra("Zbus 44: ");

        TextView displayI = findViewById(R.id.displayInputs);

        displayI.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3 +"\n"
                +voltages4 +"\nIterations: " +iter +"\nAngles: \n" +angles1 +"\n" +angles2 +"\n"
                +angles3 +"\n" +angles4 +"\nZbuses: \n" +zbus11 +"\n" +zbus12 +"\n" +zbus13 +"\n"
                +zbus14 +"\n" +zbus21 +"\n" +zbus22 +"\n" +zbus23 +"\n" +zbus24 +"\n" +zbus31 +"\n"
                +zbus32 +"\n" +zbus33 +"\n" +zbus34 +"\n" +zbus41 +"\n" +zbus42 +"\n" +zbus43
                +"\n" +zbus44);
    }

    public void bus5Inputs(){
        Intent intent1 = getIntent();
        //voltages values
        voltages1 = getIntent().getStringExtra("Voltage 1: ");
        voltages2 = getIntent().getStringExtra("Voltage 2: ");
        voltages3 = getIntent().getStringExtra("Voltage 3: ");
        voltages4 = getIntent().getStringExtra("Voltage 4: ");
        voltages5 = getIntent().getStringExtra("Voltage 5: ");

        //number of iterations
        iter = getIntent().getStringExtra("Iterations: ");

        //angles values
        angles1 = getIntent().getStringExtra("Angle 1: ");
        angles2 = getIntent().getStringExtra("Angle 2: ");
        angles3 = getIntent().getStringExtra("Angle 3: ");
        angles4 = getIntent().getStringExtra("Angle 4: ");
        angles5 = getIntent().getStringExtra("Angle 5: ");

        //zbus values
        zbus11 = getIntent().getStringExtra("Zbus 11: ");
        zbus12 = getIntent().getStringExtra("Zbus 12: ");
        zbus13 = getIntent().getStringExtra("Zbus 13: ");
        zbus14 = getIntent().getStringExtra("Zbus 14: ");
        zbus15 = getIntent().getStringExtra("Zbus 15: ");
        zbus21 = getIntent().getStringExtra("Zbus 21: ");
        zbus22 = getIntent().getStringExtra("Zbus 22: ");
        zbus23 = getIntent().getStringExtra("Zbus 23: ");
        zbus24 = getIntent().getStringExtra("Zbus 24: ");
        zbus25 = getIntent().getStringExtra("Zbus 25: ");
        zbus31 = getIntent().getStringExtra("Zbus 31: ");
        zbus32 = getIntent().getStringExtra("Zbus 32: ");
        zbus33 = getIntent().getStringExtra("Zbus 33: ");
        zbus34 = getIntent().getStringExtra("Zbus 34: ");
        zbus35 = getIntent().getStringExtra("Zbus 35: ");
        zbus41 = getIntent().getStringExtra("Zbus 41: ");
        zbus42 = getIntent().getStringExtra("Zbus 42: ");
        zbus43 = getIntent().getStringExtra("Zbus 43: ");
        zbus44 = getIntent().getStringExtra("Zbus 44: ");
        zbus45 = getIntent().getStringExtra("Zbus 45: ");
        zbus51 = getIntent().getStringExtra("Zbus 51: ");
        zbus52 = getIntent().getStringExtra("Zbus 52: ");
        zbus53 = getIntent().getStringExtra("Zbus 53: ");
        zbus54 = getIntent().getStringExtra("Zbus 54: ");
        zbus55 = getIntent().getStringExtra("Zbus 55: ");

        TextView displayInput = findViewById(R.id.displayInputs);

        displayInput.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3 +"\n"
                +voltages4 +"\n" +voltages5 +"\nIterations: " +iter +"\nAngles: \n" +angles1
                +"\n" +angles2 +"\n" +angles3 +"\n" +angles4 +"\n" +angles5 +"\nZbuses: \n"
                +zbus11 +"\n" +zbus12 +"\n" +zbus13 +"\n" +zbus14 +"\n" +zbus15 +"\n" +zbus21
                +"\n" +zbus22 +"\n" +zbus23 +"\n" +zbus24 +"\n" +zbus25 +"\n" +zbus31 +"\n"
                +zbus32 +"\n" +zbus33 +"\n" +zbus34 +"\n" +zbus35 +"\n" +zbus41 +"\n" +zbus42
                +"\n" +zbus43 +"\n" +zbus44 +"\n" +zbus45 +"\n" +zbus51 +"\n" +zbus52 +"\n"
                +zbus53 +"\n" +zbus54 +"\n" +zbus55);
    }

    public void bus6Inputs(){
        Intent intent1 = getIntent();
        //voltages values
        voltages1 = getIntent().getStringExtra("Voltage 1: ");
        voltages2 = getIntent().getStringExtra("Voltage 2: ");
        voltages3 = getIntent().getStringExtra("Voltage 3: ");
        voltages4 = getIntent().getStringExtra("Voltage 4: ");
        voltages5 = getIntent().getStringExtra("Voltage 5: ");
        voltages6 = getIntent().getStringExtra("Voltage 6: ");

        //number of iterations
        iter = getIntent().getStringExtra("Iterations: ");

        //angles values
        angles1 = getIntent().getStringExtra("Angle 1: ");
        angles2 = getIntent().getStringExtra("Angle 2: ");
        angles3 = getIntent().getStringExtra("Angle 3: ");
        angles4 = getIntent().getStringExtra("Angle 4: ");
        angles5 = getIntent().getStringExtra("Angle 5: ");
        angles6 = getIntent().getStringExtra("Angle 6: ");

        //zbus values
        zbus11 = getIntent().getStringExtra("Zbus 11: ");
        zbus12 = getIntent().getStringExtra("Zbus 12: ");
        zbus13 = getIntent().getStringExtra("Zbus 13: ");
        zbus14 = getIntent().getStringExtra("Zbus 14: ");
        zbus15 = getIntent().getStringExtra("Zbus 15: ");
        zbus16 = getIntent().getStringExtra("Zbus 16: ");
        zbus21 = getIntent().getStringExtra("Zbus 21: ");
        zbus22 = getIntent().getStringExtra("Zbus 22: ");
        zbus23 = getIntent().getStringExtra("Zbus 23: ");
        zbus24 = getIntent().getStringExtra("Zbus 24: ");
        zbus25 = getIntent().getStringExtra("Zbus 25: ");
        zbus26 = getIntent().getStringExtra("Zbus 26: ");
        zbus31 = getIntent().getStringExtra("Zbus 31: ");
        zbus32 = getIntent().getStringExtra("Zbus 32: ");
        zbus33 = getIntent().getStringExtra("Zbus 33: ");
        zbus34 = getIntent().getStringExtra("Zbus 34: ");
        zbus35 = getIntent().getStringExtra("Zbus 35: ");
        zbus36 = getIntent().getStringExtra("Zbus 36: ");
        zbus41 = getIntent().getStringExtra("Zbus 41: ");
        zbus42 = getIntent().getStringExtra("Zbus 42: ");
        zbus43 = getIntent().getStringExtra("Zbus 43: ");
        zbus44 = getIntent().getStringExtra("Zbus 44: ");
        zbus45 = getIntent().getStringExtra("Zbus 45: ");
        zbus46 = getIntent().getStringExtra("Zbus 46: ");
        zbus51 = getIntent().getStringExtra("Zbus 51: ");
        zbus52 = getIntent().getStringExtra("Zbus 52: ");
        zbus53 = getIntent().getStringExtra("Zbus 53: ");
        zbus54 = getIntent().getStringExtra("Zbus 54: ");
        zbus55 = getIntent().getStringExtra("Zbus 55: ");
        zbus56 = getIntent().getStringExtra("Zbus 56: ");
        zbus61 = getIntent().getStringExtra("Zbus 61: ");
        zbus62 = getIntent().getStringExtra("Zbus 62: ");
        zbus63 = getIntent().getStringExtra("Zbus 63: ");
        zbus64 = getIntent().getStringExtra("Zbus 64: ");
        zbus65 = getIntent().getStringExtra("Zbus 65: ");
        zbus66 = getIntent().getStringExtra("Zbus 66: ");

        TextView displayInp = findViewById(R.id.displayInputs);

        displayInp.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3 +"\n"
                +voltages4 +"\n" +voltages5 +"\n" +voltages6 +"\nIterations: " +iter
                +"\nAngles: \n" +angles1 +"\n" +angles2 +"\n" +angles3 +"\n" +angles4 +"\n"
                +angles5 +"\n" +angles6 +"\nZbuses: \n" +zbus11 +"\n" +zbus12 +"\n" +zbus13 +"\n"
                +zbus14 +"\n" +zbus15 +"\n" +zbus16 +"\n" +zbus21 +"\n" +zbus22 +"\n" +zbus23
                +"\n" +zbus24 +"\n" +zbus25 +"\n" +zbus26 +"\n" +zbus31 +"\n" +zbus32 +"\n"
                +zbus33 +"\n" +zbus34 +"\n" +zbus35 +"\n" +zbus36 +"\n" +zbus41 +"\n" +zbus42
                +"\n" +zbus43 +"\n" +zbus44 +"\n" +zbus45 +"\n" +zbus46 +"\n" +zbus51
                +"\n" +zbus52 +"\n" +zbus53 +"\n" +zbus54 +"\n" +zbus55 +"\n" +zbus56 +"\n" +zbus61
                +"\n" +zbus62 +"\n" +zbus63 +"\n" +zbus64 +"\n" +zbus65 +"\n" +zbus66);
    }

    public void bus7Inputs(){
        Intent intent1 = getIntent();
        //voltages values
        voltages1 = getIntent().getStringExtra("Voltage 1: ");
        voltages2 = getIntent().getStringExtra("Voltage 2: ");
        voltages3 = getIntent().getStringExtra("Voltage 3: ");
        voltages4 = getIntent().getStringExtra("Voltage 4: ");
        voltages5 = getIntent().getStringExtra("Voltage 5: ");
        voltages6 = getIntent().getStringExtra("Voltage 6: ");
        voltages7 = getIntent().getStringExtra("Voltage 7: ");

        //number of iterations
        iter = getIntent().getStringExtra("Iterations: ");

        //angles values
        angles1 = getIntent().getStringExtra("Angle 1: ");
        angles2 = getIntent().getStringExtra("Angle 2: ");
        angles3 = getIntent().getStringExtra("Angle 3: ");
        angles4 = getIntent().getStringExtra("Angle 4: ");
        angles5 = getIntent().getStringExtra("Angle 5: ");
        angles6 = getIntent().getStringExtra("Angle 6: ");
        angles7 = getIntent().getStringExtra("Angle 7: ");

        //zbus values
        zbus11 = getIntent().getStringExtra("Zbus 11: ");
        zbus12 = getIntent().getStringExtra("Zbus 12: ");
        zbus13 = getIntent().getStringExtra("Zbus 13: ");
        zbus14 = getIntent().getStringExtra("Zbus 14: ");
        zbus15 = getIntent().getStringExtra("Zbus 15: ");
        zbus16 = getIntent().getStringExtra("Zbus 16: ");
        zbus17 = getIntent().getStringExtra("Zbus 17: ");
        zbus21 = getIntent().getStringExtra("Zbus 21: ");
        zbus22 = getIntent().getStringExtra("Zbus 22: ");
        zbus23 = getIntent().getStringExtra("Zbus 23: ");
        zbus24 = getIntent().getStringExtra("Zbus 24: ");
        zbus25 = getIntent().getStringExtra("Zbus 25: ");
        zbus26 = getIntent().getStringExtra("Zbus 26: ");
        zbus27 = getIntent().getStringExtra("Zbus 27: ");
        zbus31 = getIntent().getStringExtra("Zbus 31: ");
        zbus32 = getIntent().getStringExtra("Zbus 32: ");
        zbus33 = getIntent().getStringExtra("Zbus 33: ");
        zbus34 = getIntent().getStringExtra("Zbus 34: ");
        zbus35 = getIntent().getStringExtra("Zbus 35: ");
        zbus36 = getIntent().getStringExtra("Zbus 36: ");
        zbus37 = getIntent().getStringExtra("Zbus 37: ");
        zbus41 = getIntent().getStringExtra("Zbus 41: ");
        zbus42 = getIntent().getStringExtra("Zbus 42: ");
        zbus43 = getIntent().getStringExtra("Zbus 43: ");
        zbus44 = getIntent().getStringExtra("Zbus 44: ");
        zbus45 = getIntent().getStringExtra("Zbus 45: ");
        zbus46 = getIntent().getStringExtra("Zbus 46: ");
        zbus47 = getIntent().getStringExtra("Zbus 47: ");
        zbus51 = getIntent().getStringExtra("Zbus 51: ");
        zbus52 = getIntent().getStringExtra("Zbus 52: ");
        zbus53 = getIntent().getStringExtra("Zbus 53: ");
        zbus54 = getIntent().getStringExtra("Zbus 54: ");
        zbus55 = getIntent().getStringExtra("Zbus 55: ");
        zbus56 = getIntent().getStringExtra("Zbus 56: ");
        zbus57 = getIntent().getStringExtra("Zbus 57: ");
        zbus61 = getIntent().getStringExtra("Zbus 61: ");
        zbus62 = getIntent().getStringExtra("Zbus 62: ");
        zbus63 = getIntent().getStringExtra("Zbus 63: ");
        zbus64 = getIntent().getStringExtra("Zbus 64: ");
        zbus65 = getIntent().getStringExtra("Zbus 65: ");
        zbus66 = getIntent().getStringExtra("Zbus 66: ");
        zbus67 = getIntent().getStringExtra("Zbus 67: ");
        zbus71 = getIntent().getStringExtra("Zbus 71: ");
        zbus72 = getIntent().getStringExtra("Zbus 72: ");
        zbus73 = getIntent().getStringExtra("Zbus 73: ");
        zbus74 = getIntent().getStringExtra("Zbus 74: ");
        zbus75 = getIntent().getStringExtra("Zbus 75: ");
        zbus76 = getIntent().getStringExtra("Zbus 76: ");
        zbus77 = getIntent().getStringExtra("Zbus 77: ");

        TextView dInputs = findViewById(R.id.displayInputs);

        dInputs.setText("Voltages: \n" +voltages1 +"\n" +voltages2 +"\n" +voltages3 +"\n"
                +voltages4 +"\n" +voltages5 +"\n" +voltages6  +"\n" +voltages7 +"\nIterations: "
                +iter +"\nAngles: \n" +angles1 +"\n" +angles2 +"\n" +angles3 +"\n" +angles4 +"\n"
                +angles5 +"\n" +angles6 +"\n" +angles7 +"\nZbuses: \n" +zbus11 +"\n" +zbus12 +"\n"
                +zbus13 +"\n" +zbus14 +"\n" +zbus15 +"\n" +zbus16  +"\n" +zbus17 +"\n" +zbus21
                +"\n" +zbus22 +"\n" +zbus23 +"\n" +zbus24 +"\n" +zbus25 +"\n" +zbus26  +"\n"
                +zbus27 +"\n" +zbus31 +"\n" +zbus32 +"\n" +zbus33 +"\n" +zbus34 +"\n" +zbus35 +"\n"
                +zbus36 +"\n" +zbus37 +"\n" +zbus41 +"\n" +zbus42 +"\n" +zbus43 +"\n" +zbus44
                +"\n" +zbus45 +"\n" +zbus46 +"\n" +zbus47 +"\n" +zbus51 +"\n" +zbus52 +"\n" +zbus53
                +"\n" +zbus54 +"\n" +zbus55 +"\n" +zbus56 +"\n" +zbus57 +"\n" +zbus61
                +"\n" +zbus62 +"\n" +zbus63 +"\n" +zbus64 +"\n" +zbus65 +"\n" +zbus66 +"\n" +zbus67
                +"\n" +zbus71 +"\n" +zbus72 +"\n" +zbus73 +"\n" +zbus74 +"\n" +zbus75 +"\n"
                +zbus76 +"\n" +zbus77);
    }

    /*public void callingBusesInputs(View view){
        /*Button btn = null;
        if(btn == findViewById(R.id.nextP4_3B)){
            bus3Inputs();
        } else if(btn == findViewById(R.id.nextP44B)){
            bus4Inputs();
        }
        switch(view.getId()){
            case R.id.nextP4_3B:
                //Intent intent1 = getIntent();
                bus3Inputs();
                break;

            case R.id.nextP44B:
                bus4Inputs();
                break;

            case R.id.nextbZ:
                bus5Inputs();
                break;

            case R.id.nextButtonZ:
                bus6Inputs();
                break;

            case R.id.NEXTBZ:
                bus7Inputs();
                break;
        }*/
    //}
}
