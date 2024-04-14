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

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private TextView word1, word2, word3, word4, word5, word6, word7, word8, word9, word10;
    private TextView timer, team1, team2, points_value, points;
    private CountDownTimer countDownTimer;
    int initialTimeSeconds = 16;
    private SharedPreferences sharedPreferences;
    private int count;
    private int clickcount = 0;

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
        TextView team1 = findViewById(R.id.team1);
        TextView team2 = findViewById(R.id.team2);
        TextView points_value = findViewById(R.id.points_value);
        timer = findViewById(R.id.timer);
        points = findViewById(R.id.points);

        String myString11 = getString(R.string.word11);
        String myString12 = getString(R.string.word12);
        String myString13 = getString(R.string.word13);
        String myString14 = getString(R.string.word14);
        String myString15 = getString(R.string.word15);
        String myString16 = getString(R.string.word16);
        String myString17 = getString(R.string.word17);
        String myString18 = getString(R.string.word18);
        String myString19 = getString(R.string.word19);
        String myString20 = getString(R.string.word20);
        String myString21 = getString(R.string.word21);
        String myString22 = getString(R.string.word22);
        String myString23 = getString(R.string.word23);
        String myString24 = getString(R.string.word24);
        String myString25 = getString(R.string.word25);
        String myString26 = getString(R.string.word26);
        String myString27 = getString(R.string.word27);
        String myString28 = getString(R.string.word28);
        String myString29 = getString(R.string.word29);
        String myString30 = getString(R.string.word30);



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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
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
                        } else if (clickcount == 20) {
                            resetWords2();
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
                    } else if (clickcount == 20) {
                        resetWords2();
                    }
                }

                if ("30".equals(points_value.getText().toString())) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }

            private void resetWords() {
                word1.setText(myString11); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString12); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString13); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString14); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString15); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString16); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString17); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString18); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString19); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString20); word10.setBackgroundColor(Color.WHITE);
            }
            private void resetWords2() {
                word1.setText(myString21); word1.setBackgroundColor(Color.WHITE);
                word2.setText(myString22); word2.setBackgroundColor(Color.WHITE);
                word3.setText(myString23); word3.setBackgroundColor(Color.WHITE);
                word4.setText(myString24); word4.setBackgroundColor(Color.WHITE);
                word5.setText(myString25); word5.setBackgroundColor(Color.WHITE);
                word6.setText(myString26); word6.setBackgroundColor(Color.WHITE);
                word7.setText(myString27); word7.setBackgroundColor(Color.WHITE);
                word8.setText(myString28); word8.setBackgroundColor(Color.WHITE);
                word9.setText(myString29); word9.setBackgroundColor(Color.WHITE);
                word10.setText(myString30); word10.setBackgroundColor(Color.WHITE);
            }
        });
        /*Words end*/

        String team_1 = getIntent().getStringExtra("keyteam1");
        String team_2 = getIntent().getStringExtra("keyteam2");

        /*Time*/
        if ( MainActivity5.isTime45Selected ) {
            initialTimeSeconds = 46;
        } else if (  MainActivity5.isTime60Selected ) {
            initialTimeSeconds = 61;
        } else if ( MainActivity5.isTime75Selected ) {
            initialTimeSeconds = 76;
        } else if ( MainActivity5.isTime90Selected ) {
            initialTimeSeconds = 91;
        }
        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        count = sharedPreferences.getInt("count", 0);
        countDownTimer = new CountDownTimer(initialTimeSeconds * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateTimer((int) (millisUntilFinished / 1000));
            }
            @Override
            public void onFinish() {
                String point = points_value.getText().toString();
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                intent.putExtra("keypoint", point);
                startActivity(intent);
                finish();
            }
        };
        countDownTimer.start();
        /*Time*/

        /*Language*/
        if ( MainActivity6.Armenian ) {
            if (MainActivity4.team()) {
                team1.setText(team_1);
                /*team1.setText("Թիմ 1");*/
                team2.setText("");
            } else {
                team1.setText("");
                team2.setText(team_2);
                /*team2.setText("Թիմ 2");*/
            }
            MainActivity4.toggleText();
            points.setText("միավորներ:");
            points.setTranslationX(-35);
            points_value.setTranslationX(35);
        } else if ( MainActivity6.English ) {
            if (MainActivity4.team()) {
                team1.setText(team_1);
                /*team1.setText("Team 1");*/
                team2.setText("");
            } else {
                team1.setText("");
                team2.setText(team_2);
                /*team2.setText("Team 2");*/
            }
            MainActivity4.toggleText();
            points.setText("points:");
        } else if ( MainActivity6.Russian ) {
            if (MainActivity4.team()) {
                team1.setText(team_1);
                /*team1.setText("Команда 1");*/
                team2.setText("");
            } else {
                team1.setText("");
                team2.setText(team_2);
                /*team2.setText("Команда 2");*/
            }
            MainActivity4.toggleText();
            points.setText("очки:");
            points.setTranslationX(10);
            points_value.setTranslationX(-10);
        }
        /*Language*/
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

