package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageButton back;
    TextView info1, info2, info3, info4, info5, info6, HowToPlay, language;
    RadioButton armenian, russian, english;
    public static boolean isArmenianSelected = false;
    public static boolean isRussianSelected = false;
    public static boolean isEnglishSelected = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);

        HowToPlay = findViewById(R.id.HowToPlay);
        back = findViewById(R.id.back);
        info1 = findViewById(R.id.info1);
        info2 = findViewById(R.id.info2);
        info3 = findViewById(R.id.info3);
        info4 = findViewById(R.id.info4);
        info5 = findViewById(R.id.info5);
        info6 = findViewById(R.id.info6);
        language = findViewById(R.id.language);
        armenian = findViewById(R.id.armenian);
        russian = findViewById(R.id.russian);
        english = findViewById(R.id.english);

        /*RadioButtons*/
        CompoundButton.OnCheckedChangeListener listener3 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != armenian) {
                        armenian.setChecked(false);
                    }
                    if (buttonView != russian) {
                        russian.setChecked(false);
                    }
                    if (buttonView != english) {
                        english.setChecked(false);
                    }
                }
            }
        };

        armenian.setOnCheckedChangeListener(listener3);
        russian.setOnCheckedChangeListener(listener3);
        english.setOnCheckedChangeListener(listener3);

        RadioButton english = findViewById(R.id.english);
        english.setChecked(true);
        /*RadioButtons*/

        armenian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HowToPlay.setText("Ինչպես Խաղալ");
                info1.setText("Խաղը նախատեսված է ընկերների հետ խաղալու համար: Խաղացողները բաժանված են 2 թիմի: Խաղացողը պետք է խաղընկերոջը բացատրի էկրանին գրված բառը, յուրաքանչյուր ճիշտ գուշակած բառի համար թիմը կստանա 1 միավոր: Մեկ փուլի ընթացքում թիմը կարող է վաստակել առավելագույնը 30 միավոր։");
                info2.setText("Խաղը սկսելուց առաջ խաղացողը պետք է ընտրի`");
                info2.setTranslationY(160);
                info3.setText("1)Հաղթական միավորների քանակը");
                info3.setTranslationY(165);
                info4.setText("2)1 փուլի տևողությունը");
                info4.setTranslationY(170);
                info5.setText("3)Բաժինը");
                info5.setTranslationY(170);
                info6.setText("Խաղացողը կարող է նաև ընտրել խաղի գույները:");
                info6.setTranslationY(160);
                language.setText("Ընտրեք լեզուն");
                armenian.setText("Հայերեն");
                russian.setText("Ռուսերեն");
                english.setText("Անգլերեն");

            }
        });

        russian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HowToPlay.setText("Как Играть");
                info1.setText("Игра предназначена для игры с друзьями. Игроки делятся на 2 команды. Игрок должен объяснить товарищу по команде слово, написанное на экране, за каждое правильно угаданное слово команда получает 1 очко. За один раунд команда может заработать максимум 30 очков.");
                info2.setText("Перед началом игры игрок должен выбрать:");
                info2.setTranslationY(40);
                info3.setText("1)Количество выигрышных очков");
                info3.setTranslationY(30);
                info4.setText("2)Продолжительность 1 раунда");
                info4.setTranslationY(30);
                info5.setText("3)Раздел");
                info5.setTranslationY(30);
                info6.setText("Игрок также может выбирать цвета игры.");
                info6.setTranslationY(-10);
                language.setText("Выберите язык");
                armenian.setText("Армянский");
                russian.setText("Русский");
                english.setText("Английский");
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HowToPlay.setText("How To Play");
                info1.setText("The game is designed to be played with friends. The players are divided into 2 teams. The player must explain the word written on the screen to his teammate, for each correctly guessed word, the team will get 1 point. During one round, the team can earn a maximum of 30 points.");
                info2.setText("Before starting the game, the player must choose:");
                info2.setTranslationY(0);
                info3.setText("1)Number of winning points");
                info3.setTranslationY(-10);
                info4.setText("2)1 round duration");
                info4.setTranslationY(-10);
                info5.setText("3)The section");
                info5.setTranslationY(-10);
                info6.setText("The player can also choose the colors of the game.");
                info6.setTranslationY(-10);
                language.setText("Choose the language");
                armenian.setText("Armenian");
                russian.setText("Russian");
                english.setText("English");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}