package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Functions3buses extends AppCompatActivity {

     String voltage1, voltage2, voltage3, voltage4, voltage5, voltage6, voltage7,
            angleB1, angleB2,angleB3, angleB4, angleB5, angleB6, angleB7,
            z11,z12,z13,z14,z15,z16,z17,z22,z23,z24,z25,z26,z27,z33,z34,z35,z36,z37, z44,z45,z46,z47,z55,z56,z57,z66,z67,z77,
            iter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions3buses);

        Intent intent = getIntent();

        voltage1 = intent.getStringExtra("Voltage 1:");
        voltage2 = intent.getStringExtra("Voltage 2:");
        voltage3 = intent.getStringExtra("Voltage 3:");

        angleB1 = intent.getStringExtra("Angle 1:");
        angleB2 = intent.getStringExtra("Angle 2:");
        angleB3 = intent.getStringExtra("Angle 3:");

//        z11 = intent.getStringExtra("Zbus 11:");
//        z12 = intent.getStringExtra("Zbus 12:");
//        z13 = intent.getStringExtra("Zbus 13:");
//        z22 = intent.getStringExtra("Zbus 22:");
//        z23 = intent.getStringExtra("Zbus 23:");
//        z33 = intent.getStringExtra("Zbus 33:");

        iter = intent.getStringExtra("Iterations:");

        String zMatrixResult = bar3MatrixFunction();
//        Log.v("method", zMatrixResult);


        TextView input = findViewById(R.id.displayMatrix3);
        input.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3
                +"\n\nIterations: " +iter +"\n\nAngles: \n" +angleB1 + "\n" + angleB2 + "\n"
                + angleB3  + "\n\nZ Matrix: \n"+ Log.v("Method", zMatrixResult));

//        TextView input = findViewById(R.id.displayMatrix3);
//        input.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3
//                +"\n\nIterations: " +iter +"\n\nAngles: \n" +angleB1 + "\n" +angleB2 + "\n"
//                +angleB3  + "\n\nZ Matrix: \n"+ z11 + " " + z12 + " " + z13 + "\n"+
//                z12+ " " +z22+ " " +z23+ "\n" +z13+ " " + z23 + " " + z33);

    }

    public String bar3MatrixFunction(){

        Intent intent1 = getIntent();

        z11 = intent1.getStringExtra("Zbus 11:");
        z12 = intent1.getStringExtra("Zbus 12:");
        z13 = intent1.getStringExtra("Zbus 13:");
        z22 = intent1.getStringExtra("Zbus 22:");
        z23 = intent1.getStringExtra("Zbus 23:");
        z33 = intent1.getStringExtra("Zbus 33:");

        String zMatrix[][] = {
                {z11, z12, z13},
                {z12, z22, z23},
                {z13, z23, z33},

//                zMatrix[0][0] = z11;
//                zMatrix[0][1] = z12;
//                zMatrix[0][2] = z13;
//                zMatrix[1][0] = z12;//z21
//                zMatrix[1][1] = z22;
//                zMatrix[1][2] = z23;
//                zMatrix[2][0] = z13;//z31
//                zMatrix[2][1] = z23;//z32
//                zMatrix[2][2] = z33;
////        System.out.print(zMatrix);


        };



//        System.out.print(zMatrix);
//        resultIntent.putExtra("Z matrix: ", zMatrix);
//
//        setResult(RESULT_OK, resultIntent);

        return zMatrix.toString();
    }

//    public void bar4MatrixFunction(){
//        //input voltage vlaue
//        voltage1 = findViewById(R.id.volt_1);
//        voltage2 = findViewById(R.id.volt_2);
//        voltage3 = findViewById(R.id.volt_3);
//        voltage4 = findViewById(R.id.volt_4);
//
//        //input angle value
//        angleB1 = findViewById(R.id.Angle1);
//        angleB2 = findViewById(R.id.Angle2);
//        angleB3 = findViewById(R.id.Angle3);
//        angleB4 = findViewById(R.id.Angle4);
//
//        //input z values
//        z11 = findViewById(R.id.Z11);
//        z12 = findViewById(R.id.Z12);
//        z13 = findViewById(R.id.Z13);
//        z14 = findViewById(R.id.Z14);
//        z22 = findViewById(R.id.Z22);
//        z23 = findViewById(R.id.Z23);
//        z24 = findViewById(R.id.Z24);
//        z33 = findViewById(R.id.Z33);
//        z34 = findViewById(R.id.Z34);
//        z44 = findViewById(R.id.Z44);
//
//        EditText zMatrix[][] = {
////                new android.widget.EditText[4][4];
////        zMatrix[0][0] = z11;
////        zMatrix[0][1] = z12;
////        zMatrix[0][2] = z13;
////        zMatrix[0][3] = z14;
////        zMatrix[1][0] = z12;//z21
////        zMatrix[1][1] = z22;
////        zMatrix[1][2] = z23;
////        zMatrix[1][3] = z24;
////        zMatrix[2][0] = z13;//z31
////        zMatrix[2][1] = z23;//z32
////        zMatrix[2][2] = z33;
////        zMatrix[2][3] = z34;
////        zMatrix[3][0] = z14;//z41
////        zMatrix[3][1] = z24;//z42
////        zMatrix[3][2] = z34;//z43
////        zMatrix[3][3] = z44;
////        System.out.print(zMatrix);
//
//                {z11, z12, z13, z14},
//                {z12, z22, z23, z24},
//                {z13, z23, z33, z34},
//                {z14, z24, z34, z44},
//
//        };
//    }
//
//    public void bar5MatrixFunction(){
//        //input voltage vlaue
//        voltage1 = findViewById(R.id.Voltage1slack);
//        voltage2 = findViewById(R.id.Voltage2);
//        voltage3 = findViewById(R.id.Voltage3);
//        voltage4 = findViewById(R.id.Voltage4);
//        voltage5 = findViewById(R.id.Voltage5);
//
//        //input angle value
//        angleB1 = findViewById(R.id.Angulo1);
//        angleB2 = findViewById(R.id.Angulo2);
//        angleB3 = findViewById(R.id.Angulo3);
//        angleB4 = findViewById(R.id.Angulo4);
//        angleB5 = findViewById(R.id.Angulo5);
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
//
//        EditText zMatrix[][] = {
////                new android.widget.EditText[5][5];
////        zMatrix[0][0] = z11;
////        zMatrix[0][1] = z12;
////        zMatrix[0][2] = z13;
////        zMatrix[0][3] = z14;
////        zMatrix[0][4] = z15;
////        zMatrix[1][0] = z12;//z21
////        zMatrix[1][1] = z22;
////        zMatrix[1][2] = z23;
////        zMatrix[1][3] = z24;
////        zMatrix[1][4] = z25;
////        zMatrix[2][0] = z13;//z31
////        zMatrix[2][1] = z23;//z32
////        zMatrix[2][2] = z33;
////        zMatrix[2][3] = z34;
////        zMatrix[2][4] = z35;
////        zMatrix[3][0] = z14;//z41
////        zMatrix[3][1] = z24;//z42
////        zMatrix[3][2] = z34;//z43
////        zMatrix[3][3] = z44;
////        zMatrix[3][4] = z45;
////        zMatrix[4][0] = z15;//z51
////        zMatrix[4][1] = z25;//z52
////        zMatrix[4][2] = z35;//z53
////        zMatrix[4][3] = z45;//z54
////        zMatrix[4][4] = z55;
//
//                {z11, z12, z13, z14, z15},
//                {z12, z22, z23, z24, z25},
//                {z13, z23, z33, z34, z35},
//                {z14, z24, z34, z44, z45},
//                {z15, z25, z35, z45, z55},
//
////                System.out.print(zMatrix);
//        };
//    }
//
//    public void bar6MatrixFunction(){
//        //input voltage vlaue
//        voltage1 = findViewById(R.id.volta1);
//        voltage2 = findViewById(R.id.volta2);
//        voltage3 = findViewById(R.id.volta3);
//        voltage4 = findViewById(R.id.volta4);
//        voltage5 = findViewById(R.id.volta5);
//        voltage6 = findViewById(R.id.volta6);
//
//        //input angle value
//        angleB1 = findViewById(R.id.angulo1);
//        angleB2 = findViewById(R.id.angulo2);
//        angleB3 = findViewById(R.id.angulo3);
//        angleB4 = findViewById(R.id.angulo4);
//        angleB5 = findViewById(R.id.angulo5);
//        angleB6 = findViewById(R.id.angulo6);
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
//
//        EditText zMatrix[][] = {
////                new android.widget.EditText[6][6];
////        zMatrix[0][0] = z11;
////        zMatrix[0][1] = z12;
////        zMatrix[0][2] = z13;
////        zMatrix[0][3] = z14;
////        zMatrix[0][4] = z15;
////        zMatrix[0][5] = z16;
////        zMatrix[1][0] = z12;//z21
////        zMatrix[1][1] = z22;
////        zMatrix[1][2] = z23;
////        zMatrix[1][3] = z24;
////        zMatrix[1][4] = z25;
////        zMatrix[1][5] = z26;
////        zMatrix[2][0] = z13;//z31
////        zMatrix[2][1] = z23;//z32
////        zMatrix[2][2] = z33;
////        zMatrix[2][3] = z34;
////        zMatrix[2][4] = z35;
////        zMatrix[2][5] = z36;
////        zMatrix[3][0] = z14;//z41
////        zMatrix[3][1] = z24;//z42
////        zMatrix[3][2] = z34;//z43
////        zMatrix[3][3] = z44;
////        zMatrix[3][4] = z45;
////        zMatrix[3][5] = z46;
////        zMatrix[4][0] = z15;//z51
////        zMatrix[4][1] = z25;//z52
////        zMatrix[4][2] = z35;//z53
////        zMatrix[4][3] = z45;//z54
////        zMatrix[4][4] = z55;
////        zMatrix[4][5] = z56;
////        zMatrix[5][0] = z16;//z61
////        zMatrix[5][1] = z26;//z62
////        zMatrix[5][2] = z36;//z63
////        zMatrix[5][3] = z46;//z64
////        zMatrix[5][4] = z56;//z65
////        zMatrix[5][5] = z66;
//
////                System.out.print(zMatrix);
//                {z11, z12, z13, z14, z15, z16},
//                {z12, z22, z23, z24, z25, z26},
//                {z13, z23, z33, z34, z35, z36},
//                {z14, z24, z34, z44, z45, z46},
//                {z15, z25, z35, z45, z55, z56},
//                {z16, z26, z36, z46, z56, z66},
//        };
//    }

//    public void bar7MatrixFunction() {
//        //input voltage vlaue
//        voltage1 = findViewById(R.id.voltS1);
//        voltage2 = findViewById(R.id.voltage2);
//        voltage3 = findViewById(R.id.voltage3);
//        voltage4 = findViewById(R.id.voltage4);
//        voltage5 = findViewById(R.id.voltage5);
//        voltage6 = findViewById(R.id.voltage6);
//        voltage7 = findViewById(R.id.voltage7);
//
//        //input angle value
//        angleB1 = findViewById(R.id.ang1);
//        angleB2 = findViewById(R.id.ang2);
//        angleB3 = findViewById(R.id.ang3);
//        angleB4 = findViewById(R.id.ang4);
//        angleB5 = findViewById(R.id.ang5);
//        angleB6 = findViewById(R.id.ang6);
//        angleB7 = findViewById(R.id.ang7);
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
//
//        EditText zMatrix[][] = {
////                new android.widget.EditText[7][7];
////        zMatrix[0][0] = z11;
////        zMatrix[0][1] = z12;
////        zMatrix[0][2] = z13;
////        zMatrix[0][3] = z14;
////        zMatrix[0][4] = z15;
////        zMatrix[0][5] = z16;
////        zMatrix[0][6] = z17;
////        zMatrix[1][0] = z12;//z21
////        zMatrix[1][1] = z22;
////        zMatrix[1][2] = z23;
////        zMatrix[1][3] = z24;
////        zMatrix[1][4] = z25;
////        zMatrix[1][5] = z26;
////        zMatrix[1][6] = z27;
////        zMatrix[2][0] = z13;//z31
////        zMatrix[2][1] = z23;//z32
////        zMatrix[2][2] = z33;
////        zMatrix[2][3] = z34;
////        zMatrix[2][4] = z35;
////        zMatrix[2][5] = z36;
////        zMatrix[2][6] = z37;
////        zMatrix[3][0] = z14;//z41
////        zMatrix[3][1] = z24;//z42
////        zMatrix[3][2] = z34;//z43
////        zMatrix[3][3] = z44;
////        zMatrix[3][4] = z45;
////        zMatrix[3][5] = z46;
////        zMatrix[3][6] = z47;
////        zMatrix[4][0] = z15;//z51
////        zMatrix[4][1] = z25;//z52
////        zMatrix[4][2] = z35;//z53
////        zMatrix[4][3] = z45;//z54
////        zMatrix[4][4] = z55;
////        zMatrix[4][5] = z56;
////        zMatrix[4][6] = z57;
////        zMatrix[5][0] = z16;//z61
////        zMatrix[5][1] = z26;//z62
////        zMatrix[5][2] = z36;//z63
////        zMatrix[5][3] = z46;//z64
////        zMatrix[5][4] = z56;//z65
////        zMatrix[5][5] = z66;
////        zMatrix[5][6] = z67;
////        zMatrix[6][0] = z17;//z71
////        zMatrix[6][1] = z27;//z72
////        zMatrix[6][2] = z37;//z73
////        zMatrix[6][3] = z47;//z74
////        zMatrix[6][4] = z57;//z75
////        zMatrix[6][5] = z67;//z76
////        zMatrix[6][6] = z77;
//
//                {z11, z12, z13, z14, z15, z16, z17},
//                {z12, z22, z23, z24, z25, z26, z27},
//                {z13, z23, z33, z34, z35, z36, z37},
//                {z14, z24, z34, z44, z45, z46, z47},
//                {z15, z25, z35, z45, z55, z56, z57},
//                {z16, z26, z36, z46, z56, z66, z67},
//                {z17, z27, z37, z47, z57, z67, z77},
//
////        System.out.print(zMatrix);
//        };
//    }

  /*  public void calcTheYMatrix(EditText zMatrix[][]){


//        switch{
//            case MainActivity:
//                break;
//        }
    }

*/}
