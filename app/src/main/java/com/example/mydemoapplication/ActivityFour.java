package com.example.mydemoapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFour extends AppCompatActivity {
    EditText input;
    Button button;
    TextView result;

    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.act_four);

        input = findViewById(R.id.input);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String integer = input.getText().toString();
                int number = Integer.parseInt(integer);
                int total = number + 37;

                result.setText(total + " farehnheit");

            }
        });

    }
}
