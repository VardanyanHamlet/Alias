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
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView language, section, time, score;
    RadioButton sec1, sec2, sec3, sec4, sec5, sec6;
    RadioButton time45, time60, time75, time90;
    RadioButton score25, score50, score75, score100;
    Button next;
    public static boolean isTime45Selected = false;
    public static boolean isTime60Selected = false;
    public static boolean isTime75Selected = false;
    public static boolean isTime90Selected = false;
    public static boolean isScore25Selected = false;
    public static boolean isScore50Selected = false;
    public static boolean isScore75Selected = false;
    public static boolean isScore100Selected = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main5);

        section = findViewById(R.id.section);
        language = findViewById(R.id.language);
        next = findViewById(R.id.next);
        sec1 = findViewById(R.id.sec1);
        sec2 = findViewById(R.id.sec2);
        sec3 = findViewById(R.id.sec3);
        sec4 = findViewById(R.id.sec4);
        sec5 = findViewById(R.id.sec5);
        sec6 = findViewById(R.id.sec6);
        time = findViewById(R.id.time);
        time45 = findViewById(R.id.time45);
        time60 = findViewById(R.id.time60);
        time75 = findViewById(R.id.time75);
        time90 = findViewById(R.id.time90);
        score = findViewById(R.id.score);
        score25 = findViewById(R.id.score25);
        score50 = findViewById(R.id.score50);
        score75 = findViewById(R.id.score75);
        score100 = findViewById(R.id.score100);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTime45Selected = time45.isChecked();
                isTime60Selected = time60.isChecked();
                isTime75Selected = time75.isChecked();
                isTime90Selected = time90.isChecked();
                isScore25Selected = score25.isChecked();
                isScore50Selected = score50.isChecked();
                isScore75Selected = score75.isChecked();
                isScore100Selected = score100.isChecked();
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
                finish();
            }
        });

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

        CompoundButton.OnCheckedChangeListener listener3 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != time45) {
                        time45.setChecked(false);
                    }
                    if (buttonView != time60) {
                        time60.setChecked(false);
                    }
                    if (buttonView != time75) {
                        time75.setChecked(false);
                    }
                    if (buttonView != time90) {
                        time90.setChecked(false);
                    }
                }
            }
        };

        time45.setOnCheckedChangeListener(listener3);
        time60.setOnCheckedChangeListener(listener3);
        time75.setOnCheckedChangeListener(listener3);
        time90.setOnCheckedChangeListener(listener3);

        CompoundButton.OnCheckedChangeListener listener4 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != score25) {
                        score25.setChecked(false);
                    }
                    if (buttonView != score50) {
                        score50.setChecked(false);
                    }
                    if (buttonView != score75) {
                        score75.setChecked(false);
                    }
                    if (buttonView != score100) {
                        score100.setChecked(false);
                    }
                }
            }
        };

        score25.setOnCheckedChangeListener(listener4);
        score50.setOnCheckedChangeListener(listener4);
        score75.setOnCheckedChangeListener(listener4);
        score100.setOnCheckedChangeListener(listener4);

        /*Default selected*/
        RadioButton sec1 = findViewById(R.id.sec1);
        sec1.setChecked(true);
        RadioButton time45 = findViewById(R.id.time45);
        time45.setChecked(true);
        RadioButton score25 = findViewById(R.id.score25);
        score25.setChecked(true);
        /*Default selected*/

        /*Language*/
        if ( MainActivity6.Armenian == true ) {
            section.setText("Ընտրեք բաժինը");
            sec1.setText("Ընդհանուր բառեր");
            sec2.setText("Հայտնի մարդիկ");
            sec3.setText("Երկիր-քաղաքներ");
            sec4.setText("Մնջախաղ");
            sec5.setText("Ֆիլմեր");
            sec6.setText("Բոլորը");
            time.setText("Ժամանակ");
            score.setText("Հաղթական միավոր");
            next.setText("Հաջորդը");
            next.setTextSize(23);
        } else if ( MainActivity6.English ) {
            section.setText("Choose the section");
            sec1.setText("Common words");
            sec2.setText("Famous people");
            sec3.setText("City-countries");
            sec4.setText("Pantomime");
            sec5.setText("Films");
            sec6.setText("All");
            time.setText("Stage duration");
            score.setText("Winning score");
        } else if ( MainActivity6.Russian == true ) {
            section.setText("Выберите раздел");
            sec1.setText("Общеупотребительные слова");
            sec2.setText("Известные люди");
            sec3.setText("Города-страны");
            sec4.setText("Пантомима");
            sec5.setText("Фильмы");
            sec6.setText("Всё");
            time.setText("Продолжительность раунда");
            score.setText("Победный счет");
            next.setText("Следующий");
            next.setTextSize(18);
        }
        /*Language*/
    }
}