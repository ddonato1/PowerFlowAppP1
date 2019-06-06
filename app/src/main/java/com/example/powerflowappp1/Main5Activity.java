package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText VOLTNUM1;
    EditText VOLTNUM2;
    EditText VOLTNUM3;
    EditText VOLTNUM4;
    EditText VOLTNUM5;
    EditText VOLTNUM6;
    EditText ITERNUM;
    private Button movenextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        VOLTNUM1 = findViewById(R.id.volta1);
        VOLTNUM2 = findViewById(R.id.volta2);
        VOLTNUM3 = findViewById(R.id.volta3);
        VOLTNUM4 = findViewById(R.id.volta4);
        VOLTNUM5 = findViewById(R.id.volta5);
        VOLTNUM6 = findViewById(R.id.volta6);
        ITERNUM = findViewById(R.id.iterNum);

        movenextB = findViewById(R.id.nextbutton);
        movenextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movenextB();
            }
        });

//        VOLTNUM1.setOnClickListener(this);
//        VOLTNUM2.setOnClickListener(this);
//        VOLTNUM3.setOnClickListener(this);
//        VOLTNUM4.setOnClickListener(this);
//        VOLTNUM5.setOnClickListener(this);
//        VOLTNUM6.setOnClickListener(this);
//        ITERNUM.setOnClickListener(this);

        Intent intent = getIntent();
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.volta1:
//                String voltages1 = VOLTNUM1.getText().toString();
//                Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.volta2:
//                String voltages2 = VOLTNUM2.getText().toString();
//                Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.volta3:
//                String voltages3 = VOLTNUM3.getText().toString();
//                Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.volta4:
//                String voltages4 = VOLTNUM4.getText().toString();
//                Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.volta5:
//                String voltages5 = VOLTNUM5.getText().toString();
//                Toast.makeText(this, "Your answer has been saved: " +voltages5, Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.volta6:
//                String voltages6 = VOLTNUM6.getText().toString();
//                Toast.makeText(this, "Your answer has been saved: " +voltages6, Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.iterNum:
//                String iterations = ITERNUM.getText().toString();
//                int iterNUMF = Integer.parseInt(iterations);
//                Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }

    public void SaveButton1(View view){
        String voltages1 = VOLTNUM1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton2(View view){
        String voltages2 = VOLTNUM2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton3(View view){
        String voltages3 = VOLTNUM3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton4(View view){
        String voltages4 = VOLTNUM4.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton5(View view){
        String voltages5 = VOLTNUM5.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages5, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton6(View view){
        String voltages6 = VOLTNUM6.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages6, Toast.LENGTH_SHORT).show();
    }

    public void SaveButton7(View view){
        String iterations = ITERNUM.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
    }

    private void movenextB(){
        Intent intent = new Intent(Main5Activity.this, Part3of6buses.class);
        startActivity(intent);
    }
}
