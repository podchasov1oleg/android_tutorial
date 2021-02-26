package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_digits);

        EditText numberOne = findViewById(R.id.numberOne);
        EditText numberTwo = findViewById(R.id.numberTwo);
        Button btnCompare = findViewById(R.id.btnCompare);
        TextView result = findViewById(R.id.result);

        btnCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer valOne = Integer.valueOf(numberOne.getText().toString());
                    Integer valTwo = Integer.valueOf(numberTwo.getText().toString());

                    if (valOne.equals(valTwo)) {
                        result.setText("Equals");
                    } else {
                        result.setText("Not equals");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Please enter two numbers");
                }
            }
        });
    }
}