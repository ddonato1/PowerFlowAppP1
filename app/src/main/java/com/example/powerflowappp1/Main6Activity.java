package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    EditText volnum1;
    EditText volnum2;
    EditText volnum3;
    EditText volnum4;
    EditText volnum5;
    EditText volnum6;
    EditText volnum7;
    EditText IterNum;
    private Button moveNextbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        volnum1 = findViewById(R.id.voltS1);
        volnum2 = findViewById(R.id.voltage2);
        volnum3 = findViewById(R.id.voltage3);
        volnum4 = findViewById(R.id.voltage4);
        volnum5 = findViewById(R.id.voltage5);
        volnum6 = findViewById(R.id.voltage6);
        volnum7 = findViewById(R.id.voltage7);
        IterNum = findViewById(R.id.iternumber);

        moveNextbut = findViewById(R.id.NextButton);
        moveNextbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNextbut();
            }
        });

        Intent intent = getIntent();
    }

    public void SaveButton_1(View view){
        String voltages1 = volnum1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_2(View view){
        String voltages2 = volnum2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_3(View view){
        String voltages3 = volnum3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_4(View view){
        String voltages4 = volnum4.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_5(View view){
        String voltages5 = volnum5.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages5, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_6(View view){
        String voltages6 = volnum6.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages6, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_7(View view){
        String voltages7 = volnum7.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages7, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton_8(View view){
        String iterations = IterNum.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
    }

    private void moveNextbut(){
        Intent intent = new Intent(Main6Activity.this, Part3of7buses.class);
        startActivity(intent);
    }
}
