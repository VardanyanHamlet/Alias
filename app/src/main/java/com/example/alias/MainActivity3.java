package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageButton back;
    TextView info1, info2, info3, info4, HowToPlay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);

        back = findViewById(R.id.back);
        info1 = findViewById(R.id.info1);
        info2 = findViewById(R.id.info2);
        info3 = findViewById(R.id.info3);
        info4 = findViewById(R.id.info4);
        HowToPlay = findViewById(R.id.HowToPlay);

        /*if ( MainActivity6.isArmenianSelected ) {
            HowToPlay.setText("Ինչպես Խաղալ");
            info1.setText("Խաղը նախատեսված է ընկերների հետ խաղալու համար: Խաղացողները բաժանվում են 2 թիմի։ Խաղացողը պետք է խաղընկերոջը բացատրի էկրանին գրված բառը: Հաղթում է այն թիմը, որը կռահում է ավելի շատ բառեր:");
            info2.setText("1)Ընտրեք լեզուն՝ հայերեն, անգլերեն կամ ռուսերեն:");
            info3.setText("2)Ընտրեք, թե որքան ժամանակ պետք է տևի մեկ փուլը մեկ փուլ:");
            info4.setText("3)Ընտրեք բաժինը` Ընդհանուր բառեր, Հայտնի մարդիկ, Քաղաք-երկրներ, Մնջախաղ, Ֆիլմեր կամ Հավաքական:");
        } else if ( MainActivity6.isEnglishSelected ) {
            HowToPlay.setText("How To Play");
            info1.setText("The game is designed to be played with friends. Players are divided into 2 teams. The player must explain the word written on the screen to his teammate. The team that guesses more words wins.");
            info2.setText("1)Choose the language։ Armenian, English or Russian.");
            info3.setText("2)Choose how long will one round take.");
            info4.setText("3)Choose the section։ Common words, Famous people, City-countries, Pantomime, Films or Collective.");
        } else if ( MainActivity6.isRussianSelected ) {
            HowToPlay.setText("Как играть");
            info1.setText("Игра предназначена для игры с друзьями. Игроки делятся на 2 команды. Игрок должен объяснить слово, написанное на экране, своему товарищу по команде. Побеждает та команда, которая угадает больше слов.");
            info2.setText("1)Выберите язык: армянский, английский или русский.");
            info3.setText("2)Выберите, сколько времени займет один раунд.");
            info4.setText("3)Выберите раздел։ «Общие слова», «Известные люди», «Города-страны», «Пантомима», «Фильмы» или «Коллектив».");
        }*/

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