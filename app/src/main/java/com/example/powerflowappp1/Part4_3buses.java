package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Part4_3buses extends AppCompatActivity {

    EditText zbus_11;
    EditText zbus_12;
    EditText zbus_13;
    EditText zbus_22;
    EditText zbus_23;
    EditText zbus_33;

    private Button nextButtonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4_3buses);

        zbus_11 = findViewById(R.id.zbus11);
        zbus_12 = findViewById(R.id.zbus12);
        zbus_13 = findViewById(R.id.zbus13);
        zbus_22 = findViewById(R.id.zbus22);
        zbus_23 = findViewById(R.id.zbus23);
        zbus_33 = findViewById(R.id.zbus33);

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
        Intent intent = new Intent(Part4_3buses.this, Part4_3buses.class);
        startActivity(intent);
    }
}
