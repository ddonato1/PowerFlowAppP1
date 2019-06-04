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

        movButton1 = findViewById(R.id.busesQ1);
        movButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton1();
            }
        });

        movButton2 = findViewById(R.id.busesQ2);
        movButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton2();
            }
        });
    }

    private void moveButton1(){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    private void moveButton2(){
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
}
