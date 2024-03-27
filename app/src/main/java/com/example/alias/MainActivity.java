package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView alias;
    Button play;
    ImageButton info;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        alias = findViewById(R.id.alias);
        play = findViewById(R.id.play);
        info = findViewById(R.id.info);

        /*Language*/
        /*if ( MainActivity6.isArmenianSelected ) {
            alias.setText("Ալիաս");
            play.setText("Խաղալ");
        } else if ( MainActivity6.isEnglishSelected ) {
            alias.setText("Alias");
            play.setText("Play");
        } else if ( MainActivity6.isRussianSelected ) {
            alias.setText("Алиас");
            play.setText("Играть");
        }*/
        /*Language*/

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(intent);
                finish();
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}