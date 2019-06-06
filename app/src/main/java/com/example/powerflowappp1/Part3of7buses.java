package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Part3of7buses extends AppCompatActivity {
    EditText angulo_1;
    EditText angulo_2;
    EditText angulo_3;
    EditText angulo_4;
    EditText angulo_5;
    EditText angulo_6;
    EditText angulo_7;
    private Button moveNextbutA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part3_7buses);

        angulo_1 = findViewById(R.id.ang1);
        angulo_2 = findViewById(R.id.ang2);
        angulo_3 = findViewById(R.id.ang3);
        angulo_4 = findViewById(R.id.ang4);
        angulo_5 = findViewById(R.id.ang5);
        angulo_6 = findViewById(R.id.ang6);
        angulo_7 = findViewById(R.id.ang7);

        moveNextbutA = findViewById(R.id.NButton);
        moveNextbutA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNextbutA();
            }
        });

        Intent intent = getIntent();
    }

    public void sbuttonAngle1(View view){
        String angles1 = angulo_1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles1, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle2(View view){
        String angles2 = angulo_2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles2, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle3(View view){
        String angles3 = angulo_3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles3, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle4(View view){
        String angles4 = angulo_4.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles4, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle5(View view){
        String angles5 = angulo_5.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles5, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle6(View view){
        String angles6 = angulo_6.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles6, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle7(View view){
        String angles7 = angulo_7.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles7, Toast.LENGTH_SHORT).show();
    }

    private void moveNextbutA(){
        Intent intent = new Intent(Part3of7buses.this, Part4_1.class);
        startActivity(intent);
    }
}
