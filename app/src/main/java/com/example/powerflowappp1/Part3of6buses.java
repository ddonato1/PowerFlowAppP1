package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Part3of6buses extends AppCompatActivity {
    EditText ang1;
    EditText ang2;
    EditText ang3;
    EditText ang4;
    EditText ang5;
    EditText ang6;
    private Button moveNextButA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part3_7buses);

        ang1 = findViewById(R.id.angulo1);
        ang2 = findViewById(R.id.angulo2);
        ang3 = findViewById(R.id.angulo3);
        ang4 = findViewById(R.id.angulo4);
        ang5 = findViewById(R.id.angulo5);
        ang6 = findViewById(R.id.angulo6);

        moveNextButA = findViewById(R.id.nextButP3);
        moveNextButA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNextButA();
            }
        });

        Intent intent = getIntent();
    }

    public void sbuttonAngle1(View view){
        String angles1 = ang1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles1, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle2(View view){
        String angles2 = ang2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles2, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle3(View view){
        String angles3 = ang3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles3, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle4(View view){
        String angles4 = ang4.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles4, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle5(View view){
        String angles5 = ang5.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles5, Toast.LENGTH_SHORT).show();
    }

    public void sbuttonAngle6(View view){
        String angles6 = ang6.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +angles6, Toast.LENGTH_SHORT).show();
    }

    private void moveNextButA(){
        Intent intent = new Intent(Part3of6buses.this, Part3of6buses.class);
        startActivity(intent);
    }
}
