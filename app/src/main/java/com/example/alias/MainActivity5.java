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
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView language, section;
    CheckBox english, russian, armenian;
    CheckBox sec1, sec2, sec3, sec4, sec5, sec6;
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

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}