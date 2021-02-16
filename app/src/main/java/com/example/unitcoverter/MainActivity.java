package com.example.unitcoverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        //Spinner

        spinner = findViewById(R.id.spinner);
        tv = (TextView)findViewById(R.id.converter_title);

        String [] converters = {"Select One","Fahrenheit to Celsius", "Pound to Kilogram", "Mile to kilometer", "Ounce to Milliliter", "Feet to Meter"};

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, converters);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);



        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(parent.getId() == R.id.spinner) {
                    String valueFromSpinner = parent.getItemAtPosition(position).toString();
                }

                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    tv.setText("");
                }
                else {
                    tv.setText(converters[position]);
                    tv.setTextSize(30);
                }


                switch(position) {
                    case 1:

                        Button fbtn = findViewById(R.id.convert_btn);

                        EditText finput = findViewById(R.id.cv_input);
                        TextView ctxt = findViewById(R.id.cv_text);
                        fbtn.setOnClickListener(v -> {
                            if (finput.getText().length() == 0)
                                return;
                            double celsius = Converter.toCelsius(Float.parseFloat(finput.getText().toString()));
                            ctxt.setText(String.format("%.2f ºC", celsius));

                        });
                        break;

                    case 2:

                        Button fbtn2 = findViewById(R.id.convert_btn);

                        EditText finput2 = findViewById(R.id.cv_input);
                        TextView ctxt2 = findViewById(R.id.cv_text);
                        fbtn2.setOnClickListener(v -> {
                            if (finput2.getText().length() == 0)
                                return;
                            double kilogram = Converter.toKilogram(Float.parseFloat(finput2.getText().toString()));
                            ctxt2.setText(String.format("%.2f kg", kilogram));
                        });
                        break;

                    case 3:

                        Button fbtn3 = findViewById(R.id.convert_btn);

                        EditText finput3 = findViewById(R.id.cv_input);
                        TextView ctxt3 = findViewById(R.id.cv_text);
                        fbtn3.setOnClickListener(v -> {
                            if (finput3.getText().length() == 0)
                                return;
                            double kilometer = Converter.toKilometer(Float.parseFloat(finput3.getText().toString()));
                            ctxt3.setText(String.format("%.2f km", kilometer));
                        });
                        break;

                    case 4:

                        Button fbtn4 = findViewById(R.id.convert_btn);

                        EditText finput4 = findViewById(R.id.cv_input);
                        TextView ctxt4 = findViewById(R.id.cv_text);
                        fbtn4.setOnClickListener(v -> {
                            if (finput4.getText().length() == 0)
                                return;
                            double Milliliter = Converter.toMilliliter(Float.parseFloat(finput4.getText().toString()));
                            ctxt4.setText(String.format("%.2f ml", Milliliter));
                        });
                        break;

                    case 5:

                        Button fbtn5 = findViewById(R.id.convert_btn);

                        EditText finput5 = findViewById(R.id.cv_input);
                        TextView ctxt5 = findViewById(R.id.cv_text);
                        fbtn5.setOnClickListener(v -> {
                            if (finput5.getText().length() == 0)
                                return;
                            double Meter = Converter.toMeter(Float.parseFloat(finput5.getText().toString()));
                            ctxt5.setText(String.format("%.2f m", Meter));
                        });
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}