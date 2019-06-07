package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Part4_4buses extends AppCompatActivity {

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
        setContentView(R.layout.activity_part4_4buses);

        Intent intent = getIntent();
    }
}
