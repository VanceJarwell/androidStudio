package com.example.mydemoapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class UICheckBox extends AppCompatActivity {
    CheckBox checkBox;
    Button button;

    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.ui_check_box);

        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);

    final CheckBox checkbox =(CheckBox) findViewById(R.id.checkBox);
    checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(checkbox.isChecked()) {
                    checkbox.setText("I'm checked!");
                }else
                    checkbox.setText("I'm not checked!");

            }
        });
    final Button button =(Button) findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            if (checkbox.isShown()) {
                checkbox.setVisibility(View.INVISIBLE);
                button.setText("Unhide checkbox");
            } else {
                checkbox.setVisibility(View.VISIBLE);
                button.setText("Hide checkbox");
            }
        }
    });

    }
}
