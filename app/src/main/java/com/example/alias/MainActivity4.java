package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView score, best_score, team1, team2;
    ImageView lines, crown, back;
    Button play;
    private static final String COUNT_KEY = "count";
    int team_count = 0;
    private static boolean team = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main4);

        play = findViewById(R.id.play);
        back = findViewById(R.id.back);

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        team_count = sharedPreferences.getInt(COUNT_KEY, 0);
        team_count++;

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(COUNT_KEY, team_count);
        editor.apply();

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public static boolean team() {
        return team;
    }

    public static void toggleText() {
        team = !team;
    }
}