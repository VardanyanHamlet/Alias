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

    boolean press1 = false;
    boolean press2 = false;
    boolean press3 = false;
    boolean press4 = false;
    boolean press5 = false;
    boolean press6 = false;
    boolean press7 = false;
    private int grayCount = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        timer = findViewById(R.id.timer);

        int initialTimeSeconds = 11;

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

        //int color = ContextCompat.getColor(this, R.color.white);

        word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1[0]++;
                if (count1[0] % 2 == 0 || count1[0] == 0) {
                    word1.setBackgroundColor(Color.WHITE);
                    press1 = false;
                } else {
                    word1.setBackgroundColor(Color.GRAY);
                    if ( word1.getCurrentTextColor() == Color.GRAY ) {
                        press1 = true;
                    }
                }
            }
        });

        word2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2[0]++;
                if (count2[0] % 2 == 0 || count2[0] == 0) {
                    word2.setBackgroundColor(Color.WHITE);
                    press2 = false;
                } else {
                    word2.setBackgroundColor(Color.GRAY);
                    if ( word2.getCurrentTextColor() == Color.GRAY ) {
                        press2 = true;
                    }
                }
            }
        });

        word3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3[0]++;
                if (count3[0] % 2 == 0 || count3[0] == 0) {
                    word3.setBackgroundColor(Color.WHITE);
                    press3 = false;
                } else {
                    word3.setBackgroundColor(Color.GRAY);
                    if ( word3.getCurrentTextColor() == Color.GRAY ) {
                        press3 = true;
                    }
                }
            }
        });

        word4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4[0]++;
                if (count4[0] % 2 == 0 || count4[0] == 0) {
                    word4.setBackgroundColor(Color.WHITE);
                    press4 = false;
                } else {
                    word4.setBackgroundColor(Color.GRAY);
                    if ( word4.getCurrentTextColor() == Color.GRAY ) {
                        press4 = true;
                    }
                }
            }
        });

        word5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count5[0]++;
                if (count5[0] % 2 == 0 || count5[0] == 0) {
                    word5.setBackgroundColor(Color.WHITE);
                    press5 = false;
                } else {
                    word5.setBackgroundColor(Color.GRAY);
                    if ( word5.getCurrentTextColor() == Color.GRAY ) {
                        press5 = true;
                    }
                }
            }
        });

        word6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count6[0]++;
                if (count6[0] % 2 == 0 || count6[0] == 0) {
                    word6.setBackgroundColor(Color.WHITE);
                    press6 = false;
                } else {
                    word6.setBackgroundColor(Color.GRAY);
                    if ( word6.getCurrentTextColor() == Color.GRAY ) {
                        press6 = true;
                    }
                }
            }
        });

        word7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count7[0]++;
                if (count7[0] % 2 == 0 || count7[0] == 0) {
                    word7.setBackgroundColor(Color.WHITE);
                    press7 = false;
                } else {
                    word7.setBackgroundColor(Color.GRAY);
                    if ( word7.getCurrentTextColor() == Color.GRAY ) {
                        press7 = true;
                    }
                }
            }
        });


        if ( press1 == true && press2 == true && press3 == true && press4 == true && press5 == true && press6 == true && press7 == true ) {
            word1.setText("Word 8");
            word2.setText("Word 9");
            word3.setText("Word 10");
            word4.setText("Word 11");
            word5.setText("Word 12");
            word6.setText("Word 13");
            word7.setText("Word 14");
        }
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