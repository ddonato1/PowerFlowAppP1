package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_4buses extends AppCompatActivity {

    EditText zbus_11;
    EditText zbus_12;
    EditText zbus_13;
    EditText zbus_14;
    EditText zbus_22;
    EditText zbus_23;
    EditText zbus_24;
    EditText zbus_33;
    EditText zbus_34;
    EditText zbus_44;

    private Button nextButtonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input4buses);

        zbus_11 = findViewById(R.id.Z11);
        zbus_12 = findViewById(R.id.Z12);
        zbus_13 = findViewById(R.id.Z13);
        zbus_14 = findViewById(R.id.Z14);
        zbus_22 = findViewById(R.id.Z22);
        zbus_23 = findViewById(R.id.Z23);
        zbus_24 = findViewById(R.id.Z24);
        zbus_33 = findViewById(R.id.Z33);
        zbus_34 = findViewById(R.id.Z34);
        zbus_44 = findViewById(R.id.Z44);

        nextButtonZ = findViewById(R.id.nextP44B);
        nextButtonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextButtonZ();
            }
        });

        Intent intent = getIntent();
    }

    private void nextButtonZ(){
        Intent intent = new Intent(Input_4buses.this, Functions4buses.class);
        startActivity(intent);
    }
}
