package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText volNum4;
    EditText volNum5;
    EditText volNum6;
    EditText iterNum;
    private Button movenextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        volNum1 = findViewById(R.id.volta1);
        volNum2 = findViewById(R.id.volta2);
        volNum3 = findViewById(R.id.volta3);
        volNum4 = findViewById(R.id.volta4);
        volNum5 = findViewById(R.id.volta5);
        volNum6 = findViewById(R.id.volta6);
        iterNum = findViewById(R.id.iterNum);

        movenextB = findViewById(R.id.nextbutton);
        movenextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movenextB();
            }
        });

        Intent intent = getIntent();
    }


//    public void SaveButton1(View view){
//        String voltages1 = VOLTNUM1.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton2(View view){
//        String voltages2 = VOLTNUM2.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton3(View view){
//        String voltages3 = VOLTNUM3.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton4(View view){
//        String voltages4 = VOLTNUM4.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton5(View view){
//        String voltages5 = VOLTNUM5.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages5, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton6(View view){
//        String voltages6 = VOLTNUM6.getText().toString();
//
//        Toast.makeText(this, "Your answer has been saved: " +voltages6, Toast.LENGTH_SHORT).show();
//    }
//
//    public void SaveButton7(View view){
//        String iterations = ITERNUM.getText().toString();
//        int iterNUMF = Integer.parseInt(iterations);
//
//        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
//    }

    private void movenextB(){
        String voltages1 = volNum1.getText().toString();
        String voltages2 = volNum2.getText().toString();
        String voltages3 = volNum3.getText().toString();
        String voltages4 = volNum4.getText().toString();
        String voltages5 = volNum5.getText().toString();

        String iterations = iterNum.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Your answer has been saved: " , Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(Main5Activity.this, Part3of6buses.class);
        startActivity(intent);
    }
}
