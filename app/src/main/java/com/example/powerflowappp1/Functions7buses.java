package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Functions7buses extends AppCompatActivity {

    EditText voltage1, voltage2, voltage3, voltage4, voltage5, voltage6, voltage7,
            angleB1, angleB2,angleB3, angleB4, angleB5, angleB6, angleB7,
            z11,z12,z13,z14,z15,z16,z17,z22,z23,z24,z25,z26,z27,z33,z34,z35,z36,z37, z44,z45,z46,z47,z55,z56,z57,z66,z67,z77;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions7buses);

        Intent intent =getIntent();
    }

    public void bar7MatrixFunction() {
        //input voltage vlaue
        voltage1 = findViewById(R.id.voltS1);
        voltage2 = findViewById(R.id.voltage2);
        voltage3 = findViewById(R.id.voltage3);
        voltage4 = findViewById(R.id.voltage4);
        voltage5 = findViewById(R.id.voltage5);
        voltage6 = findViewById(R.id.voltage6);
        voltage7 = findViewById(R.id.voltage7);
        int voltages1 = Integer.parseInt(voltage1.getText().toString());
        int voltages2 = Integer.parseInt(voltage2.getText().toString());
        int voltages3 = Integer.parseInt(voltage3.getText().toString());
        int voltages4 = Integer.parseInt(voltage4.getText().toString());
        int voltages5 = Integer.parseInt(voltage5.getText().toString());
        int voltages6 = Integer.parseInt(voltage6.getText().toString());
        int voltages7 = Integer.parseInt(voltage7.getText().toString());


        //input angle value
        angleB1 = findViewById(R.id.ang1);
        angleB2 = findViewById(R.id.ang2);
        angleB3 = findViewById(R.id.ang3);
        angleB4 = findViewById(R.id.ang4);
        angleB5 = findViewById(R.id.ang5);
        angleB6 = findViewById(R.id.ang6);
        angleB7 = findViewById(R.id.ang7);
        int anglesB1 = Integer.parseInt(angleB1.getText().toString());
        int anglesB2 = Integer.parseInt(angleB2.getText().toString());
        int anglesB3 = Integer.parseInt(angleB3.getText().toString());
        int anglesB4 = Integer.parseInt(angleB4.getText().toString());
        int anglesB5 = Integer.parseInt(angleB5.getText().toString());
        int anglesB6 = Integer.parseInt(angleB6.getText().toString());
        int anglesB7 = Integer.parseInt(angleB7.getText().toString());


        //input z values
        z11 = findViewById(R.id.ZBus11);
        z12 = findViewById(R.id.ZBus12);
        z13 = findViewById(R.id.ZBus13);
        z14 = findViewById(R.id.ZBus14);
        z15 = findViewById(R.id.ZBus15);
        z16 = findViewById(R.id.ZBus16);
        z17 = findViewById(R.id.ZBus17);
        z22 = findViewById(R.id.ZBus22);
        z23 = findViewById(R.id.ZBus23);
        z24 = findViewById(R.id.ZBus24);
        z25 = findViewById(R.id.ZBus25);
        z26 = findViewById(R.id.ZBus26);
        z27 = findViewById(R.id.ZBus27);
        z33 = findViewById(R.id.ZBus33);
        z34 = findViewById(R.id.ZBus34);
        z35 = findViewById(R.id.ZBus35);
        z36 = findViewById(R.id.ZBus36);
        z37 = findViewById(R.id.ZBus37);
        z44 = findViewById(R.id.ZBus44);
        z45 = findViewById(R.id.ZBus45);
        z46 = findViewById(R.id.ZBus46);
        z47 = findViewById(R.id.ZBus47);
        z55 = findViewById(R.id.ZBus55);
        z56 = findViewById(R.id.ZBus56);
        z57 = findViewById(R.id.ZBus57);
        z66 = findViewById(R.id.ZBus66);
        z67 = findViewById(R.id.ZBus67);
        z77 = findViewById(R.id.ZBus77);
        int z11A = Integer.parseInt(z11.getText().toString());
        int z12A = Integer.parseInt(z12.getText().toString());
        int z13A = Integer.parseInt(z13.getText().toString());
        int z14A = Integer.parseInt(z14.getText().toString());
        int z15A = Integer.parseInt(z15.getText().toString());
        int z16A = Integer.parseInt(z16.getText().toString());
        int z17A = Integer.parseInt(z17.getText().toString());
        int z22A = Integer.parseInt(z22.getText().toString());
        int z23A = Integer.parseInt(z23.getText().toString());
        int z24A = Integer.parseInt(z24.getText().toString());
        int z25A = Integer.parseInt(z25.getText().toString());
        int z26A = Integer.parseInt(z26.getText().toString());
        int z27A = Integer.parseInt(z27.getText().toString());
        int z33A = Integer.parseInt(z33.getText().toString());
        int z34A = Integer.parseInt(z34.getText().toString());
        int z35A = Integer.parseInt(z35.getText().toString());
        int z36A = Integer.parseInt(z36.getText().toString());
        int z37A = Integer.parseInt(z37.getText().toString());
        int z44A = Integer.parseInt(z44.getText().toString());
        int z45A = Integer.parseInt(z45.getText().toString());
        int z46A = Integer.parseInt(z46.getText().toString());
        int z47A = Integer.parseInt(z47.getText().toString());
        int z55A = Integer.parseInt(z55.getText().toString());
        int z56A = Integer.parseInt(z56.getText().toString());
        int z57A = Integer.parseInt(z57.getText().toString());
        int z66A = Integer.parseInt(z66.getText().toString());
        int z67A = Integer.parseInt(z67.getText().toString());
        int z77A = Integer.parseInt(z77.getText().toString());


        EditText zMatrix[][] = {
//                new android.widget.EditText[7][7];
//        zMatrix[0][0] = z11;
//        zMatrix[0][1] = z12;
//        zMatrix[0][2] = z13;
//        zMatrix[0][3] = z14;
//        zMatrix[0][4] = z15;
//        zMatrix[0][5] = z16;
//        zMatrix[0][6] = z17;
//        zMatrix[1][0] = z12;//z21
//        zMatrix[1][1] = z22;
//        zMatrix[1][2] = z23;
//        zMatrix[1][3] = z24;
//        zMatrix[1][4] = z25;
//        zMatrix[1][5] = z26;
//        zMatrix[1][6] = z27;
//        zMatrix[2][0] = z13;//z31
//        zMatrix[2][1] = z23;//z32
//        zMatrix[2][2] = z33;
//        zMatrix[2][3] = z34;
//        zMatrix[2][4] = z35;
//        zMatrix[2][5] = z36;
//        zMatrix[2][6] = z37;
//        zMatrix[3][0] = z14;//z41
//        zMatrix[3][1] = z24;//z42
//        zMatrix[3][2] = z34;//z43
//        zMatrix[3][3] = z44;
//        zMatrix[3][4] = z45;
//        zMatrix[3][5] = z46;
//        zMatrix[3][6] = z47;
//        zMatrix[4][0] = z15;//z51
//        zMatrix[4][1] = z25;//z52
//        zMatrix[4][2] = z35;//z53
//        zMatrix[4][3] = z45;//z54
//        zMatrix[4][4] = z55;
//        zMatrix[4][5] = z56;
//        zMatrix[4][6] = z57;
//        zMatrix[5][0] = z16;//z61
//        zMatrix[5][1] = z26;//z62
//        zMatrix[5][2] = z36;//z63
//        zMatrix[5][3] = z46;//z64
//        zMatrix[5][4] = z56;//z65
//        zMatrix[5][5] = z66;
//        zMatrix[5][6] = z67;
//        zMatrix[6][0] = z17;//z71
//        zMatrix[6][1] = z27;//z72
//        zMatrix[6][2] = z37;//z73
//        zMatrix[6][3] = z47;//z74
//        zMatrix[6][4] = z57;//z75
//        zMatrix[6][5] = z67;//z76
//        zMatrix[6][6] = z77;

                {z11, z12, z13, z14, z15, z16, z17},
                {z12, z22, z23, z24, z25, z26, z27},
                {z13, z23, z33, z34, z35, z36, z37},
                {z14, z24, z34, z44, z45, z46, z47},
                {z15, z25, z35, z45, z55, z56, z57},
                {z16, z26, z36, z46, z56, z66, z67},
                {z17, z27, z37, z47, z57, z67, z77},

//        System.out.print(zMatrix);
        };
    }
}
