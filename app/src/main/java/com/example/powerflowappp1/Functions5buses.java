package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Functions5buses extends AppCompatActivity {

    String voltage1;
    String voltage2;
    String voltage3;
    String voltage4;
    String voltage5;
    EditText angleB1;
    EditText angleB2;
    EditText angleB3;
    EditText angleB4;
    EditText angleB5;
    EditText z11;
    EditText z12;
    EditText z13;
    EditText z14;
    EditText z15;
    EditText z22;
    EditText z23;
    EditText z24;
    EditText z25;
    EditText z33;
    EditText z34;
    EditText z35;
    EditText z44;
    EditText z45;
    EditText z55;
    String iterations;
    String angle1;
    String angle2;
    String angle3;
    String angle4;
    String angle5;
    String[] myString;
    String zbus55;
    String zbus54;
    String zbus53;
    String zbus52;
    String zbus51;
    String zbus45;
    String zbus44;
    String zbus43;
    String zbus42;
    String zbus41;
    String zbus35;
    String zbus34;
    String zbus33;
    String zbus32;
    String zbus31;
    String zbus25;
    String zbus24;
    String zbus23;
    String zbus22;
    String zbus21;
    String zbus15;
    String zbus14;
    String zbus13;
    String zbus12;
    String zbus11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions5buses);

        Intent intent =getIntent();
        voltage1 = intent.getStringExtra("Voltage 1:");
        voltage2 = intent.getStringExtra("Voltage 2:");
        voltage3 = intent.getStringExtra("Voltage 3:");
        voltage4 = intent.getStringExtra("Voltage 4:");
        voltage5 = intent.getStringExtra("Voltage 5:");
        iterations = intent.getStringExtra("Iterations:");
        angle1 = intent.getStringExtra("Angle 1:");
        angle2 = intent.getStringExtra("Angle 2:");
        angle3 = intent.getStringExtra("Angle 3:");
        angle4 = intent.getStringExtra("Angle 4:");
        angle5 = intent.getStringExtra("Angle 5:");
//        zbus11 = intent.getStringExtra("Zbus 11:");
//        zbus12 = intent.getStringExtra("Zbus 12:");
//        zbus13 = intent.getStringExtra("Zbus 13:");
//        zbus14 = intent.getStringExtra("Zbus 14:");
//        zbus15 = intent.getStringExtra("Zbus 15:");
//        zbus21 = intent.getStringExtra("Zbus 21:");
//        zbus22 = intent.getStringExtra("Zbus 22:");
//        zbus23 = intent.getStringExtra("Zbus 23:");
//        zbus24 = intent.getStringExtra("Zbus 24:");
//        zbus25 = intent.getStringExtra("Zbus 25:");
//        zbus31 = intent.getStringExtra("Zbus 31:");
//        zbus32 = intent.getStringExtra("Zbus 32:");
//        zbus33 = intent.getStringExtra("Zbus 33:");
//        zbus34 = intent.getStringExtra("Zbus 34:");
//        zbus35 = intent.getStringExtra("Zbus 35:");
//        zbus41 = intent.getStringExtra("Zbus 41:");
//        zbus42 = intent.getStringExtra("Zbus 42:");
//        zbus43 = intent.getStringExtra("Zbus 43:");
//        zbus44 = intent.getStringExtra("Zbus 44:");
//        zbus45 = intent.getStringExtra("Zbus 45:");
//        zbus51 = intent.getStringExtra("Zbus 51:");
//        zbus52 = intent.getStringExtra("Zbus 52:");
//        zbus53 = intent.getStringExtra("Zbus 53:");
//        zbus54 = intent.getStringExtra("Zbus 54:");
//        zbus55 = intent.getStringExtra("Zbus 55:");
        //myString = intent.getStringArrayExtra("Matrix:");

        TextView mresultTV = findViewById(R.id.displayInputs);
        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
                + "\n" +voltage5 +"\n\nIterations: " +iterations +"\n\nAngles: \n" +angle1 + "\n"
                +angle2 + "\n" +angle3 + "\n" +angle4 + "\n" +angle5 + "\n\nZ Matrix: \n" /*+myString*/
                +bar5MatrixFunction());
    }

    public String[][] bar5MatrixFunction(){
        Intent intent = getIntent();
        zbus11 = intent.getStringExtra("Zbus 11:");
        zbus12 = intent.getStringExtra("Zbus 12:");
        zbus13 = intent.getStringExtra("Zbus 13:");
        zbus14 = intent.getStringExtra("Zbus 14:");
        zbus15 = intent.getStringExtra("Zbus 15:");
        zbus21 = intent.getStringExtra("Zbus 21:");
        zbus22 = intent.getStringExtra("Zbus 22:");
        zbus23 = intent.getStringExtra("Zbus 23:");
        zbus24 = intent.getStringExtra("Zbus 24:");
        zbus25 = intent.getStringExtra("Zbus 25:");
        zbus31 = intent.getStringExtra("Zbus 31:");
        zbus32 = intent.getStringExtra("Zbus 32:");
        zbus33 = intent.getStringExtra("Zbus 33:");
        zbus34 = intent.getStringExtra("Zbus 34:");
        zbus35 = intent.getStringExtra("Zbus 35:");
        zbus41 = intent.getStringExtra("Zbus 41:");
        zbus42 = intent.getStringExtra("Zbus 42:");
        zbus43 = intent.getStringExtra("Zbus 43:");
        zbus44 = intent.getStringExtra("Zbus 44:");
        zbus45 = intent.getStringExtra("Zbus 45:");
        zbus51 = intent.getStringExtra("Zbus 51:");
        zbus52 = intent.getStringExtra("Zbus 52:");
        zbus53 = intent.getStringExtra("Zbus 53:");
        zbus54 = intent.getStringExtra("Zbus 54:");
        zbus55 = intent.getStringExtra("Zbus 55:");
//        //input voltage vlaue
//        voltage1 = findViewById(R.id.Voltage1slack);
//        voltage2 = findViewById(R.id.Voltage2);
//        voltage3 = findViewById(R.id.Voltage3);
//        voltage4 = findViewById(R.id.Voltage4);
//        voltage5 = findViewById(R.id.Voltage5);
//        int voltages1 = Integer.parseInt(voltage1.getText().toString());
//        int voltages2 = Integer.parseInt(voltage2.getText().toString());
//        int voltages3 = Integer.parseInt(voltage3.getText().toString());
//        int voltages4 = Integer.parseInt(voltage4.getText().toString());
//        int voltages5 = Integer.parseInt(voltage5.getText().toString());
//
//
//        //input angle value
//        angleB1 = findViewById(R.id.Angulo1);
//        angleB2 = findViewById(R.id.Angulo2);
//        angleB3 = findViewById(R.id.Angulo3);
//        angleB4 = findViewById(R.id.Angulo4);
//        angleB5 = findViewById(R.id.Angulo5);
//        int anglesB1 = Integer.parseInt(angleB1.getText().toString());
//        int anglesB2 = Integer.parseInt(angleB2.getText().toString());
//        int anglesB3 = Integer.parseInt(angleB3.getText().toString());
//        int anglesB4 = Integer.parseInt(angleB4.getText().toString());
//        int anglesB5 = Integer.parseInt(angleB5.getText().toString());
//
//
//        //input z values
//        z11 = findViewById(R.id.zbus11);
//        z12 = findViewById(R.id.zbus12);
//        z13 = findViewById(R.id.zbus13);
//        z14 = findViewById(R.id.zbus14);
//        z15 = findViewById(R.id.zbus15);
//        z22 = findViewById(R.id.zbus22);
//        z23 = findViewById(R.id.zbus23);
//        z24 = findViewById(R.id.zbus24);
//        z25 = findViewById(R.id.zbus25);
//        z33 = findViewById(R.id.zbus33);
//        z34 = findViewById(R.id.zbus34);
//        z35 = findViewById(R.id.zbus35);
//        z44 = findViewById(R.id.zbus44);
//        z45 = findViewById(R.id.zbus45);
//        z55 = findViewById(R.id.zbus55);
//        int z11A = Integer.parseInt(z11.getText().toString());
//        int z12A = Integer.parseInt(z12.getText().toString());
//        int z13A = Integer.parseInt(z13.getText().toString());
//        int z14A = Integer.parseInt(z14.getText().toString());
//        int z15A = Integer.parseInt(z15.getText().toString());
//        int z22A = Integer.parseInt(z22.getText().toString());
//        int z23A = Integer.parseInt(z23.getText().toString());
//        int z24A = Integer.parseInt(z24.getText().toString());
//        int z25A = Integer.parseInt(z25.getText().toString());
//        int z33A = Integer.parseInt(z33.getText().toString());
//        int z34A = Integer.parseInt(z34.getText().toString());
//        int z35A = Integer.parseInt(z35.getText().toString());
//        int z44A = Integer.parseInt(z44.getText().toString());
//        int z45A = Integer.parseInt(z45.getText().toString());
//        int z55A = Integer.parseInt(z55.getText().toString());
//
//
        String zMatrix[][] = {
//                new android.widget.EditText[5][5];
//        zMatrix[0][0] = z11;
//        zMatrix[0][1] = z12;
//        zMatrix[0][2] = z13;
//        zMatrix[0][3] = z14;
//        zMatrix[0][4] = z15;
//        zMatrix[1][0] = z12;//z21
//        zMatrix[1][1] = z22;
//        zMatrix[1][2] = z23;
//        zMatrix[1][3] = z24;
//        zMatrix[1][4] = z25;
//        zMatrix[2][0] = z13;//z31
//        zMatrix[2][1] = z23;//z32
//        zMatrix[2][2] = z33;
//        zMatrix[2][3] = z34;
//        zMatrix[2][4] = z35;
//        zMatrix[3][0] = z14;//z41
//        zMatrix[3][1] = z24;//z42
//        zMatrix[3][2] = z34;//z43
//        zMatrix[3][3] = z44;
//        zMatrix[3][4] = z45;
//        zMatrix[4][0] = z15;//z51
//        zMatrix[4][1] = z25;//z52
//        zMatrix[4][2] = z35;//z53
//        zMatrix[4][3] = z45;//z54
//        zMatrix[4][4] = z55;

                {zbus11, zbus12, zbus13, zbus14, zbus15},
                {zbus21, zbus22, zbus23, zbus24, zbus25},
                {zbus31, zbus32, zbus33, zbus34, zbus35},
                {zbus41, zbus42, zbus43, zbus44, zbus45},
                {zbus51, zbus52, zbus53, zbus54, zbus55},

//                System.out.print(zMatrix);
        };
        return zMatrix;
    }
}
