package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Part3of3buses extends AppCompatActivity {

    EditText angNum1;
    EditText angNum2;
    EditText angNum3;
    private Button moveNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part3_3buses);

        angNum1 = findViewById(R.id.angle1);
        angNum2 = findViewById(R.id.angle2);
        angNum3 = findViewById(R.id.angle3);

        moveNext = findViewById(R.id.nextP3);
        moveNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext();
            }
        });

        Intent intent = getIntent();
    }

    public void saveButton_1(View view){
        String angle1 = angNum1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angle1, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_2(View view){
        String angle2 = angNum2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angle2, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_3(View view){
        String angle3 = angNum3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angle3, Toast.LENGTH_SHORT).show();
    }

    private void moveNext(){
        Intent intent = new Intent(Part3of3buses.this, Part4_4buses.class);
        startActivity(intent);
    }


}
