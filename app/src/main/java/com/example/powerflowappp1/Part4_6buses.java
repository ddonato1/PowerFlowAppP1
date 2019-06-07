package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Part4_6buses extends AppCompatActivity {
    EditText zbus11;
    EditText zbus12;
    EditText zbus13;
    EditText zbus14;
    EditText zbus15;
    EditText zbus16;
    EditText zbus22;
    EditText zbus23;
    EditText zbus24;
    EditText zbus25;
    EditText zbus26;
    EditText zbus33;
    EditText zbus34;
    EditText zbus35;
    EditText zbus36;
    EditText zbus44;
    EditText zbus45;
    EditText zbus46;
    EditText zbus55;
    EditText zbus56;
    EditText zbus66;
    private Button nextbuttonZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4_6buses);

        zbus11 = findViewById(R.id.Zbus11);
        zbus12 = findViewById(R.id.Zbus12);
        zbus13 = findViewById(R.id.Zbus13);
        zbus14 = findViewById(R.id.Zbus14);
        zbus15 = findViewById(R.id.Zbus15);
        zbus16 = findViewById(R.id.Zbus16);
        zbus22 = findViewById(R.id.Zbus22);
        zbus23 = findViewById(R.id.ZBus23);
        zbus24 = findViewById(R.id.Zbus24);
        zbus25 = findViewById(R.id.Zbus25);
        zbus26 = findViewById(R.id.Zbus26);
        zbus33 = findViewById(R.id.Zbus33);
        zbus34 = findViewById(R.id.Zbus34);
        zbus35 = findViewById(R.id.Zbus35);
        zbus36 = findViewById(R.id.Zbus36);
        zbus44 = findViewById(R.id.Zbus44);
        zbus45 = findViewById(R.id.Zbus45);
        zbus46 = findViewById(R.id.Zbus46);
        zbus55 = findViewById(R.id.Zbus55);
        zbus56 = findViewById(R.id.Zbus56);
        zbus66 = findViewById(R.id.Zbus66);

        nextbuttonZ = findViewById(R.id.nextbZ);
        nextbuttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextbuttonZ();
            }
        });

        Intent intent = getIntent();
    }

    private void nextbuttonZ(){
        Intent intent = new Intent(Part4_6buses.this, Part4_6buses.class);
        startActivity(intent);
    }
}
