package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_5buses extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText volNum4;
    EditText volNum5;
    EditText iterNum;
    EditText angNum1;
    EditText angNum2;
    EditText angNum3;
    EditText angNum4;
    EditText angNum5;
    EditText zbus_11;
    EditText zbus_12;
    EditText zbus_13;
    EditText zbus_14;
    EditText zbus_15;
    EditText zbus_22;
    EditText zbus_23;
    EditText zbus_24;
    EditText zbus_25;
    EditText zbus_33;
    EditText zbus_34;
    EditText zbus_35;
    EditText zbus_44;
    EditText zbus_45;
    EditText zbus_55;
    private Button nextButtonZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input5buses);

        volNum1 = findViewById(R.id.Voltage1slack);
        volNum2 = findViewById(R.id.Voltage2);
        volNum3 = findViewById(R.id.Voltage3);
        volNum4 = findViewById(R.id.Voltage4);
        volNum5 = findViewById(R.id.Voltage5);
        iterNum = findViewById(R.id.iterNUM1);
        angNum1 = findViewById(R.id.Angulo1);
        angNum2 = findViewById(R.id.Angulo2);
        angNum3 = findViewById(R.id.Angulo3);
        angNum4 = findViewById(R.id.Angulo4);
        angNum5 = findViewById(R.id.Angulo5);
        zbus_11 = findViewById(R.id.zbus11);
        zbus_12 = findViewById(R.id.zbus12);
        zbus_13 = findViewById(R.id.zbus13);
        zbus_14 = findViewById(R.id.zbus14);
        zbus_15 = findViewById(R.id.zbus15);
        zbus_22 = findViewById(R.id.zbus22);
        zbus_23 = findViewById(R.id.zbus23);
        zbus_24 = findViewById(R.id.zbus24);
        zbus_25 = findViewById(R.id.zbus25);
        zbus_33 = findViewById(R.id.zbus33);
        zbus_34 = findViewById(R.id.zbus34);
        zbus_35 = findViewById(R.id.zbus35);
        zbus_44 = findViewById(R.id.zbus44);
        zbus_45 = findViewById(R.id.zbus45);
        zbus_55 = findViewById(R.id.zbus55);

        nextButtonZ = findViewById(R.id.nextbZ);
        nextButtonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextButtonZ();
            }
        });

        Intent intent = getIntent();
    }

    private void nextButtonZ(){
        String voltages1 = volNum1.getText().toString();
        String voltages2 = volNum2.getText().toString();
        String voltages3 = volNum3.getText().toString();
        String voltages4 = volNum4.getText().toString();
        String voltages5 = volNum5.getText().toString();
        String iterations = iterNum.getText().toString();
        String angles1 = angNum1.getText().toString();
        String angles2 = angNum2.getText().toString();
        String angles3 = angNum3.getText().toString();
        String angles4 = angNum4.getText().toString();
        String angles5 = angNum5.getText().toString();
        String zbus11 = zbus_11.getText().toString();
        String zbus12 = zbus_12.getText().toString();
        String zbus13 = zbus_13.getText().toString();
        String zbus14 = zbus_14.getText().toString();
        String zbus15 = zbus_15.getText().toString();
        String zbus21 = zbus_12.getText().toString();
        String zbus22 = zbus_22.getText().toString();
        String zbus23 = zbus_23.getText().toString();
        String zbus24 = zbus_24.getText().toString();
        String zbus25 = zbus_25.getText().toString();
        String zbus31 = zbus_13.getText().toString();
        String zbus32 = zbus_23.getText().toString();
        String zbus33 = zbus_33.getText().toString();
        String zbus34 = zbus_34.getText().toString();
        String zbus35 = zbus_35.getText().toString();
        String zbus41 = zbus_14.getText().toString();
        String zbus42 = zbus_24.getText().toString();
        String zbus43 = zbus_34.getText().toString();
        String zbus44 = zbus_44.getText().toString();
        String zbus45 = zbus_45.getText().toString();
        String zbus51 = zbus_15.getText().toString();
        String zbus52 = zbus_25.getText().toString();
        String zbus53 = zbus_35.getText().toString();
        String zbus54 = zbus_45.getText().toString();
        String zbus55 = zbus_55.getText().toString();

        Intent intent = new Intent(Input_5buses.this, Functions5buses.class);

        intent.putExtra("Voltage 1:", voltages1);
        intent.putExtra("Voltage 2:", voltages2);
        intent.putExtra("Voltage 3:", voltages3);
        intent.putExtra("Voltage 4:", voltages4);
        intent.putExtra("Voltage 5:", voltages5);
        intent.putExtra("Iterations:", iterations);
        intent.putExtra("Angle 1:", angles1);
        intent.putExtra("Angle 2:", angles2);
        intent.putExtra("Angle 3:", angles3);
        intent.putExtra("Angle 4:", angles4);
        intent.putExtra("Angle 5:", angles5);
        intent.putExtra("Zbus 11:", zbus11);
        intent.putExtra("Zbus 12:", zbus12);
        intent.putExtra("Zbus 13:", zbus13);
        intent.putExtra("Zbus 14:", zbus14);
        intent.putExtra("Zbus 15:", zbus15);
        intent.putExtra("Zbus 21:", zbus21);
        intent.putExtra("Zbus 22:", zbus22);
        intent.putExtra("Zbus 23:", zbus23);
        intent.putExtra("Zbus 24:", zbus24);
        intent.putExtra("Zbus 25:", zbus25);
        intent.putExtra("Zbus 31:", zbus31);
        intent.putExtra("Zbus 32:", zbus32);
        intent.putExtra("Zbus 33:", zbus33);
        intent.putExtra("Zbus 34:", zbus34);
        intent.putExtra("Zbus 35:", zbus35);
        intent.putExtra("Zbus 41:", zbus41);
        intent.putExtra("Zbus 42:", zbus42);
        intent.putExtra("Zbus 43:", zbus43);
        intent.putExtra("Zbus 44:", zbus44);
        intent.putExtra("Zbus 45:", zbus45);
        intent.putExtra("Zbus 51:", zbus51);
        intent.putExtra("Zbus 52:", zbus52);
        intent.putExtra("Zbus 53:", zbus53);
        intent.putExtra("Zbus 54:", zbus54);
        intent.putExtra("Zbus 55:", zbus55);
        startActivity(intent);
    }
}
