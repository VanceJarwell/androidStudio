package com.example.mydemoapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityThree extends AppCompatActivity {
    EditText msg;
    Button convert;

    TextView result;

    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.act_three);

        msg = findViewById(R.id.msg);
        convert = findViewById(R.id.convert);
        result = findViewById(R.id.result);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = msg.getText().toString();
                int number = Integer.parseInt(message);
                int convert = number / 60;
                int rem = number % 60;

                result.setText(convert + " hour/s " + rem + " min/s" + "");
            }
        });

    }
}
