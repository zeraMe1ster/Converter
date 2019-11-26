package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etMeter;
    private Button btnConvert;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMeter = findViewById(R.id.etMeter);
        btnConvert = findViewById(R.id.btnConvert);
        tvResult = findViewById(R.id.tvResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Conversion logic

                double multiplier = 39.37;
                double result = 0.0;

                if(etMeter.getText().equals("")){
                    tvResult.setText(R.string.error_name);
                    tvResult.setTextColor(Color.RED);

                } else {

                    double meterValue = Double.parseDouble(etMeter.getText().toString());

                    result = meterValue * multiplier;

                    tvResult.setText(String.format("%.2f", result + " inches"));

                }



            }
        });


    }
}
