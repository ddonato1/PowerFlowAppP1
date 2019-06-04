package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText volNum1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        volNum1 = findViewById(R.id.volt1);

        Intent intent = getIntent();
    }

    public void saveButton_1(View view){
        String voltages1 = volNum1.getText().toString();
        
        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
    }
}
