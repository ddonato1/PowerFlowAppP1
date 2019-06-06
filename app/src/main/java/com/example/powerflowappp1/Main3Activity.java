package com.example.powerflowappp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText volNum1;
    EditText volNum2;
    EditText volNum3;
    EditText volNum4;
    EditText iterNum;
    private Button movenext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        volNum1 = findViewById(R.id.volt_1);
        volNum2 = findViewById(R.id.volt_2);
        volNum3 = findViewById(R.id.volt_3);
        volNum4 = findViewById(R.id.volt_4);
        iterNum = findViewById(R.id.num_Iter);

        movenext = findViewById(R.id.Nextbut);
        movenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movenext();
            }
        });

        Intent intent = getIntent();
    }

    public void saveButton_1(View view){
        String voltages1 = volNum1.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages1, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_2(View view){
        String voltages2 = volNum2.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages2, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_3(View view){
        String voltages3 = volNum3.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages3, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_4(View view){
        String voltages4 = volNum4.getText().toString();

        Toast.makeText(this, "Your answer has been saved: " +voltages4, Toast.LENGTH_SHORT).show();
    }

    public void saveButton_5(View view){
        String iterations = iterNum.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Your answer has been saved: " +iterNUMF, Toast.LENGTH_SHORT).show();
    }

    private void movenext(){
        Intent intent = new Intent(Main3Activity.this, Main8Activity.class);
        startActivity(intent);
    }
}
