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
    String z11;
    String z12;
    String z13;
    String z14;
    String z15;
    String z16;
    String z22;
    String z23;
    String z24;
    String z25;
    String z26;
    String z33;
    String z34;
    String z35;
    String z36;
    String z44;
    String z45;
    String z46;
    String z55;
    String z56;
    String z66;
    String[] myString;
    String angle6;
    String angle5;
    String angle4;
    String angle3;
    String angle2;
    String angle1;
    String iterations;

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
                "\n\nZ Matrix: \n" +myString);
    }

    public String bar6MatrixFunction(){
      Intent intent1 = getIntent();

        //input z values
        z11 = intent1.getStringExtra("Zbus 11 :");
        z12 = intent1.getStringExtra("Zbus 12 :");
        z13 = intent1.getStringExtra("Zbus 13 :");
        z14 = intent1.getStringExtra("Zbus 14 :");
        z15 = intent1.getStringExtra("Zbus 15 :");
        z16 = intent1.getStringExtra("Zbus 16 :");
        z22 = intent1.getStringExtra("Zbus 22 :");
        z23 = intent1.getStringExtra("Zbus 23 :");
        z24 = intent1.getStringExtra("Zbus 24 :");
        z25 = intent1.getStringExtra("Zbus 25 :");
        z26 = intent1.getStringExtra("Zbus 26 :");
        z33 = intent1.getStringExtra("Zbus 33 :");
        z34 = intent1.getStringExtra("Zbus 34 :");
        z35 = intent1.getStringExtra("Zbus 35 :");
        z36 = intent1.getStringExtra("Zbus 36 :");
        z44 = intent1.getStringExtra("Zbus 44 :");
        z45 = intent1.getStringExtra("Zbus 45 :");
        z46 = intent1.getStringExtra("Zbus 46 :");
        z55 = intent1.getStringExtra("Zbus 55 :");
        z56 = intent1.getStringExtra("Zbus 56 :");
        z66 = intent1.getStringExtra("Zbus 66 :");
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
                {z11, z12, z13, z14, z15, z16},
                {z12, z22, z23, z24, z25, z26},
                {z13, z23, z33, z34, z35, z36},
                {z14, z24, z34, z44, z45, z46},
                {z15, z25, z35, z45, z55, z56},
                {z16, z26, z36, z46, z56, z66},
        };
        return zMatrix.toString();
    }
}
