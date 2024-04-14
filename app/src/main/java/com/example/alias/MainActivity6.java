package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    ImageButton back;
    TextView color, language;
    RadioButton armenian, english, russian;
    Button next;
    RadioButton color1, color2, color3, color4, color5, color6, color7, color8;
    /*public static boolean isColor1Selected = false;
    public static boolean isColor2Selected = false;
    public static boolean isColor3Selected = false;
    public static boolean isColor4Selected = false;
    public static boolean isColor5Selected = false;
    public static boolean isColor6Selected = false;
    public static boolean isColor7Selected = false;
    public static boolean isColor8Selected = false;*/

    public static boolean Armenian = false;
    public static boolean Russian = false;
    public static boolean English = false;

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
        language = findViewById(R.id.language);
        color = findViewById(R.id.color);
        color1 = findViewById(R.id.color1);
        color2 = findViewById(R.id.color2);
        color3 = findViewById(R.id.color3);
        color4 = findViewById(R.id.color4);
        color5 = findViewById(R.id.color5);
        color6 = findViewById(R.id.color6);
        color7 = findViewById(R.id.color7);
        color8 = findViewById(R.id.color8);

        /*isColor1Selected = color1.isChecked();
        isColor2Selected = color2.isChecked();
        isColor3Selected = color3.isChecked();
        isColor4Selected = color4.isChecked();
        isColor5Selected = color5.isChecked();
        isColor6Selected = color6.isChecked();
        isColor7Selected = color7.isChecked();
        isColor8Selected = color8.isChecked();*/

        armenian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Armenian = armenian.isChecked();
                language.setText("Ընտրեք լեզուն");
                armenian.setText("Հայերեն");
                russian.setText("Ռուսերեն");
                english.setText("Անգլերեն");
                color.setText("Ընտրեք գույնը");
                next.setText("Հաջորդը");
                next.setTextSize(23);
            }
        });

        russian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Russian = russian.isChecked();
                language.setText("Выберите язык");
                armenian.setText("Армянский");
                russian.setText("Русский");
                english.setText("Английский");
                color.setText("Выберите цвет");
                next.setText("Следующий");
                next.setTextSize(18);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                English = english.isChecked();
                language.setText("Choose the language");
                armenian.setText("Armenian");
                russian.setText("Russian");
                english.setText("English");
                color.setText("Choose the color");
                next.setText("Next");
            }
        });

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

        CompoundButton.OnCheckedChangeListener listener3 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != color1) {
                        color1.setChecked(false);
                    }
                    if (buttonView != color2) {
                        color2.setChecked(false);
                    }
                    if (buttonView != color3) {
                        color3.setChecked(false);
                    }
                    if (buttonView != color4) {
                        color4.setChecked(false);
                    }
                    if (buttonView != color5) {
                        color5.setChecked(false);
                    }
                    if (buttonView != color6) {
                        color6.setChecked(false);
                    }
                    if (buttonView != color7) {
                        color7.setChecked(false);
                    }
                    if (buttonView != color8) {
                        color8.setChecked(false);
                    }
                }
            }
        };
        color1.setOnCheckedChangeListener(listener3);
        color2.setOnCheckedChangeListener(listener3);
        color3.setOnCheckedChangeListener(listener3);
        color4.setOnCheckedChangeListener(listener3);
        color5.setOnCheckedChangeListener(listener3);
        color6.setOnCheckedChangeListener(listener3);
        color7.setOnCheckedChangeListener(listener3);
        color8.setOnCheckedChangeListener(listener3);

        /*Default*/
        RadioButton english = findViewById(R.id.english);
        english.setChecked(true);
        RadioButton color1 = findViewById(R.id.color1);
        color1.setChecked(true);
        /*Default*/

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Armenian = armenian.isChecked();
                Russian = russian.isChecked();
                English = english.isChecked();
                Intent intent = new Intent(MainActivity6.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Armenian = armenian.isChecked();
                Russian = russian.isChecked();
                English = english.isChecked();
                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
                finish();
            }
        });
    }
}