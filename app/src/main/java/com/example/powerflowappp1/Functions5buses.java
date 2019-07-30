package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

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

        String z11B = intent.getStringExtra("Zbus 11:");
        String z12B = intent.getStringExtra("Zbus 12:");
        String z13B = intent.getStringExtra("Zbus 13:");
        String z14B = intent.getStringExtra("Zbus 14:");
        String z15B = intent.getStringExtra("Zbus 15:");
        String z22B = intent.getStringExtra("Zbus 22:");
        String z23B = intent.getStringExtra("Zbus 23:");
        String z24B = intent.getStringExtra("Zbus 24:");
        String z25B = intent.getStringExtra("Zbus 25:");
        String z33B = intent.getStringExtra("Zbus 33:");
        String z34B = intent.getStringExtra("Zbus 34:");
        String z35B = intent.getStringExtra("Zbus 35:");
        String z44B = intent.getStringExtra("Zbus 44:");
        String z45B = intent.getStringExtra("Zbus 45:");
        String z55B = intent.getStringExtra("Zbus 55:");

        String x[] = z11B.split("\\+|j");
        String y[] = z12B.split("\\+|j");
        String z[] = z13B.split("\\+|j");
        String a[] = z14B.split("\\+|j");
        String f[] = z15B.split("\\+|j");
        String w[] = z22B.split("\\+|j");
        String v[] = z23B.split("\\+|j");
        String c[] = z24B.split("\\+|j");
        String g[] = z25B.split("\\+|j");
        String b[] = z33B.split("\\+|j");
        String d[] = z34B.split("\\+|j");
        String i[] = z35B.split("\\+|j");
        String e[] = z44B.split("\\+|j");
        String j[] = z45B.split("\\+|j");
        String k[] = z55B.split("\\+|j");

        double z11Real = Double.parseDouble(x[0]);
        double z11Imaginary = Double.parseDouble(x[1]);

        double z12Real = Double.parseDouble(y[0]);
        double z12Imaginary = Double.parseDouble(y[1]);

        double z13Real = Double.parseDouble(z[0]);
        double z13Imaginary = Double.parseDouble(z[1]);

        double z14Real = Double.parseDouble(a[0]);
        double z14Imaginary = Double.parseDouble(a[1]);

        double z15Real = Double.parseDouble(f[0]);
        double z15Imaginary = Double.parseDouble(f[1]);

        double z22Real = Double.parseDouble(w[0]);
        double z22Imaginary = Double.parseDouble(w[1]);

        double z23Real = Double.parseDouble(v[0]);
        double z23Imaginary = Double.parseDouble(v[1]);

        double z24Real = Double.parseDouble(c[0]);
        double z24Imaginary = Double.parseDouble(c[1]);

        double z25Real = Double.parseDouble(g[0]);
        double z25Imaginary = Double.parseDouble(g[1]);

        double z33Real = Double.parseDouble(b[0]);
        double z33Imaginary = Double.parseDouble(b[1]);

        double z34Real = Double.parseDouble(d[0]);
        double z34Imaginary = Double.parseDouble(d[1]);

        double z35Real = Double.parseDouble(i[0]);
        double z35Imaginary = Double.parseDouble(i[1]);

        double z44Real = Double.parseDouble(e[0]);
        double z44Imaginary = Double.parseDouble(e[1]);

        double z45Real = Double.parseDouble(j[0]);
        double z45Imaginary = Double.parseDouble(j[1]);

        double z55Real = Double.parseDouble(k[0]);
        double z55Imaginary = Double.parseDouble(k[1]);

        //calcs

        double y11R = 1.0/z11Real;
        double y11I = 1.0/z11Imaginary;

        double y12R = 1.0/z12Real;
        double y12I = 1.0/z12Imaginary;

        double y13R = 1.0/z13Real;
        double y13I = 1.0/z13Imaginary;

        double y14R = 1.0/z14Real;
        double y14I = 1.0/z14Imaginary;

        double y15R = 1.0/z15Real;
        double y15I = 1.0/z15Imaginary;

        double y22R = 1.0/z22Real;
        double y22I = 1.0/z22Imaginary;

        double y23R = 1.0/z23Real;
        double y23I = 1.0/z23Imaginary;

        double y24R = 1.0/z24Real;
        double y24I = 1.0/z24Imaginary;

        double y25R = 1.0/z25Real;
        double y25I = 1.0/z25Imaginary;

        double y33R = 1.0/z33Real;
        double y33I = 1.0/z33Imaginary;

        double y34R = 1.0/z34Real;
        double y34I = 1.0/z34Imaginary;

        double y35R = 1.0/z35Real;
        double y35I = 1.0/z35Imaginary;

        double y44R = 1.0/z44Real;
        double y44I = 1.0/z44Imaginary;

        double y45R = 1.0/z45Real;
        double y45I = 1.0/z45Imaginary;

        double y55R = 1.0/z55Real;
        double y55I = 1.0/z55Imaginary;

        //ti 1 decimal
        DecimalFormat df = new DecimalFormat("#.#");

        String y11A = df.format(y11R) + "+" + df.format(y11I) + "j";
        String y12A = df.format(y12R) + "+" + df.format(y12I) + "j";
        String y13A = df.format(y13R) + "+" + df.format(y13I) + "j";
        String y14A = df.format(y14R) + "+" + df.format(y14I) + "j";
        String y15A = df.format(y15R) + "+" + df.format(y15I) + "j";
        String y22A = df.format(y22R) + "+" + df.format(y22I) + "j";
        String y23A = df.format(y23R) + "+" + df.format(y23I) + "j";
        String y24A = df.format(y24R) + "+" + df.format(y24I) + "j";
        String y25A = df.format(y25R) + "+" + df.format(y25I) + "j";
        String y33A = df.format(y33R) + "+" + df.format(y33I) + "j";
        String y34A = df.format(y34R) + "+" + df.format(y34I) + "j";
        String y35A = df.format(y35R) + "+" + df.format(y35I) + "j";
        String y44A = df.format(y44R) + "+" + df.format(y44I) + "j";
        String y45A = df.format(y45R) + "+" + df.format(y45I) + "j";
        String y55A = df.format(y55R) + "+" + df.format(y55I) + "j";

        TextView input = findViewById(R.id.displayMatrix3);
        input.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 + "\n" +voltage4
                + "\n" +voltage5 +"\n\nIterations: " +iterations +"\n\nAngles: \n" +angle1 + "\n"
                +angle2 + "\n" +angle3 + "\n" +angle4 + "\n" +angle5  + "\n\nZ Matrix: \n"+ z11B
                + "  " + z12B + "  " + z13B + "  " + z14B + "  " + z15B + "\n"+ z12B + "  " + z22B +
                "  " + z23B + "  " + z24B  + "  " + z25B+ "\n" + z13B + "  " + z23B + "  " + z33B +
                "  " + z34B + "  " + z35B + "\n" + z14B + "  " + z24B + "  " + z34B + "  " + z44B
                + "  " + z45B + "\n" + z15B + "  " + z25B + "  " + z35B + "  " + z45B + "  " + z55B
                + "\n\n Y Matrix: \n" + y11A + "  " + y12A + "  " + y13A + "  " + y14A  + "  " + y15A
                + "\n"+ y12A +  "  "  + y22A+ "  " +y23A + "  " +y24A + "  " + y25A + "\n" + y13A +
                "  " + y23A + "  " + y33A + "  " + y34A + "  " + y35A + "\n" + y14A + "  " + y24A
                + "  " + y34A + "  " + y44A + "  " + y45A + "\n" + y15A + "  " + y25A
                + "  " + y35A + "  " + y45A + "  " + y55A);
//        String zMatrix = this.bar5MatrixFunction().toString();
//
//        TextView mresultTV = findViewById(R.id.displayInputs);
//        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
//                + "\n" +voltage5 +"\n\nIterations: " +iterations +"\n\nAngles: \n" +angle1 + "\n"
//                +angle2 + "\n" +angle3 + "\n" +angle4 + "\n" +angle5 + "\n\nZ Matrix: \n" + this.bar5MatrixFunction().toString());
    }

//    public int[][] bar5MatrixFunction() {
//        Intent intent1 = getIntent();
//
//        //input z values
//        z11 = intent1.getStringExtra("Zbus 11:");
//        z12 = intent1.getStringExtra("Zbus 12:");
//        z13 = intent1.getStringExtra("Zbus 13:");
//        z14 = intent1.getStringExtra("Zbus 14:");
//        z15 = intent1.getStringExtra("Zbus 15:");
//        z22 = intent1.getStringExtra("Zbus 22:");
//        z23 = intent1.getStringExtra("Zbus 23:");
//        z24 = intent1.getStringExtra("Zbus 24:");
//        z25 = intent1.getStringExtra("Zbus 25:");
//        z33 = intent1.getStringExtra("Zbus 33:");
//        z34 = intent1.getStringExtra("Zbus 34:");
//        z35 = intent1.getStringExtra("Zbus 35:");
//        z44 = intent1.getStringExtra("Zbus 44:");
//        z45 = intent1.getStringExtra("Zbus 45:");
//        z55 = intent1.getStringExtra("Zbus 55:");
//
////        z11 = findViewById(R.id.zbus11);
////
//        int z11A = Integer.parseInt(z11);
//        int z12A = Integer.parseInt(z12);
//        int z13A = Integer.parseInt(z13);
//        int z14A = Integer.parseInt(z14);
//        int z15A = Integer.parseInt(z15);
//        int z22A = Integer.parseInt(z22);
//        int z23A = Integer.parseInt(z23);
//        int z24A = Integer.parseInt(z24);
//        int z25A = Integer.parseInt(z25);
//        int z33A = Integer.parseInt(z33);
//        int z34A = Integer.parseInt(z34);
//        int z35A = Integer.parseInt(z35);
//        int z44A = Integer.parseInt(z44);
//        int z45A = Integer.parseInt(z45);
//        int z55A = Integer.parseInt(z55);
//
//
//        int zMatrix[][] = {
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
//                {z11A, z12A, z13A, z14A, z15A},
//                {z12A, z22A, z23A, z24A, z25A},
//                {z13A, z23A, z33A, z34A, z35A},
//                {z14A, z24A, z34A, z44A, z45A},
//                {z15A, z25A, z35A, z45A, z55A},
//
////                System.out.print(zMatrix);
//        };
//        return zMatrix;
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
