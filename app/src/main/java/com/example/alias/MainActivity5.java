package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView language, section;
    RadioButton sec1, sec2, sec3, sec4, sec5, sec6;
    RadioButton armenian, english, russian;
    Button play;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main5);

        play = findViewById(R.id.play);
        sec1 = findViewById(R.id.sec1);
        sec2 = findViewById(R.id.sec2);
        sec3 = findViewById(R.id.sec3);
        sec4 = findViewById(R.id.sec4);
        sec5 = findViewById(R.id.sec5);
        sec6 = findViewById(R.id.sec6);
        armenian = findViewById(R.id.armenian);
        english = findViewById(R.id.english);
        russian = findViewById(R.id.russian);


        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != sec1) {
                        sec1.setChecked(false);
                    }
                    if (buttonView != sec2) {
                        sec2.setChecked(false);
                    }
                    if (buttonView != sec3) {
                        sec3.setChecked(false);
                    }
                    if (buttonView != sec4) {
                        sec4.setChecked(false);
                    }
                    if (buttonView != sec4) {
                        sec4.setChecked(false);
                    }
                    if (buttonView != sec5) {
                        sec5.setChecked(false);
                    }
                    if (buttonView != sec6) {
                        sec6.setChecked(false);
                    }
                }
            }
        };

        sec1.setOnCheckedChangeListener(listener);
        sec2.setOnCheckedChangeListener(listener);
        sec3.setOnCheckedChangeListener(listener);
        sec4.setOnCheckedChangeListener(listener);
        sec5.setOnCheckedChangeListener(listener);
        sec6.setOnCheckedChangeListener(listener);

        CompoundButton.OnCheckedChangeListener listener2 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != armenian) {
                        armenian.setChecked(false);
                    }
                    if (buttonView != english) {
                        english.setChecked(false);
                    }
                    if (buttonView != russian) {
                        russian.setChecked(false);
                    }
                }
            }
        };

        armenian.setOnCheckedChangeListener(listener2);
        english.setOnCheckedChangeListener(listener2);
        russian.setOnCheckedChangeListener(listener2);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
                finish();
            }
        });

        RadioButton sec1 = findViewById(R.id.sec1);
        sec1.setChecked(true);
        RadioButton english = findViewById(R.id.english);
        english.setChecked(true);
    }
}