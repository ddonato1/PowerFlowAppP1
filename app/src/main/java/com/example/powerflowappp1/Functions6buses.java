package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Functions6buses extends AppCompatActivity {

    String voltage1;
    String voltage2;
    String voltage3;
    String voltage4;
    String voltage5;
    String voltage6;
    EditText angleB1;
    EditText angleB2;
    EditText angleB3;
    EditText angleB4;
    EditText angleB5;
    EditText angleB6;
    EditText z11;
    EditText z12;
    EditText z13;
    EditText z14;
    EditText z15;
    EditText z16;
    EditText z22;
    EditText z23;
    EditText z24;
    EditText z25;
    EditText z26;
    EditText z33;
    EditText z34;
    EditText z35;
    EditText z36;
    EditText z44;
    EditText z45;
    EditText z46;
    EditText z55;
    EditText z56;
    EditText z66;
    String[] myString;
    String angle6;
    String angle5;
    String angle4;
    String angle3;
    String angle2;
    String angle1;
    String iterations;
    String zbus66;
    String zbus65;
    String zbus64;
    String zbus63;
    String zbus62;
    String zbus61;
    String zbus56;
    String zbus55;
    String zbus54;
    String zbus53;
    String zbus52;
    String zbus51;
    String zbus46;
    String zbus45;
    String zbus44;
    String zbus43;
    String zbus42;
    String zbus41;
    String zbus36;
    String zbus35;
    String zbus34;
    String zbus33;
    String zbus32;
    String zbus31;
    String zbus26;
    String zbus25;
    String zbus24;
    String zbus23;
    String zbus22;
    String zbus21;
    String zbus16;
    String zbus15;
    String zbus14;
    String zbus13;
    String zbus12;
    String zbus11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions6buses);

        Intent intent =getIntent();
        voltage1 = intent.getStringExtra("Voltage 1:");
        voltage2 = intent.getStringExtra("Voltage 2:");
        voltage3 = intent.getStringExtra("Voltage 3:");
        voltage4 = intent.getStringExtra("Voltage 4:");
        voltage5 = intent.getStringExtra("Voltage 5:");
        voltage6 = intent.getStringExtra("Voltage 6:");
        iterations = intent.getStringExtra("Iterations:");
        angle1 = intent.getStringExtra("Angle 1:");
        angle2 = intent.getStringExtra("Angle 2:");
        angle3 = intent.getStringExtra("Angle 3:");
        angle4 = intent.getStringExtra("Angle 4:");
        angle5 = intent.getStringExtra("Angle 5:");
        angle6 = intent.getStringExtra("Angle 6:");
        myString = intent.getStringArrayExtra("Matrix:");

        TextView mresultTV = findViewById(R.id.displayInputs);
        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
                + "\n" +voltage5 + "\n" +voltage6 +"\n\nIterations: " +iterations +"\n\nAngles: \n"
                +angle1 + "\n" +angle2 + "\n" +angle3 + "\n" +angle4 + "\n" +angle5 + "\n" +angle6 +
                "\n\nZ Matrix: \n" /*+myString*/ +bar6MatrixFunction());
    }

    public String[][] bar6MatrixFunction(){
    Intent intent = getIntent();
    zbus11 = intent.getStringExtra("Zbus 11:");
    zbus12 = intent.getStringExtra("Zbus 12:");
    zbus13 = intent.getStringExtra("Zbus 13:");
    zbus14 = intent.getStringExtra("Zbus 14:");
    zbus15 = intent.getStringExtra("Zbus 15:");
    zbus16 = intent.getStringExtra("Zbus 16:");
    zbus21 = intent.getStringExtra("Zbus 21:");
    zbus22 = intent.getStringExtra("Zbus 22:");
    zbus23 = intent.getStringExtra("Zbus 23:");
    zbus24 = intent.getStringExtra("Zbus 24:");
    zbus25 = intent.getStringExtra("Zbus 25:");
    zbus26 = intent.getStringExtra("Zbus 26:");
    zbus31 = intent.getStringExtra("Zbus 31:");
    zbus32 = intent.getStringExtra("Zbus 32:");
    zbus33 = intent.getStringExtra("Zbus 33:");
    zbus34 = intent.getStringExtra("Zbus 34:");
    zbus35 = intent.getStringExtra("Zbus 35:");
    zbus36 = intent.getStringExtra("Zbus 36:");
    zbus41 = intent.getStringExtra("Zbus 41:");
    zbus42 = intent.getStringExtra("Zbus 42:");
    zbus43 = intent.getStringExtra("Zbus 43:");
    zbus44 = intent.getStringExtra("Zbus 44:");
    zbus45 = intent.getStringExtra("Zbus 45:");
    zbus46 = intent.getStringExtra("Zbus 46:");
    zbus51 = intent.getStringExtra("Zbus 51:");
    zbus52 = intent.getStringExtra("Zbus 52:");
    zbus53 = intent.getStringExtra("Zbus 53:");
    zbus54 = intent.getStringExtra("Zbus 54:");
    zbus55 = intent.getStringExtra("Zbus 55:");
    zbus56 = intent.getStringExtra("Zbus 56:");
    zbus61 = intent.getStringExtra("Zbus 61:");
    zbus62 = intent.getStringExtra("Zbus 62:");
    zbus63 = intent.getStringExtra("Zbus 63:");
    zbus64 = intent.getStringExtra("Zbus 64:");
    zbus65 = intent.getStringExtra("Zbus 65:");
    zbus66 = intent.getStringExtra("Zbus 66:");
// input voltage vlaue
//        voltage1 = findViewById(R.id.volta1);
//        voltage2 = findViewById(R.id.volta2);
//        voltage3 = findViewById(R.id.volta3);
//        voltage4 = findViewById(R.id.volta4);
//        voltage5 = findViewById(R.id.volta5);
//        voltage6 = findViewById(R.id.volta6);
//        int voltages1 = Integer.parseInt(voltage1.getText().toString());
//        int voltages2 = Integer.parseInt(voltage2.getText().toString());
//        int voltages3 = Integer.parseInt(voltage3.getText().toString());
//        int voltages4 = Integer.parseInt(voltage4.getText().toString());
//        int voltages5 = Integer.parseInt(voltage5.getText().toString());
//        int voltages6 = Integer.parseInt(voltage6.getText().toString());
//
//        //input angle value
//        angleB1 = findViewById(R.id.angulo1);
//        angleB2 = findViewById(R.id.angulo2);
//        angleB3 = findViewById(R.id.angulo3);
//        angleB4 = findViewById(R.id.angulo4);
//        angleB5 = findViewById(R.id.angulo5);
//        angleB6 = findViewById(R.id.angulo6);
//        int anglesB1 = Integer.parseInt(angleB1.getText().toString());
//        int anglesB2 = Integer.parseInt(angleB2.getText().toString());
//        int anglesB3 = Integer.parseInt(angleB3.getText().toString());
//        int anglesB4 = Integer.parseInt(angleB4.getText().toString());
//        int anglesB5 = Integer.parseInt(angleB5.getText().toString());
//        int anglesB6 = Integer.parseInt(angleB6.getText().toString());
//
//
//        //input z values
//        z11 = findViewById(R.id.Zbus11);
//        z12 = findViewById(R.id.Zbus12);
//        z13 = findViewById(R.id.Zbus13);
//        z14 = findViewById(R.id.Zbus14);
//        z15 = findViewById(R.id.Zbus15);
//        z16 = findViewById(R.id.Zbus16);
//        z22 = findViewById(R.id.Zbus22);
//        z23 = findViewById(R.id.Zbus23);
//        z24 = findViewById(R.id.Zbus24);
//        z25 = findViewById(R.id.Zbus25);
//        z26 = findViewById(R.id.Zbus26);
//        z33 = findViewById(R.id.Zbus33);
//        z34 = findViewById(R.id.Zbus34);
//        z35 = findViewById(R.id.Zbus35);
//        z36 = findViewById(R.id.Zbus36);
//        z44 = findViewById(R.id.Zbus44);
//        z45 = findViewById(R.id.Zbus45);
//        z46 = findViewById(R.id.Zbus46);
//        z55 = findViewById(R.id.Zbus55);
//        z56 = findViewById(R.id.Zbus56);
//        z66 = findViewById(R.id.Zbus66);
//        int z11A = Integer.parseInt(z11.getText().toString());
//        int z12A = Integer.parseInt(z12.getText().toString());
//        int z13A = Integer.parseInt(z13.getText().toString());
//        int z14A = Integer.parseInt(z14.getText().toString());
//        int z15A = Integer.parseInt(z15.getText().toString());
//        int z16A = Integer.parseInt(z16.getText().toString());
//        int z22A = Integer.parseInt(z22.getText().toString());
//        int z23A = Integer.parseInt(z23.getText().toString());
//        int z24A = Integer.parseInt(z24.getText().toString());
//        int z25A = Integer.parseInt(z25.getText().toString());
//        int z26A = Integer.parseInt(z26.getText().toString());
//        int z33A = Integer.parseInt(z33.getText().toString());
//        int z34A = Integer.parseInt(z34.getText().toString());
//        int z35A = Integer.parseInt(z35.getText().toString());
//        int z36A = Integer.parseInt(z36.getText().toString());
//        int z44A = Integer.parseInt(z44.getText().toString());
//        int z45A = Integer.parseInt(z45.getText().toString());
//        int z46A = Integer.parseInt(z46.getText().toString());
//        int z55A = Integer.parseInt(z55.getText().toString());
//        int z56A = Integer.parseInt(z56.getText().toString());
//        int z66A = Integer.parseInt(z66.getText().toString());


        String zMatrix[][] = {
//                new android.widget.EditText[6][6];
//        zMatrix[0][0] = z11;
//        zMatrix[0][1] = z12;
//        zMatrix[0][2] = z13;
//        zMatrix[0][3] = z14;
//        zMatrix[0][4] = z15;
//        zMatrix[0][5] = z16;
//        zMatrix[1][0] = z12;//z21
//        zMatrix[1][1] = z22;
//        zMatrix[1][2] = z23;
//        zMatrix[1][3] = z24;
//        zMatrix[1][4] = z25;
//        zMatrix[1][5] = z26;
//        zMatrix[2][0] = z13;//z31
//        zMatrix[2][1] = z23;//z32
//        zMatrix[2][2] = z33;
//        zMatrix[2][3] = z34;
//        zMatrix[2][4] = z35;
//        zMatrix[2][5] = z36;
//        zMatrix[3][0] = z14;//z41
//        zMatrix[3][1] = z24;//z42
//        zMatrix[3][2] = z34;//z43
//        zMatrix[3][3] = z44;
//        zMatrix[3][4] = z45;
//        zMatrix[3][5] = z46;
//        zMatrix[4][0] = z15;//z51
//        zMatrix[4][1] = z25;//z52
//        zMatrix[4][2] = z35;//z53
//        zMatrix[4][3] = z45;//z54
//        zMatrix[4][4] = z55;
//        zMatrix[4][5] = z56;
//        zMatrix[5][0] = z16;//z61
//        zMatrix[5][1] = z26;//z62
//        zMatrix[5][2] = z36;//z63
//        zMatrix[5][3] = z46;//z64
//        zMatrix[5][4] = z56;//z65
//        zMatrix[5][5] = z66;

//                System.out.print(zMatrix);
                {zbus11, zbus12, zbus13, zbus14, zbus15, zbus16},
                {zbus22, zbus22, zbus23, zbus24, zbus25, zbus26},
                {zbus32, zbus32, zbus33, zbus34, zbus35, zbus36},
                {zbus41, zbus42, zbus43, zbus44, zbus45, zbus46},
                {zbus51, zbus52, zbus53, zbus54, zbus55, zbus56},
                {zbus61, zbus62, zbus63, zbus64, zbus65, zbus66},
        };
        return zMatrix;
    }
}
