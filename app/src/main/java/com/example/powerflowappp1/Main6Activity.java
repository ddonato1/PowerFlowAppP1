package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        Intent intent = getIntent();
    }

    public void SaveButton_1(View view){
        String voltages1 = volNum1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_2(View view){
        String voltages2 = volNum2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_3(View view){
        String voltages3 = volNum3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_4(View view){
        String voltages4 = volNum4.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_5(View view){
        String voltages5 = volNum5.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages5, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_6(View view){
        String voltages6 = volNum6.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages6, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_7(View view){
        String voltages7 = volNum7.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages7, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_8(View view){
        String iterations = iterNum.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
    }
}
