package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText iterNum;
    private Button moveNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        volNum1 = findViewById(R.id.volt1);
        volNum2 = findViewById(R.id.volt2);
        volNum3 = findViewById(R.id.volt3);
        iterNum = findViewById(R.id.numIter);

        moveNext = findViewById(R.id.next);
        moveNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext();
            }
        });

        Intent intent = getIntent();
    }

    /*public void saveButton_1(View view){
        String voltages1 = volNum1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_2(View view){
        String voltages2 = volNum2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_3(View view){
        String voltages3 = volNum3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_4(View view){
        String iterations = iterNum.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
    }*/

    /*private void moveNext(){
        Intent intent = new Intent(Main2Activity.this, Part3of3buses.class);
        startActivity(intent);
    }*/
    private void moveNext(){
        String voltages1 = volNum1.getText().toString();
        String voltages2 = volNum2.getText().toString();
        String voltages3 = volNum3.getText().toString();
        String iterations = iterNum.getText().toString();
        //int iterNUMF = Integer.parseInt(iterations);
        Intent intent = new Intent(Main2Activity.this, Part4_1.class);
        intent.putExtra("Voltage 1: ", voltages1);
        intent.putExtra("Voltage 2: ", voltages2);
        intent.putExtra("Voltage 3: ", voltages3);
        intent.putExtra("Iterations: ", iterations);
        startActivity(intent);
    }
}
