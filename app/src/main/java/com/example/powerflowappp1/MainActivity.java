package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button movButton1;
    private Button movButton2;
    private Button movButton3;
    private Button movButton4;
    private Button movButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3 buses
        movButton1 = findViewById(R.id.busesQ1);
        movButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton1();
            }
        });
        //4 buses
        movButton2 = findViewById(R.id.busesQ2);
        movButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton2();
            }
        });
        //5 buses
        movButton3 = findViewById(R.id.busesQ3);
        movButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton3();
            }
        });
        //6 buses
        movButton4 = findViewById(R.id.busesQ4);
        movButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton4();
            }
        });
        //7 buses
        movButton5 = findViewById(R.id.busesQ5);
        movButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton5();
            }
        });

    }
    // 3 buses
    private void moveButton1(){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    //4 buses
    private void moveButton2(){
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
    //5 buses
    private void moveButton3(){
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }
    //6 buses
    private void moveButton4(){
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }
    //7 buses
    private void moveButton5(){
        Intent intent = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(intent);
    }
}
