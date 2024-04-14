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
    Button start;
    ImageButton info;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        alias = findViewById(R.id.alias);
        start = findViewById(R.id.start);
        info = findViewById(R.id.info);

        start.setOnClickListener(new View.OnClickListener() {
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

        /*Language*/
        if ( MainActivity6.Armenian ) {
            start.setText("Սկսել");
            alias.setText("Ալիաս");
            alias.setTextSize(60);
            alias.setTranslationY(-110);
        } else if ( MainActivity6.Russian ) {
            start.setText("Начинать");
            alias.setText("Алиас");
            alias.setTextSize(60);
            alias.setTranslationY(-110);
        } else if ( MainActivity6.English ) {
            start.setText("Start");
            alias.setText("Alias");
        }
        /*Language*/
    }
}