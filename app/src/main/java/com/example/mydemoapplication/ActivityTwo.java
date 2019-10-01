package com.example.mydemoapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {
    EditText msg;
    Button sum;
    Button diff;
    Button product;
    Button quotient;
    Button remainder;
    Button convert;

    TextView result;

    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.act_two);

        msg = findViewById(R.id.msg);
        sum = findViewById(R.id.sum);
        diff = findViewById(R.id.diff);
        product = findViewById(R.id.product);
        quotient = findViewById(R.id.quotient);
        remainder = findViewById(R.id.remainder);
        result = findViewById(R.id.result);
        convert = findViewById(R.id.convert);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = msg.getText().toString();
                int number = Integer.parseInt(message);
                int sum = number + number;

                result.setText(sum+"");
            }
        });

        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = msg.getText().toString();
                int number = Integer.parseInt(message);
                int diff = number - number;

                result.setText(diff+"");
            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = msg.getText().toString();
                int number = Integer.parseInt(message);
                int product = number * number;

                result.setText(product+"");
            }
        });

        quotient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = msg.getText().toString();
                int number = Integer.parseInt(message);
                int quotient = number / number;

                result.setText(quotient+"");
            }
        });

        remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = msg.getText().toString();
                int number = Integer.parseInt(message);
                int remainder = number % number;

                result.setText(remainder+"");
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = msg.getText().toString();
                int number = Integer.parseInt(message);
                int convert = number / 60;
                int rem = number % 60;

                result.setText(convert+" hour" + rem + " min");
            }
        });

    }
}
