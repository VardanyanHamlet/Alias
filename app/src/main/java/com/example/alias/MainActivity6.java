package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    ImageButton back;
    TextView color, language;
    RadioButton armenian, english, russian;
    Button next;
    public static boolean isArmenianSelected = false;
    public static boolean isEnglishSelected = false;
    public static boolean isRussianSelected = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main6);

        back = findViewById(R.id.back);
        armenian = findViewById(R.id.armenian);
        english = findViewById(R.id.english);
        russian = findViewById(R.id.russian);
        next = findViewById(R.id.next);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isArmenianSelected = armenian.isChecked();
                isEnglishSelected = english.isChecked();
                isRussianSelected = russian.isChecked();
                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
                finish();
            }
        });

        /*if ( MainActivity6.isArmenianSelected ) {
            color.setText("Ընտրեք գույնը");
        } else if ( MainActivity6.isEnglishSelected ) {
            color.setText("Choose the color");
        } else if ( MainActivity6.isRussianSelected ) {
            color.setText("Выберите цвет");
        }*/

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

        RadioButton english = findViewById(R.id.english);
        english.setChecked(true);
    }
}