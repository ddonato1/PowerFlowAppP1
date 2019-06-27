package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_4buses extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText volNum4;
    EditText iterNum;
    EditText angNum1;
    EditText angNum2;
    EditText angNum3;
    EditText angNum4;
    EditText zbus_11;
    EditText zbus_12;
    EditText zbus_13;
    EditText zbus_14;
    EditText zbus_22;
    EditText zbus_23;
    EditText zbus_24;
    EditText zbus_33;
    EditText zbus_34;
    EditText zbus_44;

    private Button nextButtonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input4buses);

        volNum1 = findViewById(R.id.volt_1);
        volNum2 = findViewById(R.id.volt_2);
        volNum3 = findViewById(R.id.volt_3);
        volNum4 = findViewById(R.id.volt_4);
        iterNum = findViewById(R.id.num_Iter);
        angNum1 = findViewById(R.id.Angle1);
        angNum2 = findViewById(R.id.Angle2);
        angNum3 = findViewById(R.id.Angle3);
        angNum4 = findViewById(R.id.Angle4);
        zbus_11 = findViewById(R.id.Z11);
        zbus_12 = findViewById(R.id.Z12);
        zbus_13 = findViewById(R.id.Z13);
        zbus_14 = findViewById(R.id.Z14);
        zbus_22 = findViewById(R.id.Z22);
        zbus_23 = findViewById(R.id.Z23);
        zbus_24 = findViewById(R.id.Z24);
        zbus_33 = findViewById(R.id.Z33);
        zbus_34 = findViewById(R.id.Z34);
        zbus_44 = findViewById(R.id.Z44);

        nextButtonZ = findViewById(R.id.nextP44B);
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
        String iterations = iterNum.getText().toString();
        String angles1 = angNum1.getText().toString();
        String angles2 = angNum2.getText().toString();
        String angles3 = angNum3.getText().toString();
        String angles4 = angNum4.getText().toString();
        String zbus11 = zbus_11.getText().toString();
        String zbus12 = zbus_12.getText().toString();
        String zbus13 = zbus_13.getText().toString();
        String zbus14 = zbus_14.getText().toString();
        String zbus21 = zbus_12.getText().toString();
        String zbus22 = zbus_22.getText().toString();
        String zbus23 = zbus_23.getText().toString();
        String zbus24 = zbus_24.getText().toString();
        String zbus31 = zbus_13.getText().toString();
        String zbus32 = zbus_23.getText().toString();
        String zbus33 = zbus_33.getText().toString();
        String zbus34 = zbus_34.getText().toString();
        String zbus41 = zbus_14.getText().toString();
        String zbus42 = zbus_24.getText().toString();
        String zbus43 = zbus_34.getText().toString();
        String zbus44 = zbus_44.getText().toString();

//        String[][] myStrings = new String[][] {{zbus_11.getText().toString(), zbus_12.getText().toString(),
//                zbus_13.getText().toString(), zbus_14.getText().toString()}, {zbus_12.getText().toString(),
//                zbus_22.getText().toString(), zbus_23.getText().toString(), zbus_24.getText().toString()},
//                {zbus_13.getText().toString(), zbus_23.getText().toString(), zbus_33.getText().toString(),
//                zbus_34.getText().toString()}, {zbus_14.getText().toString(), zbus_24.getText().toString(),
//                zbus_34.getText().toString(), zbus_44.getText().toString()}};

        Intent intent = new Intent(Input_4buses.this, Functions4buses.class);

        intent.putExtra("Voltage 1:", voltages1);
        intent.putExtra("Voltage 2:", voltages2);
        intent.putExtra("Voltage 3:", voltages3);
        intent.putExtra("Voltage 4:", voltages4);
        intent.putExtra("Iterations:", iterations);
        intent.putExtra("Angle 1:", angles1);
        intent.putExtra("Angle 2:", angles2);
        intent.putExtra("Angle 3:", angles3);
        intent.putExtra("Angle 4:", angles4);
        intent.putExtra("Zbus 11:", zbus11);
        intent.putExtra("Zbus 12:", zbus12);
        intent.putExtra("Zbus 13:", zbus13);
        intent.putExtra("Zbus 14:", zbus14);
        intent.putExtra("Zbus 21:", zbus21);
        intent.putExtra("Zbus 22:", zbus22);
        intent.putExtra("Zbus 23:", zbus23);
        intent.putExtra("Zbus 24:", zbus24);
        intent.putExtra("Zbus 31:", zbus31);
        intent.putExtra("Zbus 32:", zbus32);
        intent.putExtra("Zbus 33:", zbus33);
        intent.putExtra("Zbus 34:", zbus34);
        intent.putExtra("Zbus 41:", zbus41);
        intent.putExtra("Zbus 42:", zbus42);
        intent.putExtra("Zbus 43:", zbus43);
        intent.putExtra("Zbus 44:", zbus44);
//        intent.putExtra("Matrix:", myStrings);
        startActivity(intent);
    }
}
