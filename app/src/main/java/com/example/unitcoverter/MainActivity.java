package com.example.unitcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fbtn = findViewById(R.id.convert_btn);

        EditText finput = findViewById(R.id.fahrenheit_input);
        TextView ctxt = findViewById(R.id.celcius_text);
        fbtn.setOnClickListener(v -> {
                    if (finput.getText().length() == 0)
                        return;
                    double celsius = Converter.toCelsius(Float.parseFloat(finput.getText().toString()));
                    ctxt.setText(String.format("%.2f ºC", celsius));

        });




        Button fbtn2 = findViewById(R.id.convert2_btn);

        EditText finput2 = findViewById(R.id.pound_input);
        TextView ctxt2 = findViewById(R.id.kilogram_text);
        fbtn2.setOnClickListener(v -> {
            if (finput2.getText().length() == 0)
                return;
            double kilogram = Converter.toKilogram(Float.parseFloat(finput2.getText().toString()));
            ctxt2.setText(String.format("%.2f kg", kilogram));
        });
    }
}