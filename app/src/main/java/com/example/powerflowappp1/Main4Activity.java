package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText volNum4;
    EditText volNum5;
    EditText iterNUM;
    private Button moveNextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        volNum1 = findViewById(R.id.Voltage1slack);
        volNum2 = findViewById(R.id.Voltage2);
        volNum3 = findViewById(R.id.Voltage3);
        volNum4 = findViewById(R.id.Voltage4);
        volNum5 = findViewById(R.id.Voltage5);
        iterNUM = findViewById(R.id.iterNUM1);

        moveNextB = findViewById(R.id.nextBut);
        moveNextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNextB();
            }
        });

        Intent intent = getIntent();
    }

    public void Savebutton_1(View view){
        String voltages1 = volNum1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
    }

    public void Savebutton_2(View view){
        String voltages2 = volNum2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
    }

    public void Savebutton_3(View view){
        String voltages3 = volNum3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
    }

    public void Savebutton_4(View view){
        String voltages4 = volNum4.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
    }

    public void Savebutton_5(View view){
        String voltages5 = volNum5.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages5, Toast.LENGTH_SHORT).show();
    }

    public void Savebutton_6(View view){
        String iterations = iterNUM.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
    }

    private void moveNextB(){
        Intent intent = new Intent(Main4Activity.this, Main9Activity.class);
        startActivity(intent);
    }
}
