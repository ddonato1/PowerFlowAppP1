package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Functions4buses extends AppCompatActivity {

    String voltage1;
    String voltage2;
    String voltage3;
    String voltage4;
    String iterations;
    String angle1;
    String angle2;
    String angle3;
    String angle4;
    ComplexNum z11,z12,z13,z14,z15,z16,z17,z22,z23,z24,z25,z26,z27,z33,z34,z35,z36,z37, z44,z45,z46,z47,z55,z56,z57,z66,z67,z77;
//    EditText angleB1;
//    EditText angleB2;
//    EditText angleB3;
//    EditText angleB4;
//    String z11;
//    String z12;
//    String z13;
//    String z14;
//    EditText z22;
//    EditText z23;
//    EditText z24;
//    EditText z33;
//    EditText z34;
//    EditText z44;
//    String[] myString;
//    String zbus44;
//    String zbus43;
//    String zbus42;
//    String zbus41;
//    String zbus34;
//    String zbus33;
//    String zbus32;
//    String zbus31;
//    String zbus24;
//    String zbus23;
//    String zbus22;
//    String zbus21;
//    String zbus14;
//    String zbus13;
//    String zbus12;
//    String zbus11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions4buses);

        Intent intent = getIntent();
        voltage1 = intent.getStringExtra("Voltage 1:");
        voltage2 = intent.getStringExtra("Voltage 2:");
        voltage3 = intent.getStringExtra("Voltage 3:");
        voltage4 = intent.getStringExtra("Voltage 4:");

        iterations = intent.getStringExtra("Iterations:");

        angle1 = intent.getStringExtra("Angle 1:");
        angle2 = intent.getStringExtra("Angle 2:");
        angle3 = intent.getStringExtra("Angle 3:");
        angle4 = intent.getStringExtra("Angle 4:");

//        zbus11 = intent.getStringExtra("Zbus 11:");
//        zbus12 = intent.getStringExtra("Zbus 12:");
//        zbus13 = intent.getStringExtra("Zbus 13:");
//        zbus14 = intent.getStringExtra("Zbus 14:");
//        zbus21 = intent.getStringExtra("Zbus 21:");
//        zbus22 = intent.getStringExtra("Zbus 22:");
//        zbus23 = intent.getStringExtra("Zbus 23:");
//        zbus24 = intent.getStringExtra("Zbus 24:");
//        zbus31 = intent.getStringExtra("Zbus 31:");
//        zbus32 = intent.getStringExtra("Zbus 32:");
//        zbus33 = intent.getStringExtra("Zbus 33:");
//        zbus34 = intent.getStringExtra("Zbus 34:");
//        zbus41 = intent.getStringExtra("Zbus 41:");
//        zbus42 = intent.getStringExtra("Zbus 42:");
//        zbus43 = intent.getStringExtra("Zbus 43:");
//        zbus44 = intent.getStringExtra("Zbus 44:");
       // myString = intent.getStringArrayExtra("Matrix:");


//        TextView mresultTV = findViewById(R.id.displayInputs);
//        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
//                +"\n\nIterations: " +iterations +"\n\nAngles: \n" +angle1 + "\n" +angle2 + "\n"
//                +angle3 + "\n" +angle4 + "\n\nZ Matrix: \n" /*+myString*/ +zbus11 +zbus12 +zbus13
//                +zbus14 + "\n" +zbus21 +zbus22 +zbus23 +zbus24 + "\n" +zbus31 +zbus32 +zbus33 +zbus34
//                + "\n" +zbus41 +zbus42 +zbus43 +zbus44);
//        TextView mresultTV = findViewById(R.id.displayInputs);
//        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
//                +"\n\nIterations: " +iterations +"\n\nAngles: \n" +angle1 + "\n" +angle2 + "\n"
//                +angle3 + "\n" +angle4 + "\n\nZ Matrix: \n" + bar4MatrixFunction());
//
////        bar4MatrixFunction();
        String z11B = intent.getStringExtra("Zbus 11:");
        String z12B = intent.getStringExtra("Zbus 12:");
        String z13B = intent.getStringExtra("Zbus 13:");
        String z14B = intent.getStringExtra("Zbus 14:");
        String z22B = intent.getStringExtra("Zbus 22:");
        String z23B = intent.getStringExtra("Zbus 23:");
        String z24B = intent.getStringExtra("Zbus 24:");
        String z33B = intent.getStringExtra("Zbus 33:");
        String z34B = intent.getStringExtra("Zbus 34:");
        String z44B = intent.getStringExtra("Zbus 44:");

        String x[] = z11B.split("\\+|j");
        String y[] = z12B.split("\\+|j");
        String z[] = z13B.split("\\+|j");
        String a[] = z14B.split("\\+|j");
        String w[] = z22B.split("\\+|j");
        String v[] = z23B.split("\\+|j");
        String c[] = z24B.split("\\+|j");
        String b[] = z33B.split("\\+|j");
        String d[] = z34B.split("\\+|j");
        String e[] = z44B.split("\\+|j");

        double z11Real = Double.parseDouble(x[0]);
        double z11Imaginary = Double.parseDouble(x[1]);

        double z12Real = Double.parseDouble(y[0]);
        double z12Imaginary = Double.parseDouble(y[1]);

        double z13Real = Double.parseDouble(z[0]);
        double z13Imaginary = Double.parseDouble(z[1]);

        double z14Real = Double.parseDouble(a[0]);
        double z14Imaginary = Double.parseDouble(a[1]);

        double z22Real = Double.parseDouble(w[0]);
        double z22Imaginary = Double.parseDouble(w[1]);

        double z23Real = Double.parseDouble(v[0]);
        double z23Imaginary = Double.parseDouble(v[1]);

        double z24Real = Double.parseDouble(c[0]);
        double z24Imaginary = Double.parseDouble(c[1]);

        double z33Real = Double.parseDouble(b[0]);
        double z33Imaginary = Double.parseDouble(b[1]);

        double z34Real = Double.parseDouble(d[0]);
        double z34Imaginary = Double.parseDouble(d[1]);

        double z44Real = Double.parseDouble(e[0]);
        double z44Imaginary = Double.parseDouble(e[1]);

        //calcs

        double y11R = 1.0/z11Real;
        double y11I = 1.0/z11Imaginary;

        double y12R = 1.0/z12Real;
        double y12I = 1.0/z12Imaginary;

        double y13R = 1.0/z13Real;
        double y13I = 1.0/z13Imaginary;

        double y14R = 1.0/z14Real;
        double y14I = 1.0/z14Imaginary;

        double y22R = 1.0/z22Real;
        double y22I = 1.0/z22Imaginary;

        double y23R = 1.0/z23Real;
        double y23I = 1.0/z23Imaginary;

        double y24R = 1.0/z24Real;
        double y24I = 1.0/z24Imaginary;

        double y33R = 1.0/z33Real;
        double y33I = 1.0/z33Imaginary;

        double y34R = 1.0/z34Real;
        double y34I = 1.0/z34Imaginary;

        double y44R = 1.0/z44Real;
        double y44I = 1.0/z44Imaginary;

        //ti 1 decimal
        DecimalFormat df = new DecimalFormat("#.#");

        String y11A = df.format(y11R) + "+" + df.format(y11I) + "j";
        String y12A = df.format(y12R) + "+" + df.format(y12I) + "j";
        String y13A = df.format(y13R) + "+" + df.format(y13I) + "j";
        String y14A = df.format(y14R) + "+" + df.format(y14I) + "j";
        String y22A = df.format(y22R) + "+" + df.format(y22I) + "j";
        String y23A = df.format(y23R) + "+" + df.format(y23I) + "j";
        String y24A = df.format(y24R) + "+" + df.format(y24I) + "j";
        String y33A = df.format(y33R) + "+" + df.format(y33I) + "j";
        String y34A = df.format(y34R) + "+" + df.format(y34I) + "j";
        String y44A = df.format(y44R) + "+" + df.format(y44I) + "j";

        TextView input = findViewById(R.id.displayMatrix4);
        input.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 + "\n" +voltage4
                +"\n\nIterations: " +iterations +"\n\nAngles: \n" +angle1 + "\n" +angle2 + "\n"
                +angle3 + "\n" +angle4  + "\n\nZ Matrix: \n"+ z11B + "  " + z12B + "  " + z13B +
                "  " + z14B + "\n"+ z12B + "  " + z22B + "  " + z23B + "  " + z24B + "\n" + z13B +
                "  " + z23B + "  " + z33B + "  " + z34B + "\n" + z14B + "  " + z24B + "  " + z34B
                + "  " + z44B + "\n\n Y Matrix: \n" + y11A + "  " + y12A + "  " + y13A + "  " +
                y14A + "\n"+ y12A +  "  "  + y22A+ "  " +y23A + "  " +y24A + "\n" + y13A + "  " +
                y23A + "  " + y33A + "  " + y34A + "\n" + y14A + "  " + y24A + "  " + y34A + "  "
                + y44A);
    }

//    public String[][] bar4MatrixFunction(){
//        String zbus[][] = new String[4][4];
//
//        TextView zBus11 = findViewById(R.id.zBUS_11);
//        TextView zBus12 = findViewById(R.id.zBUS_12);
//        TextView zBus13 = findViewById(R.id.zBUS_13);
//        TextView zBus14 = findViewById(R.id.zBUS_14);
//
//        Intent intent = getIntent();
//        zbus[0][0] = intent.getStringExtra("Zbus 11:");
//        zbus[0][1] = intent.getStringExtra("Zbus 12:");
//        zbus[0][2] = intent.getStringExtra("Zbus 13:");
//        zbus[0][3] = intent.getStringExtra("Zbus 14:");
//
//        zBus11.setText(zbus[0][0]);
//        zBus12.setText(zbus[0][1]);
//        zBus13.setText(zbus[0][2]);
//        zBus14.setText(zbus[0][3]);
//
//        return zbus;
//
////        Intent intent = getIntent();
////        zbus11 = intent.getStringExtra("Zbus 11:");
////        zbus12 = intent.getStringExtra("Zbus 12:");
////        zbus13 = intent.getStringExtra("Zbus 13:");
////        zbus14 = intent.getStringExtra("Zbus 14:");
////        zbus21 = intent.getStringExtra("Zbus 21:");
////        zbus22 = intent.getStringExtra("Zbus 22:");
////        zbus23 = intent.getStringExtra("Zbus 23:");
////        zbus24 = intent.getStringExtra("Zbus 24:");
////        zbus31 = intent.getStringExtra("Zbus 31:");
////        zbus32 = intent.getStringExtra("Zbus 32:");
////        zbus33 = intent.getStringExtra("Zbus 33:");
////        zbus34 = intent.getStringExtra("Zbus 34:");
////        zbus41 = intent.getStringExtra("Zbus 41:");
////        zbus42 = intent.getStringExtra("Zbus 42:");
////        zbus43 = intent.getStringExtra("Zbus 43:");
////        zbus44 = intent.getStringExtra("Zbus 44:");
//////        //input voltage vlaue
////////        voltage1 = findViewById(R.id.volt_1);
////////        voltage2 = findViewById(R.id.volt_2);
////////        voltage3 = findViewById(R.id.volt_3);
////////        voltage4 = findViewById(R.id.volt_4);
////////        int voltages1 = Integer.parseInt(voltage1.getText().toString());
////////        int voltages2 = Integer.parseInt(voltage2.getText().toString());
////////        int voltages3 = Integer.parseInt(voltage3.getText().toString());
////////        int voltages4 = Integer.parseInt(voltage4.getText().toString());
//////
//////
//////        //input angle value
////////        angleB1 = findViewById(R.id.Angle1);
////////        angleB2 = findViewById(R.id.Angle2);
////////        angleB3 = findViewById(R.id.Angle3);
////////        angleB4 = findViewById(R.id.Angle4);
////////        int anglesB1 = Integer.parseInt(angleB1.getText().toString());
////////        int anglesB2 = Integer.parseInt(angleB2.getText().toString());
////////        int anglesB3 = Integer.parseInt(angleB3.getText().toString());
////////        int anglesB4 = Integer.parseInt(angleB4.getText().toString());
//////
//////
//////        //input z values
////////        z11 = findViewById(R.id.Z11);
////////        z12 = findViewById(R.id.Z12);
////////        z13 = findViewById(R.id.Z13);
////////        z14 = findViewById(R.id.Z14);
////////        z22 = findViewById(R.id.Z22);
////////        z23 = findViewById(R.id.Z23);
////////        z24 = findViewById(R.id.Z24);
////////        z33 = findViewById(R.id.Z33);
////////        z34 = findViewById(R.id.Z34);
////////        z44 = findViewById(R.id.Z44);
//////        z11 = intent1.getStringExtra("Zbus11:");
//////        z12 = intent1.getStringExtra("Zbus12:");
//////        z13 = intent1.getStringExtra("Zbus13:");
//////        z14 = intent1.getStringExtra("Zbus14:");
//////
////////        int z11A = Integer.parseInt(z11.getText().toString());
////////        int z12A = Integer.parseInt(z12.getText().toString());
////////        int z13A = Integer.parseInt(z13.getText().toString());
////////        int z14A = Integer.parseInt(z14.getText().toString());
////////        int z22A = Integer.parseInt(z22.getText().toString());
////////        int z23A = Integer.parseInt(z23.getText().toString());
////////        int z24A = Integer.parseInt(z24.getText().toString());
////////        int z33A = Integer.parseInt(z33.getText().toString());
////////        int z34A = Integer.parseInt(z34.getText().toString());
////////        int z44A = Integer.parseInt(z44.getText().toString());
//////
//////
//////        String zMatrix[][] = {
////////                new android.widget.EditText[4][4];
////////        zMatrix[0][0] = z11;
////////        zMatrix[0][1] = z12;
////////        zMatrix[0][2] = z13;
////////        zMatrix[0][3] = z14;
////////        zMatrix[1][0] = z12;//z21
////////        zMatrix[1][1] = z22;
////////        zMatrix[1][2] = z23;
////////        zMatrix[1][3] = z24;
////////        zMatrix[2][0] = z13;//z31
////////        zMatrix[2][1] = z23;//z32
////////        zMatrix[2][2] = z33;
////////        zMatrix[2][3] = z34;
////////        zMatrix[3][0] = z14;//z41
////////        zMatrix[3][1] = z24;//z42
////////        zMatrix[3][2] = z34;//z43
////////        zMatrix[3][3] = z44;
////////        System.out.print(zMatrix);
//////
//////                {zbus11, zbus12, zbus13, zbus14},
//////                {zbus21, zbus22, zbus23, zbus24},
//////                {zbus31, zbus32, zbus33, zbus34},
//////                {zbus41, zbus42, zbus43, zbus44},
//////        };
//////        return zMatrix;
////        TextView zBus11 = findViewById(R.id.zBUS_11);
////        TextView zBus12 = findViewById(R.id.zBUS_12);
////        TextView zBus13 = findViewById(R.id.zBUS_13);
////        TextView zBus14 = findViewById(R.id.zBUS_14);
////        TextView zBus21 = findViewById(R.id.zBUS_21);
////        TextView zBus22 = findViewById(R.id.zBUS_22);
////        TextView zBus23 = findViewById(R.id.zBUS_23);
////        TextView zBus24 = findViewById(R.id.zBUS_24);
////        TextView zBus31 = findViewById(R.id.zBUS_31);
////        TextView zBus32 = findViewById(R.id.zBUS_32);
////        TextView zBus33 = findViewById(R.id.zBUS_33);
////        TextView zBus34 = findViewById(R.id.zBUS_34);
////        TextView zBus41 = findViewById(R.id.zBUS_41);
////        TextView zBus42 = findViewById(R.id.zBUS_42);
////        TextView zBus43 = findViewById(R.id.zBUS_43);
////        TextView zBus44 = findViewById(R.id.zBUS_44);
////
////        zBus11.setText(zbus11);
////        zBus12.setText(zbus12);
////        zBus13.setText(zbus13);
////        zBus14.setText(zbus14);
////        zBus21.setText(zbus21);
////        zBus22.setText(zbus22);
////        zBus23.setText(zbus23);
////        zBus24.setText(zbus24);
////        zBus31.setText(zbus31);
////        zBus32.setText(zbus32);
////        zBus33.setText(zbus33);
////        zBus34.setText(zbus34);
////        zBus41.setText(zbus41);
////        zBus42.setText(zbus42);
////        zBus43.setText(zbus43);
////        zBus44.setText(zbus44);
//    }
public class ComplexNum{
    private Number real;
    private Number imaginary;


    public ComplexNum(Number real, Number imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String add(String z1, String z2) {
        String x[] = z1.split("\\+|j");
        String y[] = z2.split("\\+|j");

        Number z1Real = Double.parseDouble(x[0]);
        Number z1Imaginary = Double.parseDouble(x[1]);

        Number z2Real = Double.parseDouble(y[0]);
        Number z2Imaginary = Double.parseDouble(y[1]);

        return (z1Real.doubleValue() + z2Real.doubleValue()) + "+" + (z1Imaginary.doubleValue() + z2Imaginary.doubleValue())+ "j";
    }

//        public ComplexNum multiply(ComplexNum z1, ComplexNum z2)
//        {
//            double real1 = z1.real*z2.real - z1.imaginary*z2.imaginary;
//            double imaginary1 = z1.real*z2.imaginary + z1.imaginary*z2.real;
//            return new ComplexNum(real1,imaginary1);
//        }
//        public ComplexNum divide(ComplexNum z1, ComplexNum z2) {
//            ComplexNum output = multiply(z1,z2.conjugate());
//            double div = Math.pow(z2.mod(),2);
//            return new ComplexNum(output.real/div,output.imaginary/div);
//        }

    public String divide1(double a, String z1){
        String x[] = z1.split("\\+|j");

        Number z1Real = Double.parseDouble(x[0]);
        Number z1Imaginary = Double.parseDouble(x[1]);

        return a/z1Real.doubleValue() + "+" +  a/z1Imaginary.doubleValue() + "j";
    }

//        public ComplexNum conjugate()
//        {
//            return new ComplexNum(this.real,-this.imaginary);
//        }
//
//        public double mod()
//        {
//            return Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
//        }


    @Override
    public String toString() {
        String re = this.real+"";
        String im = "";
        if(this.imaginary.doubleValue() < 0)
            im = this.imaginary+"j";
        else
            im = "+"+this.imaginary+"j";
        return re+im;
    }

}
}
