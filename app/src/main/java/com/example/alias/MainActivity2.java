package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView word1, word2, word3, word4, word5, word6, word7;
    private TextView timer;
    private CountDownTimer countDownTimer;
    private int grayCount = 0;
    private static final long TIMER_DURATION = 10000;
    private SharedPreferences sharedPreferences;
    private int count;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        timer = findViewById(R.id.timer);

        int initialTimeSeconds = 11;

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        count = sharedPreferences.getInt("count", 0);

        countDownTimer = new CountDownTimer(initialTimeSeconds * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateTimer((int) (millisUntilFinished / 1000));
            }
            @Override
            public void onFinish() {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
                finish();
            }
        };

        countDownTimer.start();

        final int[] count1 = {0};
        final int[] count2 = {0};
        final int[] count3 = {0};
        final int[] count4 = {0};
        final int[] count5 = {0};
        final int[] count6 = {0};
        final int[] count7 = {0};

        TextView word1 = findViewById(R.id.word1);
        TextView word2 = findViewById(R.id.word2);
        TextView word3 = findViewById(R.id.word3);
        TextView word4 = findViewById(R.id.word4);
        TextView word5 = findViewById(R.id.word5);
        TextView word6 = findViewById(R.id.word6);
        TextView word7 = findViewById(R.id.word7);

        word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1[0]++;
                if (count1[0] % 2 == 0 || count1[0] == 0) {
                    word1.setBackgroundColor(Color.WHITE);
                } else {
                    word1.setBackgroundColor(Color.GRAY);
                }
            }
        });

        word2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2[0]++;
                if (count2[0] % 2 == 0 || count2[0] == 0) {
                    word2.setBackgroundColor(Color.WHITE);
                } else {
                    word2.setBackgroundColor(Color.GRAY);
                }
            }
        });

        word3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3[0]++;
                if (count3[0] % 2 == 0 || count3[0] == 0) {
                    word3.setBackgroundColor(Color.WHITE);
                } else {
                    word3.setBackgroundColor(Color.GRAY);
                }
            }
        });

        word4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4[0]++;
                if (count4[0] % 2 == 0 || count4[0] == 0) {
                    word4.setBackgroundColor(Color.WHITE);
                } else {
                    word4.setBackgroundColor(Color.GRAY);
                }
            }
        });

        word5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count5[0]++;
                if (count5[0] % 2 == 0 || count5[0] == 0) {
                    word5.setBackgroundColor(Color.WHITE);
                } else {
                    word5.setBackgroundColor(Color.GRAY);
                }
            }
        });

        word6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count6[0]++;
                if (count6[0] % 2 == 0 || count6[0] == 0) {
                    word6.setBackgroundColor(Color.WHITE);
                } else {
                    word6.setBackgroundColor(Color.GRAY);
                }
            }
        });

        word7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count7[0]++;
                if (count7[0] % 2 == 0 || count7[0] == 0) {
                    word7.setBackgroundColor(Color.WHITE);
                } else {
                    word7.setBackgroundColor(Color.GRAY);
                }
            }
        });
    }

    private void updateTimer(int seconds) {
        timer.setText(String.valueOf(seconds));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private boolean isGrayButton(Button button) {
        Drawable background = button.getBackground();

        if (background instanceof ColorDrawable) {
            int backgroundColor = ((ColorDrawable) background).getColor();
            return backgroundColor == Color.GRAY;
        }

        return false;
    }
}