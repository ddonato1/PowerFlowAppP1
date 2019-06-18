package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_5buses extends AppCompatActivity {
    EditText zbus_11;
    EditText zbus_12;
    EditText zbus_13;
    EditText zbus_14;
    EditText zbus_15;
    EditText zbus_22;
    EditText zbus_23;
    EditText zbus_24;
    EditText zbus_25;
    EditText zbus_33;
    EditText zbus_34;
    EditText zbus_35;
    EditText zbus_44;
    EditText zbus_45;
    EditText zbus_55;
    private Button nextButtonZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input5buses);

        zbus_11 = findViewById(R.id.zbus11);
        zbus_12 = findViewById(R.id.zbus12);
        zbus_13 = findViewById(R.id.zbus13);
        zbus_14 = findViewById(R.id.zbus14);
        zbus_15 = findViewById(R.id.zbus15);
        zbus_22 = findViewById(R.id.zbus22);
        zbus_23 = findViewById(R.id.zbus23);
        zbus_24 = findViewById(R.id.zbus24);
        zbus_25 = findViewById(R.id.zbus25);
        zbus_33 = findViewById(R.id.zbus33);
        zbus_34 = findViewById(R.id.zbus34);
        zbus_35 = findViewById(R.id.zbus35);
        zbus_44 = findViewById(R.id.zbus44);
        zbus_45 = findViewById(R.id.zbus45);
        zbus_55 = findViewById(R.id.zbus55);

        nextButtonZ = findViewById(R.id.nextbZ);
        nextButtonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextButtonZ();
            }
        });

        Intent intent = getIntent();
    }

    private void nextButtonZ(){
        Intent intent = new Intent(Input_5buses.this, Functions5buses.class);
        startActivity(intent);
    }
}
