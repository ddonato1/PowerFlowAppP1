package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Functions7buses extends AppCompatActivity {

    String voltage1;
    String voltage2;
    String voltage3;
    String voltage4;
    String voltage5;
    String voltage6;
    String voltage7;
    EditText angleB1;
    EditText angleB2;
    EditText angleB3;
    EditText angleB4;
    EditText angleB5;
    EditText angleB6;
    EditText angleB7;
    EditText z11;
    EditText z12;
    EditText z13;
    EditText z14;
    EditText z15;
    EditText z16;
    EditText z17;
    EditText z22;
    EditText z23;
    EditText z24;
    EditText z25;
    EditText z26;
    EditText z27;
    EditText z33;
    EditText z34;
    EditText z35;
    EditText z36;
    EditText z37;
    EditText z44;
    EditText z45;
    EditText z46;
    EditText z47;
    EditText z55;
    EditText z56;
    EditText z57;
    EditText z66;
    EditText z67;
    EditText z77;
    String iterations;
    String angle1;
    String angle2;
    String angle3;
    String angle4;
    String angle5;
    String angle6;
    String angle7;
    String[] myString;
    String zbus77;
    String zbus76;
    String zbus75;
    String zbus74;
    String zbus73;
    String zbus72;
    String zbus71;
    String zbus67;
    String zbus66;
    String zbus65;
    String zbus64;
    String zbus63;
    String zbus62;
    String zbus61;
    String zbus57;
    String zbus56;
    String zbus55;
    String zbus54;
    String zbus53;
    String zbus52;
    String zbus51;
    String zbus47;
    String zbus46;
    String zbus45;
    String zbus44;
    String zbus43;
    String zbus42;
    String zbus41;
    String zbus37;
    String zbus36;
    String zbus35;
    String zbus34;
    String zbus33;
    String zbus32;
    String zbus31;
    String zbus27;
    String zbus26;
    String zbus25;
    String zbus24;
    String zbus23;
    String zbus22;
    String zbus21;
    String zbus17;
    String zbus16;
    String zbus15;
    String zbus14;
    String zbus13;
    String zbus12;
    String zbus11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions7buses);

        Intent intent =getIntent();
        voltage1 = intent.getStringExtra("Voltage 1:");
        voltage2 = intent.getStringExtra("Voltage 2:");
        voltage3 = intent.getStringExtra("Voltage 3:");
        voltage4 = intent.getStringExtra("Voltage 4:");
        voltage5 = intent.getStringExtra("Voltage 5:");
        voltage6 = intent.getStringExtra("Voltage 6:");
        voltage7 = intent.getStringExtra("Voltage 7:");
        iterations = intent.getStringExtra("Iterations:");
        angle1 = intent.getStringExtra("Angle 1:");
        angle2 = intent.getStringExtra("Angle 2:");
        angle3 = intent.getStringExtra("Angle 3:");
        angle4 = intent.getStringExtra("Angle 4:");
        angle5 = intent.getStringExtra("Angle 5:");
        angle6 = intent.getStringExtra("Angle 6:");
        angle7 = intent.getStringExtra("Angle 7:");
        myString = intent.getStringArrayExtra("Matrix:");

        TextView mresultTV = findViewById(R.id.displayInputs);
        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
                + "\n" +voltage5 + "\n" +voltage6 + "\n" + voltage7 +"\n\nIterations: " +iterations
                +"\n\nAngles: \n" +angle1 + "\n" +angle2 + "\n" +angle3 + "\n" +angle4 + "\n"
                +angle5 + "\n" +angle6 + "\n" +angle7 + "\n\nZ Matrix: \n" /*+myString*/ +bar7MatrixFunction());
    }

    public String[][] bar7MatrixFunction() {
    Intent intent = getIntent();
    zbus11 = intent.getStringExtra("Zbus 11:");
    zbus12 = intent.getStringExtra("Zbus 12:");
    zbus13 = intent.getStringExtra("Zbus 13:");
    zbus14 = intent.getStringExtra("Zbus 14:");
    zbus15 = intent.getStringExtra("Zbus 15:");
    zbus16 = intent.getStringExtra("Zbus 16:");
    zbus17 = intent.getStringExtra("Zbus 17:");
    zbus21 = intent.getStringExtra("Zbus 21:");
    zbus22 = intent.getStringExtra("Zbus 22:");
    zbus23 = intent.getStringExtra("Zbus 23:");
    zbus24 = intent.getStringExtra("Zbus 24:");
    zbus25 = intent.getStringExtra("Zbus 25:");
    zbus26 = intent.getStringExtra("Zbus 26:");
    zbus27 = intent.getStringExtra("Zbus 27:");
    zbus31 = intent.getStringExtra("Zbus 31:");
    zbus32 = intent.getStringExtra("Zbus 32:");
    zbus33 = intent.getStringExtra("Zbus 33:");
    zbus34 = intent.getStringExtra("Zbus 34:");
    zbus35 = intent.getStringExtra("Zbus 35:");
    zbus36 = intent.getStringExtra("Zbus 36:");
    zbus37 = intent.getStringExtra("Zbus 37:");
    zbus41 = intent.getStringExtra("Zbus 41:");
    zbus42 = intent.getStringExtra("Zbus 42:");
    zbus43 = intent.getStringExtra("Zbus 43:");
    zbus44 = intent.getStringExtra("Zbus 44:");
    zbus45 = intent.getStringExtra("Zbus 45:");
    zbus46 = intent.getStringExtra("Zbus 46:");
    zbus47 = intent.getStringExtra("Zbus 47:");
    zbus51 = intent.getStringExtra("Zbus 51:");
    zbus52 = intent.getStringExtra("Zbus 52:");
    zbus53 = intent.getStringExtra("Zbus 53:");
    zbus54 = intent.getStringExtra("Zbus 54:");
    zbus55 = intent.getStringExtra("Zbus 55:");
    zbus56 = intent.getStringExtra("Zbus 56:");
    zbus57 = intent.getStringExtra("Zbus 57:");
    zbus61 = intent.getStringExtra("Zbus 61:");
    zbus62 = intent.getStringExtra("Zbus 62:");
    zbus63 = intent.getStringExtra("Zbus 63:");
    zbus64 = intent.getStringExtra("Zbus 64:");
    zbus65 = intent.getStringExtra("Zbus 65:");
    zbus66 = intent.getStringExtra("Zbus 66:");
    zbus67 = intent.getStringExtra("Zbus 67:");
    zbus71 = intent.getStringExtra("Zbus 71:");
    zbus72 = intent.getStringExtra("Zbus 72:");
    zbus73 = intent.getStringExtra("Zbus 73:");
    zbus74 = intent.getStringExtra("Zbus 74:");
    zbus75 = intent.getStringExtra("Zbus 75:");
    zbus76 = intent.getStringExtra("Zbus 76:");
    zbus77 = intent.getStringExtra("Zbus 77:");
//    input voltage vlaue
//        voltage1 = findViewById(R.id.voltS1);
//        voltage2 = findViewById(R.id.voltage2);
//        voltage3 = findViewById(R.id.voltage3);
//        voltage4 = findViewById(R.id.voltage4);
//        voltage5 = findViewById(R.id.voltage5);
//        voltage6 = findViewById(R.id.voltage6);
//        voltage7 = findViewById(R.id.voltage7);
//        int voltages1 = Integer.parseInt(voltage1.getText().toString());
//        int voltages2 = Integer.parseInt(voltage2.getText().toString());
//        int voltages3 = Integer.parseInt(voltage3.getText().toString());
//        int voltages4 = Integer.parseInt(voltage4.getText().toString());
//        int voltages5 = Integer.parseInt(voltage5.getText().toString());
//        int voltages6 = Integer.parseInt(voltage6.getText().toString());
//        int voltages7 = Integer.parseInt(voltage7.getText().toString());
//
//
//        //input angle value
//        angleB1 = findViewById(R.id.ang1);
//        angleB2 = findViewById(R.id.ang2);
//        angleB3 = findViewById(R.id.ang3);
//        angleB4 = findViewById(R.id.ang4);
//        angleB5 = findViewById(R.id.ang5);
//        angleB6 = findViewById(R.id.ang6);
//        angleB7 = findViewById(R.id.ang7);
//        int anglesB1 = Integer.parseInt(angleB1.getText().toString());
//        int anglesB2 = Integer.parseInt(angleB2.getText().toString());
//        int anglesB3 = Integer.parseInt(angleB3.getText().toString());
//        int anglesB4 = Integer.parseInt(angleB4.getText().toString());
//        int anglesB5 = Integer.parseInt(angleB5.getText().toString());
//        int anglesB6 = Integer.parseInt(angleB6.getText().toString());
//        int anglesB7 = Integer.parseInt(angleB7.getText().toString());
//
//
//        //input z values
//        z11 = findViewById(R.id.ZBus11);
//        z12 = findViewById(R.id.ZBus12);
//        z13 = findViewById(R.id.ZBus13);
//        z14 = findViewById(R.id.ZBus14);
//        z15 = findViewById(R.id.ZBus15);
//        z16 = findViewById(R.id.ZBus16);
//        z17 = findViewById(R.id.ZBus17);
//        z22 = findViewById(R.id.ZBus22);
//        z23 = findViewById(R.id.ZBus23);
//        z24 = findViewById(R.id.ZBus24);
//        z25 = findViewById(R.id.ZBus25);
//        z26 = findViewById(R.id.ZBus26);
//        z27 = findViewById(R.id.ZBus27);
//        z33 = findViewById(R.id.ZBus33);
//        z34 = findViewById(R.id.ZBus34);
//        z35 = findViewById(R.id.ZBus35);
//        z36 = findViewById(R.id.ZBus36);
//        z37 = findViewById(R.id.ZBus37);
//        z44 = findViewById(R.id.ZBus44);
//        z45 = findViewById(R.id.ZBus45);
//        z46 = findViewById(R.id.ZBus46);
//        z47 = findViewById(R.id.ZBus47);
//        z55 = findViewById(R.id.ZBus55);
//        z56 = findViewById(R.id.ZBus56);
//        z57 = findViewById(R.id.ZBus57);
//        z66 = findViewById(R.id.ZBus66);
//        z67 = findViewById(R.id.ZBus67);
//        z77 = findViewById(R.id.ZBus77);
//        int z11A = Integer.parseInt(z11.getText().toString());
//        int z12A = Integer.parseInt(z12.getText().toString());
//        int z13A = Integer.parseInt(z13.getText().toString());
//        int z14A = Integer.parseInt(z14.getText().toString());
//        int z15A = Integer.parseInt(z15.getText().toString());
//        int z16A = Integer.parseInt(z16.getText().toString());
//        int z17A = Integer.parseInt(z17.getText().toString());
//        int z22A = Integer.parseInt(z22.getText().toString());
//        int z23A = Integer.parseInt(z23.getText().toString());
//        int z24A = Integer.parseInt(z24.getText().toString());
//        int z25A = Integer.parseInt(z25.getText().toString());
//        int z26A = Integer.parseInt(z26.getText().toString());
//        int z27A = Integer.parseInt(z27.getText().toString());
//        int z33A = Integer.parseInt(z33.getText().toString());
//        int z34A = Integer.parseInt(z34.getText().toString());
//        int z35A = Integer.parseInt(z35.getText().toString());
//        int z36A = Integer.parseInt(z36.getText().toString());
//        int z37A = Integer.parseInt(z37.getText().toString());
//        int z44A = Integer.parseInt(z44.getText().toString());
//        int z45A = Integer.parseInt(z45.getText().toString());
//        int z46A = Integer.parseInt(z46.getText().toString());
//        int z47A = Integer.parseInt(z47.getText().toString());
//        int z55A = Integer.parseInt(z55.getText().toString());
//        int z56A = Integer.parseInt(z56.getText().toString());
//        int z57A = Integer.parseInt(z57.getText().toString());
//        int z66A = Integer.parseInt(z66.getText().toString());
//        int z67A = Integer.parseInt(z67.getText().toString());
//        int z77A = Integer.parseInt(z77.getText().toString());
//
//
        String zMatrix[][] = {
////                new android.widget.EditText[7][7];
////        zMatrix[0][0] = zbus11;
////        zMatrix[0][1] = zbus12;
////        zMatrix[0][2] = zbus13;
////        zMatrix[0][3] = zbus14;
////        zMatrix[0][4] = zbus15;
////        zMatrix[0][5] = zbus16;
////        zMatrix[0][6] = zbus17;
////        zMatrix[1][0] = zbus21;
////        zMatrix[1][1] = zbus22;
////        zMatrix[1][2] = zbus23;
////        zMatrix[1][3] = zbus24;
////        zMatrix[1][4] = zbus25;
////        zMatrix[1][5] = zbus26;
////        zMatrix[1][6] = zbus27;
////        zMatrix[2][0] = zbus31;
////        zMatrix[2][1] = zbus32;
////        zMatrix[2][2] = zbus33;
////        zMatrix[2][3] = zbus34;
////        zMatrix[2][4] = zbus35;
////        zMatrix[2][5] = zbus36;
////        zMatrix[2][6] = zbus37;
////        zMatrix[3][0] = zbus41;
////        zMatrix[3][1] = zbus42;
////        zMatrix[3][2] = zbus43;
////        zMatrix[3][3] = zbus44;
////        zMatrix[3][4] = zbus45;
////        zMatrix[3][5] = zbus46;
////        zMatrix[3][6] = zbus47;
////        zMatrix[4][0] = zbus51;
////        zMatrix[4][1] = zbus52;
////        zMatrix[4][2] = zbus53;
////        zMatrix[4][3] = zbus54;
////        zMatrix[4][4] = zbus55;
////        zMatrix[4][5] = zbus56;
////        zMatrix[4][6] = zbus57;
////        zMatrix[5][0] = zbus61;
////        zMatrix[5][1] = zbus62;
////        zMatrix[5][2] = zbus63;
////        zMatrix[5][3] = zbus64;
////        zMatrix[5][4] = zbus65;
////        zMatrix[5][5] = zbus66;
////        zMatrix[5][6] = zbus67;
////        zMatrix[6][0] = zbus71;
////        zMatrix[6][1] = zbus72;
////        zMatrix[6][2] = zbus73;
////        zMatrix[6][3] = zbus74;
////        zMatrix[6][4] = zbus75;
////        zMatrix[6][5] = zbus76;
////        zMatrix[6][6] = zbus77;

                {zbus11, zbus12, zbus13, zbus14, zbus15, zbus16, zbus17},
                {zbus21, zbus22, zbus23, zbus24, zbus25, zbus26, zbus27},
                {zbus31, zbus32, zbus33, zbus34, zbus35, zbus36, zbus37},
                {zbus41, zbus42, zbus43, zbus44, zbus45, zbus46, zbus47},
                {zbus51, zbus52, zbus53, zbus54, zbus55, zbus56, zbus57},
                {zbus61, zbus62, zbus63, zbus64, zbus65, zbus66, zbus67},
                {zbus71, zbus72, zbus73, zbus74, zbus75, zbus76, zbus77},

//        System.out.print(zMatrix);
        };
        return zMatrix;
    }
}
