package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Part4_7buses extends AppCompatActivity {
    EditText zbus11;
    EditText zbus12;
    EditText zbus13;
    EditText zbus14;
    EditText zbus15;
    EditText zbus16;
    EditText zbus17;
    EditText zbus22;
    EditText zbus23;
    EditText zbus24;
    EditText zbus25;
    EditText zbus26;
    EditText zbus27;
    EditText zbus33;
    EditText zbus34;
    EditText zbus35;
    EditText zbus36;
    EditText zbus37;
    EditText zbus44;
    EditText zbus45;
    EditText zbus46;
    EditText zbus47;
    EditText zbus55;
    EditText zbus56;
    EditText zbus57;
    EditText zbus66;
    EditText zbus67;
    EditText zbus77;
    private Button nextBUTZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Input7buses);

        zbus11 = findViewById(R.id.ZBus11);
        zbus12 = findViewById(R.id.ZBus12);
        zbus13 = findViewById(R.id.ZBus13);
        zbus14 = findViewById(R.id.ZBus14);
        zbus15 = findViewById(R.id.ZBus15);
        zbus16 = findViewById(R.id.ZBus16);
        zbus22 = findViewById(R.id.ZBus22);
        zbus23 = findViewById(R.id.ZBus23);
        zbus24 = findViewById(R.id.ZBus24);
        zbus25 = findViewById(R.id.ZBus25);
        zbus26 = findViewById(R.id.ZBus26);
        zbus27 = findViewById(R.id.ZBus27);
        zbus33 = findViewById(R.id.ZBus33);
        zbus34 = findViewById(R.id.ZBus34);
        zbus35 = findViewById(R.id.ZBus35);
        zbus36 = findViewById(R.id.ZBus36);
        zbus37 = findViewById(R.id.ZBus37);
        zbus44 = findViewById(R.id.ZBus44);
        zbus45 = findViewById(R.id.ZBus45);
        zbus46 = findViewById(R.id.ZBus46);
        zbus47 = findViewById(R.id.ZBus47);
        zbus55 = findViewById(R.id.ZBus55);
        zbus56 = findViewById(R.id.ZBus56);
        zbus57 = findViewById(R.id.ZBus57);
        zbus66 = findViewById(R.id.ZBus66);
        zbus67 = findViewById(R.id.ZBus67);
        zbus77 = findViewById(R.id.ZBus77);

        nextBUTZ = findViewById(R.id.NEXTBZ);
        nextBUTZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextBUTZ();
            }
        });

        Intent intent = getIntent();
    }

    private void nextBUTZ(){
        Intent intent = new Intent(Part4_7buses.this, Part4_1.class);
        startActivity(intent);
    }
}
