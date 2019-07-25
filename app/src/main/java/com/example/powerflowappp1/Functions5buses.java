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
    String z11;
    String z12;
    String z13;
    String z14;
    String z15;
    String z22;
    String z23;
    String z24;
    String z25;
    String z33;
    String z34;
    String z35;
    String z44;
    String z45;
    String z55;
    String iterations;
    String angle1;
    String angle2;
    String angle3;
    String angle4;
    String angle5;

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

        String zMatrix = this.bar5MatrixFunction().toString();

        TextView mresultTV = findViewById(R.id.displayInputs);
        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
                + "\n" +voltage5 +"\n\nIterations: " +iterations +"\n\nAngles: \n" +angle1 + "\n"
                +angle2 + "\n" +angle3 + "\n" +angle4 + "\n" +angle5 + "\n\nZ Matrix: \n" + this.bar5MatrixFunction().toString());
    }

    public int[][] bar5MatrixFunction() {
        Intent intent1 = getIntent();

        //input z values
        z11 = intent1.getStringExtra("Zbus 11:");
        z12 = intent1.getStringExtra("Zbus 12:");
        z13 = intent1.getStringExtra("Zbus 13:");
        z14 = intent1.getStringExtra("Zbus 14:");
        z15 = intent1.getStringExtra("Zbus 15:");
        z22 = intent1.getStringExtra("Zbus 22:");
        z23 = intent1.getStringExtra("Zbus 23:");
        z24 = intent1.getStringExtra("Zbus 24:");
        z25 = intent1.getStringExtra("Zbus 25:");
        z33 = intent1.getStringExtra("Zbus 33:");
        z34 = intent1.getStringExtra("Zbus 34:");
        z35 = intent1.getStringExtra("Zbus 35:");
        z44 = intent1.getStringExtra("Zbus 44:");
        z45 = intent1.getStringExtra("Zbus 45:");
        z55 = intent1.getStringExtra("Zbus 55:");

//        z11 = findViewById(R.id.zbus11);
//
        int z11A = Integer.parseInt(z11);
        int z12A = Integer.parseInt(z12);
        int z13A = Integer.parseInt(z13);
        int z14A = Integer.parseInt(z14);
        int z15A = Integer.parseInt(z15);
        int z22A = Integer.parseInt(z22);
        int z23A = Integer.parseInt(z23);
        int z24A = Integer.parseInt(z24);
        int z25A = Integer.parseInt(z25);
        int z33A = Integer.parseInt(z33);
        int z34A = Integer.parseInt(z34);
        int z35A = Integer.parseInt(z35);
        int z44A = Integer.parseInt(z44);
        int z45A = Integer.parseInt(z45);
        int z55A = Integer.parseInt(z55);


        int zMatrix[][] = {
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

                {z11A, z12A, z13A, z14A, z15A},
                {z12A, z22A, z23A, z24A, z25A},
                {z13A, z23A, z33A, z34A, z35A},
                {z14A, z24A, z34A, z44A, z45A},
                {z15A, z25A, z35A, z45A, z55A},

//                System.out.print(zMatrix);
        };
        return zMatrix;
    }
}
