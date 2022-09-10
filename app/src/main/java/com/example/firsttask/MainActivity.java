package com.example.firsttask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btREsult;
    TextView tvResult;
    EditText etFirstNumber, etSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btREsult = findViewById(R.id.btResult);
        tvResult = findViewById(R.id.tvResult);
        etFirstNumber = findViewById(R.id.etFirstNumber);
        etSecondNumber = findViewById(R.id.etSecondNumber);

        btREsult.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int result = -999;
        int firstN = Integer.parseInt(etFirstNumber.getText().toString());
        int secondN = Integer.parseInt(etSecondNumber.getText().toString());

        if (btREsult == view){

            result = firstN + secondN;
        }

        tvResult.setText("RESULT: " + result);
    }
}