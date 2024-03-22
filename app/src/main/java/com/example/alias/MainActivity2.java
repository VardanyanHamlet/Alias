package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView word1, word2, word3, word4, word5, word6, word7, word8, word9, word10;
    private TextView timer, team, points_value;
    private CountDownTimer countDownTimer;
    //private static final long TIMER_DURATION = 10000;
    private SharedPreferences sharedPreferences;
    private int count;
    private int  clickcount = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        TextView word1 = findViewById(R.id.word1);
        TextView word2 = findViewById(R.id.word2);
        TextView word3 = findViewById(R.id.word3);
        TextView word4 = findViewById(R.id.word4);
        TextView word5 = findViewById(R.id.word5);
        TextView word6 = findViewById(R.id.word6);
        TextView word7 = findViewById(R.id.word7);
        TextView word8 = findViewById(R.id.word8);
        TextView word9 = findViewById(R.id.word9);
        TextView word10 = findViewById(R.id.word10);
        TextView team = findViewById(R.id.team);
        TextView points_value = findViewById(R.id.points_value);
        timer = findViewById(R.id.timer);

        /*Team 1, team 2 start*/
        if (MainActivity4.team()) {
            team.setText("Team 1");
        } else {
            team.setText("Team 2");
        }
        MainActivity4.toggleText();
        /*Team1, team 2 end*/

        /*Timer start*/
        int initialTimeSeconds = 16;
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
        /*Timer end*/

        /*Words start*/
        word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word1.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word1.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word1.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word1.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word1.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11");
                word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12");
                word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13");
                word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14");
                word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15");
                word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16");
                word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17");
                word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18");
                word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19");
                word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20");
                word10.setBackgroundColor(Color.WHITE);
            }
        });

        word2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word2.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word2.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word2.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word2.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word2.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word3.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word3.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word3.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word3.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word3.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word4.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word4.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word4.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word4.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word4.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word5.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word5.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word5.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word5.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word5.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word6.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word6.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word6.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word6.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word6.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word7.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word7.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word7.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word7.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word7.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word8.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word8.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word8.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word8.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word8.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word9.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word9.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word9.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word9.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word9.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });

        word10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (word10.getBackground() instanceof ColorDrawable) {
                    int color = ((ColorDrawable) word10.getBackground()).getColor();
                    if (color == Color.WHITE) {
                        word10.setBackgroundColor(Color.GRAY);
                        clickcount++;
                        points_value.setText(String.valueOf(clickcount));
                        if (clickcount == 10) {
                            resetWords();
                        }
                    } else if (color == Color.GRAY) {
                        word10.setBackgroundColor(Color.WHITE);
                        clickcount--;
                        points_value.setText(String.valueOf(clickcount));
                    }
                } else {
                    word10.setBackgroundColor(Color.GRAY);
                    clickcount++;
                    points_value.setText(String.valueOf(clickcount));
                    if (clickcount == 10) {
                        resetWords();
                    }
                }
            }

            private void resetWords() {
                word1.setText("Word 11"); word1.setBackgroundColor(Color.WHITE);
                word2.setText("Word 12"); word2.setBackgroundColor(Color.WHITE);
                word3.setText("Word 13"); word3.setBackgroundColor(Color.WHITE);
                word4.setText("Word 14"); word4.setBackgroundColor(Color.WHITE);
                word5.setText("Word 15"); word5.setBackgroundColor(Color.WHITE);
                word6.setText("Word 16"); word6.setBackgroundColor(Color.WHITE);
                word7.setText("Word 17"); word7.setBackgroundColor(Color.WHITE);
                word8.setText("Word 18"); word8.setBackgroundColor(Color.WHITE);
                word9.setText("Word 19"); word9.setBackgroundColor(Color.WHITE);
                word10.setText("Word 20"); word10.setBackgroundColor(Color.WHITE);
            }
        });
        /*Words end*/
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

