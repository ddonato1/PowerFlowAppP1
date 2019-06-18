package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Functions4buses extends AppCompatActivity {

    EditText voltage1, voltage2, voltage3, voltage4,
            angleB1, angleB2,angleB3, angleB4,
            z11,z12,z13,z14,z22,z23,z24,z33,z34, z44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions4buses);

        Intent intent = getIntent();
    }

    public void bar4MatrixFunction(){
        //input voltage vlaue
        voltage1 = findViewById(R.id.volt_1);
        voltage2 = findViewById(R.id.volt_2);
        voltage3 = findViewById(R.id.volt_3);
        voltage4 = findViewById(R.id.volt_4);
        int voltages1 = Integer.parseInt(voltage1.getText().toString());
        int voltages2 = Integer.parseInt(voltage2.getText().toString());
        int voltages3 = Integer.parseInt(voltage3.getText().toString());
        int voltages4 = Integer.parseInt(voltage4.getText().toString());


        //input angle value
        angleB1 = findViewById(R.id.Angle1);
        angleB2 = findViewById(R.id.Angle2);
        angleB3 = findViewById(R.id.Angle3);
        angleB4 = findViewById(R.id.Angle4);
        int anglesB1 = Integer.parseInt(angleB1.getText().toString());
        int anglesB2 = Integer.parseInt(angleB2.getText().toString());
        int anglesB3 = Integer.parseInt(angleB3.getText().toString());
        int anglesB4 = Integer.parseInt(angleB4.getText().toString());


        //input z values
        z11 = findViewById(R.id.Z11);
        z12 = findViewById(R.id.Z12);
        z13 = findViewById(R.id.Z13);
        z14 = findViewById(R.id.Z14);
        z22 = findViewById(R.id.Z22);
        z23 = findViewById(R.id.Z23);
        z24 = findViewById(R.id.Z24);
        z33 = findViewById(R.id.Z33);
        z34 = findViewById(R.id.Z34);
        z44 = findViewById(R.id.Z44);
        int z11A = Integer.parseInt(z11.getText().toString());
        int z12A = Integer.parseInt(z12.getText().toString());
        int z13A = Integer.parseInt(z13.getText().toString());
        int z14A = Integer.parseInt(z14.getText().toString());
        int z22A = Integer.parseInt(z22.getText().toString());
        int z23A = Integer.parseInt(z23.getText().toString());
        int z24A = Integer.parseInt(z24.getText().toString());
        int z33A = Integer.parseInt(z33.getText().toString());
        int z34A = Integer.parseInt(z34.getText().toString());
        int z44A = Integer.parseInt(z44.getText().toString());


        EditText zMatrix[][] = {
//                new android.widget.EditText[4][4];
//        zMatrix[0][0] = z11;
//        zMatrix[0][1] = z12;
//        zMatrix[0][2] = z13;
//        zMatrix[0][3] = z14;
//        zMatrix[1][0] = z12;//z21
//        zMatrix[1][1] = z22;
//        zMatrix[1][2] = z23;
//        zMatrix[1][3] = z24;
//        zMatrix[2][0] = z13;//z31
//        zMatrix[2][1] = z23;//z32
//        zMatrix[2][2] = z33;
//        zMatrix[2][3] = z34;
//        zMatrix[3][0] = z14;//z41
//        zMatrix[3][1] = z24;//z42
//        zMatrix[3][2] = z34;//z43
//        zMatrix[3][3] = z44;
//        System.out.print(zMatrix);

                {z11, z12, z13, z14},
                {z12, z22, z23, z24},
                {z13, z23, z33, z34},
                {z14, z24, z34, z44},

        };
    }
}
