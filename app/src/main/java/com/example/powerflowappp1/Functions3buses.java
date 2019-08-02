package com.example.powerflowappp1;

import android.content.Intent;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Functions3buses extends AppCompatActivity {

     String voltage1, voltage2, voltage3, voltage4, voltage5, voltage6, voltage7,
            angleB1, angleB2,angleB3, angleB4, angleB5, angleB6, angleB7,iter;
     ComplexNum z11,z12,z13,z14,z15,z16,z17,z22,z23,z24,z25,z26,z27,z33,z34,z35,z36,z37, z44,z45,z46,z47,z55,z56,z57,z66,z67,z77;
     String Y, y, V, v, Ang, ang, d, D;

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

//        z11 = findViewById(R.id.z11);
//        z12 = findViewById(R.id.z12);
//        z13 = findViewById(R.id.z13);
//        z22 = findViewById(R.id.z22);
//        z23 = findViewById(R.id.z23);
//        z33 = findViewById(R.id.z33);

//        z11 = intent.getStringExtra("Zbus 11:");
//        z12 = intent.getStringExtra("Zbus 12:");
//        z13 = intent.getStringExtra("Zbus 13:");
//        z22 = intent.getStringExtra("Zbus 22:");
//        z23 = intent.getStringExtra("Zbus 23:");
//        z33 = intent.getStringExtra("Zbus 33:");

        String z11B = intent.getStringExtra("Zbus 11:");
        String z12B = intent.getStringExtra("Zbus 12:");
        String z13B = intent.getStringExtra("Zbus 13:");
        String z22B = intent.getStringExtra("Zbus 22:");
        String z23B = intent.getStringExtra("Zbus 23:");
        String z33B = intent.getStringExtra("Zbus 33:");


        String x[] = z11B.split("\\+|j");
        String y[] = z12B.split("\\+|j");
        String z[] = z13B.split("\\+|j");
        String w[] = z22B.split("\\+|j");
        String v[] = z23B.split("\\+|j");
        String b[] = z33B.split("\\+|j");



        double z11Real = Double.parseDouble(x[0]);
        double z11Imaginary = Double.parseDouble(x[1]);

        double z12Real = Double.parseDouble(y[0]);
        double z12Imaginary = Double.parseDouble(y[1]);

        double z13Real = Double.parseDouble(z[0]);
        double z13Imaginary = Double.parseDouble(z[1]);

        double z22Real = Double.parseDouble(w[0]);
        double z22Imaginary = Double.parseDouble(w[1]);

        double z23Real = Double.parseDouble(v[0]);
        double z23Imaginary = Double.parseDouble(v[1]);

        double z33Real = Double.parseDouble(b[0]);
        double z33Imaginary = Double.parseDouble(b[1]);

        //calcs

        double y11R = 1.0/z11Real;
        double y11I = 1.0/z11Imaginary;

        double y12R = 1.0/z12Real;
        double y12I = 1.0/z12Imaginary;

        double y13R = 1.0/z13Real;
        double y13I = 1.0/z13Imaginary;

        double y22R = 1.0/z22Real;
        double y22I = 1.0/z22Imaginary;

        double y23R = 1.0/z23Real;
        double y23I = 1.0/z23Imaginary;

        double y33R = 1.0/z33Real;
        double y33I = 1.0/z33Imaginary;

        //ti 1 decimal
        DecimalFormat df = new DecimalFormat("#.##");

        String y11A = df.format(y11R) + "+" + df.format(y11I) + "j";
        String y12A = df.format(y12R) + "+" + df.format(y12I) + "j";
        String y13A = df.format(y13R) + "+" + df.format(y13I) + "j";
        String y22A = df.format(y22R) + "+" + df.format(y22I) + "j";
        String y23A = df.format(y23R) + "+" + df.format(y23I) + "j";
        String y33A = df.format(y33R) + "+" + df.format(y33I) + "j";


//                double z12A = Double.parseDouble(z12);
//        double z13A = Double.parseDouble(z13);
//        double z22A = Double.parseDouble(z22);
//        double z23A = Double.parseDouble(z23);
//        double z33A = Double.parseDouble(z33);



        iter = intent.getStringExtra("Iterations:");

//        String zMatrixResult = bar3MatrixFunction();
//        Log.v("method", zMatrixResult);


//        TextView input = findViewById(R.id.displayMatrix3);
//        input.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3
//                +"\n\nIterations: " +iter +"\n\nAngles: \n" +angleB1 + "\n" + angleB2 + "\n"
//                + angleB3  + "\n\nZ Matrix: \n"+ bar3MatrixFunction());

        TextView input = findViewById(R.id.displayMatrix3);
        input.setText("Voltages: \n" +voltage1 +"\n" +voltage2 + "\n" +voltage3
                +"\n\nIterations: " +iter +"\n\nAngles: \n" +angleB1 + "\n" +angleB2 + "\n"
                +angleB3  + "\n\nZ Matrix: \n"+ z11B + "  " + z12B + "  " + z13B + "\n"+
                z12B + "  " + z22B + "  " + z23B + "\n" + z13B + "  " + z23B + "  " + z33B + "\n\n Y Matrix: \n" + y11A + "  " + y12A + "  " + y13A + "\n"+
                y12A +  "  "  + y22A+ "  " +y23A + "\n" + y13A + "  " + y23A + "  " + y33A);
        //"\n\n Y Matrix: \n" + 1/z11A + " " + 1/z12A + " " + 1/z13A + "\n"+
        //                1/z12A +  " "  + 1/z22A+ " " +1/z23A + "\n" + 1/z13A + " " + 1/z23A + " " + 1/z33A

    }

//    public String bar3MatrixFunction(){
//
//        Intent intent1 = getIntent();
//
//}//
//        z11 = intent1.getStringExtra("Zbus 11:");
//        z12 = intent1.getStringExtra("Zbus 12:");
//        z13 = intent1.getStringExtra("Zbus 13:");
//        z22 = intent1.getStringExtra("Zbus 22:");
//        z23 = intent1.getStringExtra("Zbus 23:");
//        z33 = intent1.getStringExtra("Zbus 33:");
//
//        String zMatrix[][] = {
//                {z11, z12, z13},
//                {z12, z22, z23},
//                {z13, z23, z33},

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


//        };
//        Matrix A = new Matrix(zMatrix.toString());



//        System.out.print(zMatrix);
//        resultIntent.putExtra("Z matrix: ", zMatrix);
//
//        setResult(RESULT_OK, resultIntent);

//        return zMatrix.toString();
//    }

//    public String bar3YmatrixFunctions(){
//
//        Intent intent2 = getIntent();
//        z11 = intent2.getStringExtra("Zbus 11:");
//        z12 = intent2.getStringExtra("Zbus 12:");
//        z13 = intent2.getStringExtra("Zbus 13:");
//        z22 = intent2.getStringExtra("Zbus 22:");
//        z23 = intent2.getStringExtra("Zbus 23:");
//        z33 = intent2.getStringExtra("Zbus 33:");
//
//        String yMatrix[][] = {
//                {z11, z12, z13},
//                {z12, z22, z23},
//                {z13, z23, z33},
//        };
//
//        return yMatrix.toString();
//  }

    private class ComplexNum{
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

    public void calcButton(){
        Intent intent1 = getIntent();

        //calculate the Psch and Qsch
        //Psch
        String Pg = intent1.getStringExtra("Pg:");
        String Pg2 = intent1.getStringExtra("Pg2:");
        String Pload = intent1.getStringExtra("Pl:");

        String Psch;


        //Qsch

        //calculate the Pcalc and Qcalc
        String Pcalc, Qcalc, P, Q, p, q, V;
        int v1;
        int v2 = Integer.parseInt(voltage2);
        int v3 = Integer.parseInt(voltage3);

//        if((Y == y12A) && (Ang == angleB2)){
//            pc1 = Math.abs(V)*Math.abs(v)*Math.abs(y)*Math.cos(ang-D+d)+Math.abs(V)^2*Math.abs(Y)
//                    *Math.cos(Double.parseDouble(Ang));
//        }

        //private boolean isNotInteger(String u){

            try{
                v1 = Integer.parseInt(voltage1);

            }catch(NumberFormatException e){
                e.printStackTrace();

            }
        //}


//        if(){
//            P = Math.abs(v2)*Math.abs(v1)
//                    *Math.abs(y12A)*Math.cos(-+)+Math.abs(v2)^2*Math.abs(y22A)
//                    *Math.cos(Double.parseDouble(angleB2))+Math.abs(v2)
//                    *Math.abs(v3)*Math.abs(y23A)*Math.cos(-+));
//        }
//        if(){
//            p = Math.abs(Integer.parseInt(voltage3))*Math.abs(Integer.parseInt(voltage1))
//                    *Math.abs(y13A)*Math.cos(-+)+Math.abs(Integer.parseInt(voltage3))
//                    *Math.abs(Integer.parseInt(voltage2)*Math.abs(y23A)*Math.cos(-+)
//                    +Math.abs(Integer.parseInt(voltage3))^2*Math.abs(y33A)*Math.cos());
//        }
//        if(){
//
//        }

    }
}
