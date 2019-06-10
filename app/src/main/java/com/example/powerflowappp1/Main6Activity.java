package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText volNum4;
    EditText volNum5;
    EditText volNum6;
    EditText volNum7;
    EditText iterNum;
    private Button moveNextbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        volNum1 = findViewById(R.id.voltS1);
        volNum2 = findViewById(R.id.voltage2);
        volNum3 = findViewById(R.id.voltage3);
        volNum4 = findViewById(R.id.voltage4);
        volNum5 = findViewById(R.id.voltage5);
        volNum6 = findViewById(R.id.voltage6);
        volNum7 = findViewById(R.id.voltage7);
        iterNum = findViewById(R.id.iternumber);

        moveNextbut = findViewById(R.id.NextButton);
        moveNextbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNextbut();
            }
        });

        Intent intent = getIntent();
    }

//    public void SaveButton_1(View view){
//        String voltages1 = volnum1.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton_2(View view){
//        String voltages2 = volnum2.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton_3(View view){
//        String voltages3 = volnum3.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton_4(View view){
//        String voltages4 = volnum4.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton_5(View view){
//        String voltages5 = volnum5.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages5, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton_6(View view){
//        String voltages6 = volnum6.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages6, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton_7(View view){
//        String voltages7 = volnum7.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages7, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton_8(View view){
//        String iterations = IterNum.getText().toString();
//        int iterNUMF = Integer.parseInt(iterations);
//
//        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
//    }

    private void moveNextbut(){
        String voltages1 = volNum1.getText().toString();
        String voltages2 = volNum2.getText().toString();
        String voltages3 = volNum3.getText().toString();
        String voltages4 = volNum4.getText().toString();
        String voltages5 = volNum5.getText().toString();
        String voltages6 = volNum6.getText().toString();
        String voltages7 = volNum7.getText().toString();

        String iterations = iterNum.getText().toString();
        //int iterNUMF = Integer.parseInt(iterations);

        //Toast.makeText(this, "Your answer has been saved: " , Toast.LENGTH_SHORT).show();


        Intent intent5 = new Intent(Main6Activity.this, Part3of7buses.class);
        intent5.putExtra("Voltage 1: ", voltages1);
        intent5.putExtra("Voltage 2: ", voltages2);
        intent5.putExtra("Voltage 3: ", voltages3);
        intent5.putExtra("Voltage 4: ", voltages4);
        intent5.putExtra("Voltage 5: ", voltages5);
        intent5.putExtra("Voltage 6: ", voltages6);
        intent5.putExtra("Voltage 7: ", voltages7);
        intent5.putExtra("Iterations: ", iterations);
        startActivity(intent5);
    }
}
