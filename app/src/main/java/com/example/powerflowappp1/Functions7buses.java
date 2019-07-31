package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Functions7buses extends AppCompatActivity {

    String voltage1;
    String voltage2;
    String voltage3;
    String voltage4;
    String voltage5;
    String voltage6;
    String voltage7;
    String iterations;
    String angle1;
    String angle2;
    String angle3;
    String angle4;
    String angle5;
    String angle6;
    String angle7;
//    EditText angleB1;
//    EditText angleB2;
//    EditText angleB3;
//    EditText angleB4;
//    EditText angleB5;
//    EditText angleB6;
//    EditText angleB7;
//    EditText z11;
//    EditText z12;
//    EditText z13;
//    EditText z14;
//    EditText z15;
//    EditText z16;
//    EditText z17;
//    EditText z22;
//    EditText z23;
//    EditText z24;
//    EditText z25;
//    EditText z26;
//    EditText z27;
//    EditText z33;
//    EditText z34;
//    EditText z35;
//    EditText z36;
//    EditText z37;
//    EditText z44;
//    EditText z45;
//    EditText z46;
//    EditText z47;
//    EditText z55;
//    EditText z56;
//    EditText z57;
//    EditText z66;
//    EditText z67;
//    EditText z77;

//    String[] myString;
//    String zbus77;
//    String zbus76;
//    String zbus75;
//    String zbus74;
//    String zbus73;
//    String zbus72;
//    String zbus71;
//    String zbus67;
//    String zbus66;
//    String zbus65;
//    String zbus64;
//    String zbus63;
//    String zbus62;
//    String zbus61;
//    String zbus57;
//    String zbus56;
//    String zbus55;
//    String zbus54;
//    String zbus53;
//    String zbus52;
//    String zbus51;
//    String zbus47;
//    String zbus46;
//    String zbus45;
//    String zbus44;
//    String zbus43;
//    String zbus42;
//    String zbus41;
//    String zbus37;
//    String zbus36;
//    String zbus35;
//    String zbus34;
//    String zbus33;
//    String zbus32;
//    String zbus31;
//    String zbus27;
//    String zbus26;
//    String zbus25;
//    String zbus24;
//    String zbus23;
//    String zbus22;
//    String zbus21;
//    String zbus17;
//    String zbus16;
//    String zbus15;
//    String zbus14;
//    String zbus13;
//    String zbus12;
//    String zbus11;


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

        String z11B = intent.getStringExtra("Zbus 11:");
        String z12B = intent.getStringExtra("Zbus 12:");
        String z13B = intent.getStringExtra("Zbus 13:");
        String z14B = intent.getStringExtra("Zbus 14:");
        String z15B = intent.getStringExtra("Zbus 15:");
        String z16B = intent.getStringExtra("Zbus 16:");
        String z17B = intent.getStringExtra("Zbus 17:");
        String z22B = intent.getStringExtra("Zbus 22:");
        String z23B = intent.getStringExtra("Zbus 23:");
        String z24B = intent.getStringExtra("Zbus 24:");
        String z25B = intent.getStringExtra("Zbus 25:");
        String z26B = intent.getStringExtra("Zbus 26:");
        String z27B = intent.getStringExtra("Zbus 27:");
        String z33B = intent.getStringExtra("Zbus 33:");
        String z34B = intent.getStringExtra("Zbus 34:");
        String z35B = intent.getStringExtra("Zbus 35:");
        String z36B = intent.getStringExtra("Zbus 36:");
        String z37B = intent.getStringExtra("Zbus 37:");
        String z44B = intent.getStringExtra("Zbus 44:");
        String z45B = intent.getStringExtra("Zbus 45:");
        String z46B = intent.getStringExtra("Zbus 46:");
        String z47B = intent.getStringExtra("Zbus 47:");
        String z55B = intent.getStringExtra("Zbus 55:");
        String z56B = intent.getStringExtra("Zbus 56:");
        String z57B = intent.getStringExtra("Zbus 57:");
        String z66B = intent.getStringExtra("Zbus 66:");
        String z67B = intent.getStringExtra("Zbus 67:");
        String z77B = intent.getStringExtra("Zbus 77:");

        String x[] = z11B.split("\\+|j");
        String y[] = z12B.split("\\+|j");
        String z[] = z13B.split("\\+|j");
        String a[] = z14B.split("\\+|j");
        String f[] = z15B.split("\\+|j");
        String l[] = z16B.split("\\+|j");
        String aa[] = z17B.split("\\+|j");
        String w[] = z22B.split("\\+|j");
        String v[] = z23B.split("\\+|j");
        String c[] = z24B.split("\\+|j");
        String g[] = z25B.split("\\+|j");
        String m[] = z26B.split("\\+|j");
        String bb[] = z27B.split("\\+|j");
        String b[] = z33B.split("\\+|j");
        String d[] = z34B.split("\\+|j");
        String i[] = z35B.split("\\+|j");
        String n[] = z36B.split("\\+|j");
        String cc[] = z37B.split("\\+|j");
        String e[] = z44B.split("\\+|j");
        String j[] = z45B.split("\\+|j");
        String p[] = z46B.split("\\+|j");
        String dd[] = z47B.split("\\+|j");
        String k[] = z55B.split("\\+|j");
        String q[] = z56B.split("\\+|j");
        String ee[] = z57B.split("\\+|j");
        String o[] = z66B.split("\\+|j");
        String ff[] = z67B.split("\\+|j");
        String gg[] = z77B.split("\\+|j");

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

        double z16Real = Double.parseDouble(l[0]);
        double z16Imaginary = Double.parseDouble(l[1]);

        double z17Real = Double.parseDouble(aa[0]);
        double z17Imaginary = Double.parseDouble(aa[1]);

        double z22Real = Double.parseDouble(w[0]);
        double z22Imaginary = Double.parseDouble(w[1]);

        double z23Real = Double.parseDouble(v[0]);
        double z23Imaginary = Double.parseDouble(v[1]);

        double z24Real = Double.parseDouble(c[0]);
        double z24Imaginary = Double.parseDouble(c[1]);

        double z25Real = Double.parseDouble(g[0]);
        double z25Imaginary = Double.parseDouble(g[1]);

        double z26Real = Double.parseDouble(m[0]);
        double z26Imaginary = Double.parseDouble(m[1]);

        double z27Real = Double.parseDouble(bb[0]);
        double z27Imaginary = Double.parseDouble(bb[1]);

        double z33Real = Double.parseDouble(b[0]);
        double z33Imaginary = Double.parseDouble(b[1]);

        double z34Real = Double.parseDouble(d[0]);
        double z34Imaginary = Double.parseDouble(d[1]);

        double z35Real = Double.parseDouble(i[0]);
        double z35Imaginary = Double.parseDouble(i[1]);

        double z36Real = Double.parseDouble(n[0]);
        double z36Imaginary = Double.parseDouble(n[1]);

        double z37Real = Double.parseDouble(cc[0]);
        double z37Imaginary = Double.parseDouble(cc[1]);

        double z44Real = Double.parseDouble(e[0]);
        double z44Imaginary = Double.parseDouble(e[1]);

        double z45Real = Double.parseDouble(j[0]);
        double z45Imaginary = Double.parseDouble(j[1]);

        double z46Real = Double.parseDouble(p[0]);
        double z46Imaginary = Double.parseDouble(p[1]);

        double z47Real = Double.parseDouble(dd[0]);
        double z47Imaginary = Double.parseDouble(dd[1]);

        double z55Real = Double.parseDouble(k[0]);
        double z55Imaginary = Double.parseDouble(k[1]);

        double z56Real = Double.parseDouble(q[0]);
        double z56Imaginary = Double.parseDouble(q[1]);

        double z57Real = Double.parseDouble(ee[0]);
        double z57Imaginary = Double.parseDouble(ee[1]);

        double z66Real = Double.parseDouble(o[0]);
        double z66Imaginary = Double.parseDouble(o[1]);

        double z67Real = Double.parseDouble(ff[0]);
        double z67Imaginary = Double.parseDouble(ff[1]);

        double z77Real = Double.parseDouble(gg[0]);
        double z77Imaginary = Double.parseDouble(gg[1]);

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

        double y16R = 1.0/z16Real;
        double y16I = 1.0/z16Imaginary;

        double y17R = 1.0/z17Real;
        double y17I = 1.0/z17Imaginary;

        double y22R = 1.0/z22Real;
        double y22I = 1.0/z22Imaginary;

        double y23R = 1.0/z23Real;
        double y23I = 1.0/z23Imaginary;

        double y24R = 1.0/z24Real;
        double y24I = 1.0/z24Imaginary;

        double y25R = 1.0/z25Real;
        double y25I = 1.0/z25Imaginary;

        double y26R = 1.0/z26Real;
        double y26I = 1.0/z26Imaginary;

        double y27R = 1.0/z27Real;
        double y27I = 1.0/z27Imaginary;

        double y33R = 1.0/z33Real;
        double y33I = 1.0/z33Imaginary;

        double y34R = 1.0/z34Real;
        double y34I = 1.0/z34Imaginary;

        double y35R = 1.0/z35Real;
        double y35I = 1.0/z35Imaginary;

        double y36R = 1.0/z36Real;
        double y36I = 1.0/z36Imaginary;

        double y37R = 1.0/z37Real;
        double y37I = 1.0/z37Imaginary;

        double y44R = 1.0/z44Real;
        double y44I = 1.0/z44Imaginary;

        double y45R = 1.0/z45Real;
        double y45I = 1.0/z45Imaginary;

        double y46R = 1.0/z46Real;
        double y46I = 1.0/z46Imaginary;

        double y47R = 1.0/z47Real;
        double y47I = 1.0/z47Imaginary;

        double y55R = 1.0/z55Real;
        double y55I = 1.0/z55Imaginary;

        double y56R = 1.0/z56Real;
        double y56I = 1.0/z56Imaginary;

        double y57R = 1.0/z57Real;
        double y57I = 1.0/z57Imaginary;

        double y66R = 1.0/z66Real;
        double y66I = 1.0/z66Imaginary;

        double y67R = 1.0/z67Real;
        double y67I = 1.0/z67Imaginary;

        double y77R = 1.0/z77Real;
        double y77I = 1.0/z77Imaginary;

        //ti 1 decimal
        DecimalFormat df = new DecimalFormat("#.#");

        String y11A = df.format(y11R) + "+" + df.format(y11I) + "j";
        String y12A = df.format(y12R) + "+" + df.format(y12I) + "j";
        String y13A = df.format(y13R) + "+" + df.format(y13I) + "j";
        String y14A = df.format(y14R) + "+" + df.format(y14I) + "j";
        String y15A = df.format(y15R) + "+" + df.format(y15I) + "j";
        String y16A = df.format(y16R) + "+" + df.format(y16I) + "j";
        String y17A = df.format(y17R) + "+" + df.format(y17I) + "j";
        String y22A = df.format(y22R) + "+" + df.format(y22I) + "j";
        String y23A = df.format(y23R) + "+" + df.format(y23I) + "j";
        String y24A = df.format(y24R) + "+" + df.format(y24I) + "j";
        String y25A = df.format(y25R) + "+" + df.format(y25I) + "j";
        String y26A = df.format(y26R) + "+" + df.format(y26I) + "j";
        String y27A = df.format(y27R) + "+" + df.format(y27I) + "j";
        String y33A = df.format(y33R) + "+" + df.format(y33I) + "j";
        String y34A = df.format(y34R) + "+" + df.format(y34I) + "j";
        String y35A = df.format(y35R) + "+" + df.format(y35I) + "j";
        String y36A = df.format(y36R) + "+" + df.format(y36I) + "j";
        String y37A = df.format(y37R) + "+" + df.format(y37I) + "j";
        String y44A = df.format(y44R) + "+" + df.format(y44I) + "j";
        String y45A = df.format(y45R) + "+" + df.format(y45I) + "j";
        String y46A = df.format(y46R) + "+" + df.format(y46I) + "j";
        String y47A = df.format(y47R) + "+" + df.format(y47I) + "j";
        String y55A = df.format(y55R) + "+" + df.format(y55I) + "j";
        String y56A = df.format(y56R) + "+" + df.format(y56I) + "j";
        String y57A = df.format(y57R) + "+" + df.format(y57I) + "j";
        String y66A = df.format(y66R) + "+" + df.format(y66I) + "j";
        String y67A = df.format(y67R) + "+" + df.format(y67I) + "j";
        String y77A = df.format(y77R) + "+" + df.format(y77I) + "j";

        TextView input = findViewById(R.id.displayMatrix3);
        input.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 + "\n" +voltage4
                + "\n" +voltage5 + "\n" +voltage6 + "\n" +voltage7 +"\n\nIterations: " +iterations
                +"\n\nAngles: \n" +angle1 + "\n" +angle2 + "\n" +angle3 + "\n" +angle4 + "\n"
                +angle5 + "\n" +angle6 + "\n" +angle7 + "\n\nZ Matrix: \n"+ z11B + "  " + z12B +
                "  " + z13B + "  " + z14B + "  " + z15B + "  " + z16B + "  " + z17B + "\n"+ z12B +
                "  " + z22B + "  " + z23B + "  " + z24B + "  " + z25B + "  " + z26B + "  " + z27B
                + "\n" + z13B + "  " + z23B + "  " + z33B + "  " + z34B + "  " + z35B + "  " + z36B
                + "  " + z37B + "\n" + z14B + "  " + z24B + "  " + z34B + "  " + z44B + "  " + z45B
                + "  " + z46B + "  " + z47B + "\n" + z15B + "  " + z25B + "  " + z35B + "  " + z45B
                + "  " + z55B + "  " + z56B + "  " + z57B + "\n" + z16B + "  " + z26B + "  " + z36B
                + "  " + z46B + "  " + z56B + "  " + z66B + "  " + z67B + "\n" + z17B + "  " + z27B
                + "  " + z37B + "  " + z47B + "  " + z57B + "  " + z67B + "  " + z77B +
                "\n\n Y Matrix: \n" + y11A + "  " + y12A + "  " + y13A + "  " + y14A + "  " + y15A +
                "  " + y16A + "  " + y17A + "\n"+ y12A +  "  "  + y22A+ "  " +y23A + "  " +y24A +
                "  " + y25A + "  " + y26A + "  " + y27A + "\n" + y13A + "  " + y23A + "  " + y33A +
                "  " + y34A + "  " + y35A + "  " + y36A + "  " + y37A + "\n" + y14A + "  " + y24A +
                "  " + y34A + "  " + y44A + "  " + y45A + "  " + y46A + "  " + y47A + "\n" + y15A +
                "  " + y25A + "  " + y35A + "  " + y45A + "  " + y55A + "  " + y56A + "  " + y57A +
                "\n" + y16A + "  " + y26A + "  " + y36A + "  " + y46A + "  " + y56A + "  " + y66A +
                "  " + y67A + "\n" + y17A + "  " + y27A + "  " + y37A + "  " + y47A + "  " + y57A +
                "  " + y67A + "  " + y77A);

//        myString = intent.getStringArrayExtra("Matrix:");
//
//        TextView mresultTV = findViewById(R.id.displayInputs);
//        mresultTV.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3 +"\n" +voltage4
//                + "\n" +voltage5 + "\n" +voltage6 + "\n" + voltage7 +"\n\nIterations: " +iterations
//                +"\n\nAngles: \n" +angle1 + "\n" +angle2 + "\n" +angle3 + "\n" +angle4 + "\n"
//                +angle5 + "\n" +angle6 + "\n" +angle7 + "\n\nZ Matrix: \n" /*+myString*/ +bar7MatrixFunction());
    }

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
//    public String[][] bar7MatrixFunction() {
//    Intent intent = getIntent();
//    zbus11 = intent.getStringExtra("Zbus 11:");
//    zbus12 = intent.getStringExtra("Zbus 12:");
//    zbus13 = intent.getStringExtra("Zbus 13:");
//    zbus14 = intent.getStringExtra("Zbus 14:");
//    zbus15 = intent.getStringExtra("Zbus 15:");
//    zbus16 = intent.getStringExtra("Zbus 16:");
//    zbus17 = intent.getStringExtra("Zbus 17:");
//    zbus21 = intent.getStringExtra("Zbus 21:");
//    zbus22 = intent.getStringExtra("Zbus 22:");
//    zbus23 = intent.getStringExtra("Zbus 23:");
//    zbus24 = intent.getStringExtra("Zbus 24:");
//    zbus25 = intent.getStringExtra("Zbus 25:");
//    zbus26 = intent.getStringExtra("Zbus 26:");
//    zbus27 = intent.getStringExtra("Zbus 27:");
//    zbus31 = intent.getStringExtra("Zbus 31:");
//    zbus32 = intent.getStringExtra("Zbus 32:");
//    zbus33 = intent.getStringExtra("Zbus 33:");
//    zbus34 = intent.getStringExtra("Zbus 34:");
//    zbus35 = intent.getStringExtra("Zbus 35:");
//    zbus36 = intent.getStringExtra("Zbus 36:");
//    zbus37 = intent.getStringExtra("Zbus 37:");
//    zbus41 = intent.getStringExtra("Zbus 41:");
//    zbus42 = intent.getStringExtra("Zbus 42:");
//    zbus43 = intent.getStringExtra("Zbus 43:");
//    zbus44 = intent.getStringExtra("Zbus 44:");
//    zbus45 = intent.getStringExtra("Zbus 45:");
//    zbus46 = intent.getStringExtra("Zbus 46:");
//    zbus47 = intent.getStringExtra("Zbus 47:");
//    zbus51 = intent.getStringExtra("Zbus 51:");
//    zbus52 = intent.getStringExtra("Zbus 52:");
//    zbus53 = intent.getStringExtra("Zbus 53:");
//    zbus54 = intent.getStringExtra("Zbus 54:");
//    zbus55 = intent.getStringExtra("Zbus 55:");
//    zbus56 = intent.getStringExtra("Zbus 56:");
//    zbus57 = intent.getStringExtra("Zbus 57:");
//    zbus61 = intent.getStringExtra("Zbus 61:");
//    zbus62 = intent.getStringExtra("Zbus 62:");
//    zbus63 = intent.getStringExtra("Zbus 63:");
//    zbus64 = intent.getStringExtra("Zbus 64:");
//    zbus65 = intent.getStringExtra("Zbus 65:");
//    zbus66 = intent.getStringExtra("Zbus 66:");
//    zbus67 = intent.getStringExtra("Zbus 67:");
//    zbus71 = intent.getStringExtra("Zbus 71:");
//    zbus72 = intent.getStringExtra("Zbus 72:");
//    zbus73 = intent.getStringExtra("Zbus 73:");
//    zbus74 = intent.getStringExtra("Zbus 74:");
//    zbus75 = intent.getStringExtra("Zbus 75:");
//    zbus76 = intent.getStringExtra("Zbus 76:");
//    zbus77 = intent.getStringExtra("Zbus 77:");
////    input voltage vlaue
////        voltage1 = findViewById(R.id.voltS1);
////        voltage2 = findViewById(R.id.voltage2);
////        voltage3 = findViewById(R.id.voltage3);
////        voltage4 = findViewById(R.id.voltage4);
////        voltage5 = findViewById(R.id.voltage5);
////        voltage6 = findViewById(R.id.voltage6);
////        voltage7 = findViewById(R.id.voltage7);
////        int voltages1 = Integer.parseInt(voltage1.getText().toString());
////        int voltages2 = Integer.parseInt(voltage2.getText().toString());
////        int voltages3 = Integer.parseInt(voltage3.getText().toString());
////        int voltages4 = Integer.parseInt(voltage4.getText().toString());
////        int voltages5 = Integer.parseInt(voltage5.getText().toString());
////        int voltages6 = Integer.parseInt(voltage6.getText().toString());
////        int voltages7 = Integer.parseInt(voltage7.getText().toString());
////
////
////        //input angle value
////        angleB1 = findViewById(R.id.ang1);
////        angleB2 = findViewById(R.id.ang2);
////        angleB3 = findViewById(R.id.ang3);
////        angleB4 = findViewById(R.id.ang4);
////        angleB5 = findViewById(R.id.ang5);
////        angleB6 = findViewById(R.id.ang6);
////        angleB7 = findViewById(R.id.ang7);
////        int anglesB1 = Integer.parseInt(angleB1.getText().toString());
////        int anglesB2 = Integer.parseInt(angleB2.getText().toString());
////        int anglesB3 = Integer.parseInt(angleB3.getText().toString());
////        int anglesB4 = Integer.parseInt(angleB4.getText().toString());
////        int anglesB5 = Integer.parseInt(angleB5.getText().toString());
////        int anglesB6 = Integer.parseInt(angleB6.getText().toString());
////        int anglesB7 = Integer.parseInt(angleB7.getText().toString());
////
////
////        //input z values
////        z11 = findViewById(R.id.ZBus11);
////        z12 = findViewById(R.id.ZBus12);
////        z13 = findViewById(R.id.ZBus13);
////        z14 = findViewById(R.id.ZBus14);
////        z15 = findViewById(R.id.ZBus15);
////        z16 = findViewById(R.id.ZBus16);
////        z17 = findViewById(R.id.ZBus17);
////        z22 = findViewById(R.id.ZBus22);
////        z23 = findViewById(R.id.ZBus23);
////        z24 = findViewById(R.id.ZBus24);
////        z25 = findViewById(R.id.ZBus25);
////        z26 = findViewById(R.id.ZBus26);
////        z27 = findViewById(R.id.ZBus27);
////        z33 = findViewById(R.id.ZBus33);
////        z34 = findViewById(R.id.ZBus34);
////        z35 = findViewById(R.id.ZBus35);
////        z36 = findViewById(R.id.ZBus36);
////        z37 = findViewById(R.id.ZBus37);
////        z44 = findViewById(R.id.ZBus44);
////        z45 = findViewById(R.id.ZBus45);
////        z46 = findViewById(R.id.ZBus46);
////        z47 = findViewById(R.id.ZBus47);
////        z55 = findViewById(R.id.ZBus55);
////        z56 = findViewById(R.id.ZBus56);
////        z57 = findViewById(R.id.ZBus57);
////        z66 = findViewById(R.id.ZBus66);
////        z67 = findViewById(R.id.ZBus67);
////        z77 = findViewById(R.id.ZBus77);
////        int z11A = Integer.parseInt(z11.getText().toString());
////        int z12A = Integer.parseInt(z12.getText().toString());
////        int z13A = Integer.parseInt(z13.getText().toString());
////        int z14A = Integer.parseInt(z14.getText().toString());
////        int z15A = Integer.parseInt(z15.getText().toString());
////        int z16A = Integer.parseInt(z16.getText().toString());
////        int z17A = Integer.parseInt(z17.getText().toString());
////        int z22A = Integer.parseInt(z22.getText().toString());
////        int z23A = Integer.parseInt(z23.getText().toString());
////        int z24A = Integer.parseInt(z24.getText().toString());
////        int z25A = Integer.parseInt(z25.getText().toString());
////        int z26A = Integer.parseInt(z26.getText().toString());
////        int z27A = Integer.parseInt(z27.getText().toString());
////        int z33A = Integer.parseInt(z33.getText().toString());
////        int z34A = Integer.parseInt(z34.getText().toString());
////        int z35A = Integer.parseInt(z35.getText().toString());
////        int z36A = Integer.parseInt(z36.getText().toString());
////        int z37A = Integer.parseInt(z37.getText().toString());
////        int z44A = Integer.parseInt(z44.getText().toString());
////        int z45A = Integer.parseInt(z45.getText().toString());
////        int z46A = Integer.parseInt(z46.getText().toString());
////        int z47A = Integer.parseInt(z47.getText().toString());
////        int z55A = Integer.parseInt(z55.getText().toString());
////        int z56A = Integer.parseInt(z56.getText().toString());
////        int z57A = Integer.parseInt(z57.getText().toString());
////        int z66A = Integer.parseInt(z66.getText().toString());
////        int z67A = Integer.parseInt(z67.getText().toString());
////        int z77A = Integer.parseInt(z77.getText().toString());
////
////
//        String zMatrix[][] = {
//////                new android.widget.EditText[7][7];
//////        zMatrix[0][0] = zbus11;
//////        zMatrix[0][1] = zbus12;
//////        zMatrix[0][2] = zbus13;
//////        zMatrix[0][3] = zbus14;
//////        zMatrix[0][4] = zbus15;
//////        zMatrix[0][5] = zbus16;
//////        zMatrix[0][6] = zbus17;
//////        zMatrix[1][0] = zbus21;
//////        zMatrix[1][1] = zbus22;
//////        zMatrix[1][2] = zbus23;
//////        zMatrix[1][3] = zbus24;
//////        zMatrix[1][4] = zbus25;
//////        zMatrix[1][5] = zbus26;
//////        zMatrix[1][6] = zbus27;
//////        zMatrix[2][0] = zbus31;
//////        zMatrix[2][1] = zbus32;
//////        zMatrix[2][2] = zbus33;
//////        zMatrix[2][3] = zbus34;
//////        zMatrix[2][4] = zbus35;
//////        zMatrix[2][5] = zbus36;
//////        zMatrix[2][6] = zbus37;
//////        zMatrix[3][0] = zbus41;
//////        zMatrix[3][1] = zbus42;
//////        zMatrix[3][2] = zbus43;
//////        zMatrix[3][3] = zbus44;
//////        zMatrix[3][4] = zbus45;
//////        zMatrix[3][5] = zbus46;
//////        zMatrix[3][6] = zbus47;
//////        zMatrix[4][0] = zbus51;
//////        zMatrix[4][1] = zbus52;
//////        zMatrix[4][2] = zbus53;
//////        zMatrix[4][3] = zbus54;
//////        zMatrix[4][4] = zbus55;
//////        zMatrix[4][5] = zbus56;
//////        zMatrix[4][6] = zbus57;
//////        zMatrix[5][0] = zbus61;
//////        zMatrix[5][1] = zbus62;
//////        zMatrix[5][2] = zbus63;
//////        zMatrix[5][3] = zbus64;
//////        zMatrix[5][4] = zbus65;
//////        zMatrix[5][5] = zbus66;
//////        zMatrix[5][6] = zbus67;
//////        zMatrix[6][0] = zbus71;
//////        zMatrix[6][1] = zbus72;
//////        zMatrix[6][2] = zbus73;
//////        zMatrix[6][3] = zbus74;
//////        zMatrix[6][4] = zbus75;
//////        zMatrix[6][5] = zbus76;
//////        zMatrix[6][6] = zbus77;
//
//                {zbus11, zbus12, zbus13, zbus14, zbus15, zbus16, zbus17},
//                {zbus21, zbus22, zbus23, zbus24, zbus25, zbus26, zbus27},
//                {zbus31, zbus32, zbus33, zbus34, zbus35, zbus36, zbus37},
//                {zbus41, zbus42, zbus43, zbus44, zbus45, zbus46, zbus47},
//                {zbus51, zbus52, zbus53, zbus54, zbus55, zbus56, zbus57},
//                {zbus61, zbus62, zbus63, zbus64, zbus65, zbus66, zbus67},
//                {zbus71, zbus72, zbus73, zbus74, zbus75, zbus76, zbus77},
//
////        System.out.print(zMatrix);
//        };
//        return zMatrix;
//    }
}
