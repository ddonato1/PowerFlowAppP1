package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input_7buses extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText volNum4;
    EditText volNum5;
    EditText volNum6;
    EditText volNum7;
    EditText iterNum;
    EditText angNum1;
    EditText angNum2;
    EditText angNum3;
    EditText angNum4;
    EditText angNum5;
    EditText angNum6;
    EditText angNum7;
    EditText zbus_11;
    EditText zbus_12;
    EditText zbus_13;
    EditText zbus_14;
    EditText zbus_15;
    EditText zbus_16;
    EditText zbus_17;
    EditText zbus_22;
    EditText zbus_23;
    EditText zbus_24;
    EditText zbus_25;
    EditText zbus_26;
    EditText zbus_27;
    EditText zbus_33;
    EditText zbus_34;
    EditText zbus_35;
    EditText zbus_36;
    EditText zbus_37;
    EditText zbus_44;
    EditText zbus_45;
    EditText zbus_46;
    EditText zbus_47;
    EditText zbus_55;
    EditText zbus_56;
    EditText zbus_57;
    EditText zbus_66;
    EditText zbus_67;
    EditText zbus_77;
    private Button nextBUTZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input7buses);

        volNum1 = findViewById(R.id.voltS1);
        volNum2 = findViewById(R.id.voltage2);
        volNum3 = findViewById(R.id.voltage3);
        volNum4 = findViewById(R.id.voltage4);
        volNum5 = findViewById(R.id.voltage5);
        volNum6 = findViewById(R.id.voltage6);
        volNum7 = findViewById(R.id.voltage7);
        iterNum = findViewById(R.id.numITER);
        angNum1 = findViewById(R.id.ang1);
        angNum2 = findViewById(R.id.ang2);
        angNum3 = findViewById(R.id.ang3);
        angNum4 = findViewById(R.id.ang4);
        angNum5 = findViewById(R.id.ang5);
        angNum6 = findViewById(R.id.ang6);
        angNum7 = findViewById(R.id.ang7);
        zbus_11 = findViewById(R.id.ZBus11);
        zbus_12 = findViewById(R.id.ZBus12);
        zbus_13 = findViewById(R.id.ZBus13);
        zbus_14 = findViewById(R.id.ZBus14);
        zbus_15 = findViewById(R.id.ZBus15);
        zbus_16 = findViewById(R.id.ZBus16);
        zbus_22 = findViewById(R.id.ZBus22);
        zbus_23 = findViewById(R.id.ZBus23);
        zbus_24 = findViewById(R.id.ZBus24);
        zbus_25 = findViewById(R.id.ZBus25);
        zbus_26 = findViewById(R.id.ZBus26);
        zbus_27 = findViewById(R.id.ZBus27);
        zbus_33 = findViewById(R.id.ZBus33);
        zbus_34 = findViewById(R.id.ZBus34);
        zbus_35 = findViewById(R.id.ZBus35);
        zbus_36 = findViewById(R.id.ZBus36);
        zbus_37 = findViewById(R.id.ZBus37);
        zbus_44 = findViewById(R.id.ZBus44);
        zbus_45 = findViewById(R.id.ZBus45);
        zbus_46 = findViewById(R.id.ZBus46);
        zbus_47 = findViewById(R.id.ZBus47);
        zbus_55 = findViewById(R.id.ZBus55);
        zbus_56 = findViewById(R.id.ZBus56);
        zbus_57 = findViewById(R.id.ZBus57);
        zbus_66 = findViewById(R.id.ZBus66);
        zbus_67 = findViewById(R.id.ZBus67);
        zbus_77 = findViewById(R.id.ZBus77);

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
        String voltages1 = volNum1.getText().toString();
        String voltages2 = volNum2.getText().toString();
        String voltages3 = volNum3.getText().toString();
        String voltages4 = volNum4.getText().toString();
        String voltages5 = volNum5.getText().toString();
        String voltages6 = volNum6.getText().toString();
        String voltages7 = volNum7.getText().toString();
        String iterations = iterNum.getText().toString();
        String angles1 = angNum1.getText().toString();
        String angles2 = angNum2.getText().toString();
        String angles3 = angNum3.getText().toString();
        String angles4 = angNum4.getText().toString();
        String angles5 = angNum5.getText().toString();
        String angles6 = angNum6.getText().toString();
        String angles7 = angNum7.getText().toString();
        String zbus11 = zbus_11.getText().toString();
        String zbus12 = zbus_12.getText().toString();
        String zbus13 = zbus_13.getText().toString();
        String zbus14 = zbus_14.getText().toString();
        String zbus15 = zbus_15.getText().toString();
        String zbus16 = zbus_16.getText().toString();
        String zbus17 = zbus_17.getText().toString();
        String zbus21 = zbus_12.getText().toString();
        String zbus22 = zbus_22.getText().toString();
        String zbus23 = zbus_23.getText().toString();
        String zbus24 = zbus_24.getText().toString();
        String zbus25 = zbus_25.getText().toString();
        String zbus26 = zbus_26.getText().toString();
        String zbus27 = zbus_27.getText().toString();
        String zbus31 = zbus_13.getText().toString();
        String zbus32 = zbus_23.getText().toString();
        String zbus33 = zbus_33.getText().toString();
        String zbus34 = zbus_34.getText().toString();
        String zbus35 = zbus_35.getText().toString();
        String zbus36 = zbus_36.getText().toString();
        String zbus37 = zbus_37.getText().toString();
        String zbus41 = zbus_14.getText().toString();
        String zbus42 = zbus_24.getText().toString();
        String zbus43 = zbus_34.getText().toString();
        String zbus44 = zbus_44.getText().toString();
        String zbus45 = zbus_45.getText().toString();
        String zbus46 = zbus_46.getText().toString();
        String zbus47 = zbus_47.getText().toString();
        String zbus51 = zbus_15.getText().toString();
        String zbus52 = zbus_25.getText().toString();
        String zbus53 = zbus_35.getText().toString();
        String zbus54 = zbus_45.getText().toString();
        String zbus55 = zbus_55.getText().toString();
        String zbus56 = zbus_56.getText().toString();
        String zbus57 = zbus_57.getText().toString();
        String zbus61 = zbus_16.getText().toString();
        String zbus62 = zbus_26.getText().toString();
        String zbus63 = zbus_36.getText().toString();
        String zbus64 = zbus_46.getText().toString();
        String zbus65 = zbus_56.getText().toString();
        String zbus66 = zbus_66.getText().toString();
        String zbus67 = zbus_67.getText().toString();
        String zbus71 = zbus_17.getText().toString();
        String zbus72 = zbus_27.getText().toString();
        String zbus73 = zbus_37.getText().toString();
        String zbus74 = zbus_47.getText().toString();
        String zbus75 = zbus_57.getText().toString();
        String zbus76 = zbus_67.getText().toString();
        String zbus77 = zbus_77.getText().toString();

        Intent intent = new Intent(Input_7buses.this, Functions7buses.class);
        intent.putExtra("Voltage 1:", voltages1);
        intent.putExtra("Voltage 2:", voltages2);
        intent.putExtra("Voltage 3:", voltages3);
        intent.putExtra("Voltage 4:", voltages4);
        intent.putExtra("Voltage 5:", voltages5);
        intent.putExtra("Voltage 6:", voltages6);
        intent.putExtra("Voltage 7:", voltages7);
        intent.putExtra("Iterations:", iterations);
        intent.putExtra("Angle 1:", angles1);
        intent.putExtra("Angle 2:", angles2);
        intent.putExtra("Angle 3:", angles3);
        intent.putExtra("Angle 4:", angles4);
        intent.putExtra("Angle 5:", angles5);
        intent.putExtra("Angle 6:", angles6);
        intent.putExtra("Angle 7:", angles7);
        intent.putExtra("Zbus 11:", zbus11);
        intent.putExtra("Zbus 12:", zbus12);
        intent.putExtra("Zbus 13:", zbus13);
        intent.putExtra("Zbus 14:", zbus14);
        intent.putExtra("Zbus 15:", zbus15);
        intent.putExtra("Zbus 16:", zbus16);
        intent.putExtra("Zbus 17:", zbus17);
        intent.putExtra("Zbus 21:", zbus21);
        intent.putExtra("Zbus 22:", zbus22);
        intent.putExtra("Zbus 23:", zbus23);
        intent.putExtra("Zbus 24:", zbus24);
        intent.putExtra("Zbus 25:", zbus25);
        intent.putExtra("Zbus 26:", zbus26);
        intent.putExtra("Zbus 27:", zbus27);
        intent.putExtra("Zbus 31:", zbus31);
        intent.putExtra("Zbus 32:", zbus32);
        intent.putExtra("Zbus 33:", zbus33);
        intent.putExtra("Zbus 34:", zbus34);
        intent.putExtra("Zbus 35:", zbus35);
        intent.putExtra("Zbus 36:", zbus36);
        intent.putExtra("Zbus 37:", zbus37);
        intent.putExtra("Zbus 41:", zbus41);
        intent.putExtra("Zbus 42:", zbus42);
        intent.putExtra("Zbus 43:", zbus43);
        intent.putExtra("Zbus 44:", zbus44);
        intent.putExtra("Zbus 45:", zbus45);
        intent.putExtra("Zbus 46:", zbus46);
        intent.putExtra("Zbus 47:", zbus47);
        intent.putExtra("Zbus 51:", zbus51);
        intent.putExtra("Zbus 52:", zbus52);
        intent.putExtra("Zbus 53:", zbus53);
        intent.putExtra("Zbus 54:", zbus54);
        intent.putExtra("Zbus 55:", zbus55);
        intent.putExtra("Zbus 56:", zbus56);
        intent.putExtra("Zbus 57:", zbus57);
        intent.putExtra("Zbus 61:", zbus61);
        intent.putExtra("Zbus 62:", zbus62);
        intent.putExtra("Zbus 63:", zbus63);
        intent.putExtra("Zbus 64:", zbus64);
        intent.putExtra("Zbus 65:", zbus65);
        intent.putExtra("Zbus 66:", zbus66);
        intent.putExtra("Zbus 67:", zbus67);
        intent.putExtra("Zbus 71:", zbus71);
        intent.putExtra("Zbus 72:", zbus72);
        intent.putExtra("Zbus 73:", zbus73);
        intent.putExtra("Zbus 74:", zbus74);
        intent.putExtra("Zbus 75:", zbus75);
        intent.putExtra("Zbus 76:", zbus76);
        intent.putExtra("Zbus 77:", zbus77);
        startActivity(intent);
    }
}
