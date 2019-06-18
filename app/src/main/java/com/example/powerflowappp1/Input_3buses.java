package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_3buses extends AppCompatActivity{
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText iterNum;
    EditText angNum1;
    EditText angNum2;
    EditText angNum3;
    EditText zbus_11;
    EditText zbus_12;
    EditText zbus_13;
    EditText zbus_22;
    EditText zbus_23;
    EditText zbus_33;

    Button nextButtonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input3buses);

        volNum1 = findViewById(R.id.volt1);
        volNum2 = findViewById(R.id.volt2);
        volNum3 = findViewById(R.id.volt3);
        iterNum = findViewById(R.id.NUMIter);
        angNum1 = findViewById(R.id.angle1);
        angNum2 = findViewById(R.id.angle2);
        angNum3 = findViewById(R.id.angle3);
        zbus_11 = findViewById(R.id.z11);
        zbus_12 = findViewById(R.id.z12);
        zbus_13 = findViewById(R.id.z13);
        zbus_22 = findViewById(R.id.z22);
        zbus_23 = findViewById(R.id.z23);
        zbus_33 = findViewById(R.id.z33);

        nextButtonZ = findViewById(R.id.nextP4_3B);
        nextButtonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nextButtonZ();
                String voltages1 = volNum1.getText().toString();
                String voltages2 = volNum2.getText().toString();
                String voltages3 = volNum3.getText().toString();
                String iterations = iterNum.getText().toString();
                String angles1 = angNum1.getText().toString();
                String angles2 = angNum2.getText().toString();
                String angles3 = angNum3.getText().toString();
                String zbus11 = zbus_11.getText().toString();
                String zbus12 = zbus_12.getText().toString();
                String zbus13 = zbus_13.getText().toString();
                String zbus21 = zbus_12.getText().toString();
                String zbus22 = zbus_22.getText().toString();
                String zbus23 = zbus_23.getText().toString();
                String zbus31 = zbus_13.getText().toString();
                String zbus32 = zbus_23.getText().toString();
                String zbus33 = zbus_33.getText().toString();

                Intent intent = new Intent(Input_3buses.this, Part4_1.class);

                intent.putExtra("Voltage 1:", voltages1);
                intent.putExtra("Voltage 2:", voltages2);
                intent.putExtra("Voltage 3:", voltages3);
                intent.putExtra("Iterations:", iterations);
                intent.putExtra("Angle 1:", angles1);
                intent.putExtra("Angle 2:", angles2);
                intent.putExtra("Angle 3:", angles3);
                intent.putExtra("Zbus 11:", zbus11);
                intent.putExtra("Zbus 12:", zbus12);
                intent.putExtra("Zbus 13:", zbus13);
                intent.putExtra("Zbus 21:", zbus21);
                intent.putExtra("Zbus 22:", zbus22);
                intent.putExtra("Zbus 23:", zbus23);
                intent.putExtra("Zbus 31:", zbus31);
                intent.putExtra("Zbus 32:", zbus32);
                intent.putExtra("Zbus 33:", zbus33);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
    }

    /*public void nextButtonZ(){
        //Intent intent = new Intent(Input_3buses.this, Part4_1.class);
        //startActivity(intent);
        String voltages1 = volNum1.getText().toString();
        String voltages2 = volNum2.getText().toString();
        String voltages3 = volNum3.getText().toString();
        String iterations = iterNum.getText().toString();
        String angles1 = angNum1.getText().toString();
        String angles2 = angNum2.getText().toString();
        String angles3 = angNum3.getText().toString();
        String zbus11 = zbus_11.getText().toString();
        String zbus12 = zbus_12.getText().toString();
        String zbus13 = zbus_13.getText().toString();
        String zbus21 = zbus_12.getText().toString();
        String zbus22 = zbus_22.getText().toString();
        String zbus23 = zbus_23.getText().toString();
        String zbus31 = zbus_13.getText().toString();
        String zbus32 = zbus_23.getText().toString();
        String zbus33 = zbus_33.getText().toString();

        Intent intent = new Intent(Input_3buses.this, Functions3buses.class);

        intent.putExtra("Voltage 1:", voltages1);
        intent.putExtra("Voltage 2:", voltages2);
        intent.putExtra("Voltage 3:", voltages3);
        intent.putExtra("Iterations:", iterations);
        intent.putExtra("Angle 1:", angles1);
        intent.putExtra("Angle 2:", angles2);
        intent.putExtra("Angle 3:", angles3);
        intent.putExtra("Zbus 11:", zbus11);
        intent.putExtra("Zbus 12:", zbus12);
        intent.putExtra("Zbus 13:", zbus13);
        intent.putExtra("Zbus 21:", zbus21);
        intent.putExtra("Zbus 22:", zbus22);
        intent.putExtra("Zbus 23:", zbus23);
        intent.putExtra("Zbus 31:", zbus31);
        intent.putExtra("Zbus 32:", zbus32);
        intent.putExtra("Zbus 33:", zbus33);
        startActivity(intent);
    }*/
}
