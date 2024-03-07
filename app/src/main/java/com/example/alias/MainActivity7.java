package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    Button button, button2;

    boolean press1 = false;
    boolean press2 = false;

    int count1 = 0;
    int count2 = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                if (count1 % 2 == 0 || count1 == 0) {
                    button.setBackgroundColor(Color.WHITE);
                    press1 = false;
                } else {
                    button.setBackgroundColor(Color.GRAY);
                    press1 = true;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                if (count2 % 2 == 0 || count1 == 0) {
                    button2.setBackgroundColor(Color.WHITE);
                    press2 = false;
                } else {
                    button2.setBackgroundColor(Color.GRAY);
                    press2 = true;
                }
            }
        });

        if ( (count1 % 2 == 1) && (count2 % 2 == 1) ) {
            button.setText("elav");
            button2.setText("elav");
        }

    }
}