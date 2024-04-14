package com.example.alias;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alias.models.ConfigSingltonre;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    TextView best_score, score, team1, team2;
    Button play;
    LinearLayout team1_part, team2_part;
    private static boolean team = true;
    private String[] words1 = {"Team 1", "Winners", "Kings", "Losers"};
    private String[] words2 = {"Team 2", "Winners", "Kings", "Losers"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main4);

        play = findViewById(R.id.play);
        team1_part = findViewById(R.id.team1_part);
        team2_part = findViewById(R.id.team2_part);
        best_score = findViewById(R.id.best_score);
        score = findViewById(R.id.score);
        team1 = findViewById(R.id.team1);
        team2 = findViewById(R.id.team2);

        String point = getIntent().getStringExtra("keypoint");
        if ( point != null ) {
            Toast.makeText(this, point, Toast.LENGTH_SHORT).show();
        }

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String team_1 = team1.getText().toString();
                String team_2 = team2.getText().toString();
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtra("keyteam1", team_1);
                intent.putExtra("keyteam2", team_2);
                startActivity(intent);
                finish();
            }
        });

        /*Score*/
        if ( MainActivity5.isScore25Selected ) {
            best_score.setText("25");
            best_score.setTranslationX(3);
        } else if ( MainActivity5.isScore50Selected ) {
            best_score.setText("50");
            best_score.setTranslationX(3);
        } else if ( MainActivity5.isScore75Selected ) {
            best_score.setText("75");
            best_score.setTranslationX(3);
        } else if ( MainActivity5.isScore100Selected ) {
            best_score.setText("100");
        }
        /*Score*/

        /*Language*/
        if ( MainActivity6.Armenian ) {
            score.setText("Միավորներ");
            score.setTextSize(40);
            score.setTranslationY(50);
            team1.setText(ConfigSingltonre.getInstance().getTeam1Txt2());
            team2.setText(ConfigSingltonre.getInstance().getTeam2Txt2());
            play.setText("Խաղալ");
            play.setTextSize(25);
        } else if ( MainActivity6.English ) {
            score.setText("Score");
            team1.setText(ConfigSingltonre.getInstance().getTeam1Txt1());
            team2.setText(ConfigSingltonre.getInstance().getTeam2Txt1());
            play.setText("Play");
        } else if ( MainActivity6.Russian ) {
            score.setText("Счет");
            score.setTextSize(40);
            score.setTranslationY(50);
            score.setTranslationX(50);
            team1.setText(ConfigSingltonre.getInstance().getTeam1Txt3());
            team2.setText(ConfigSingltonre.getInstance().getTeam2Txt3());
            play.setText("Играть");
        }
        /*Language*/

        /*Team name changing 1*/
        team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity4.this);
                builder.setTitle("Enter your team name");

                final EditText input = new EditText(MainActivity4.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT);

                builder.setView(input);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        ConfigSingltonre.getInstance().setTeam1Txt1(input.getText().toString());
                        ConfigSingltonre.getInstance().setTeam1Txt2(input.getText().toString());
                        ConfigSingltonre.getInstance().setTeam1Txt3(input.getText().toString());

                        String newText = input.getText().toString();
                        if (newText.length() <= 9) {
                            team1.setText(newText);
                        } else {
                            Toast.makeText(MainActivity4.this, "Text length must be max 9 letters", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                final AlertDialog dialog = builder.create();
                dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

                dialog.show();
                input.requestFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(input, InputMethodManager.SHOW_IMPLICIT);
            }
        });

        team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity4.this);
                builder.setTitle("Enter your team name");

                final EditText input = new EditText(MainActivity4.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT);

                builder.setView(input);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        ConfigSingltonre.getInstance().setTeam2Txt1(input.getText().toString());
                        ConfigSingltonre.getInstance().setTeam2Txt2(input.getText().toString());
                        ConfigSingltonre.getInstance().setTeam2Txt3(input.getText().toString());

                        String newText = input.getText().toString();
                        if (newText.length() <= 9) {
                            team2.setText(newText);
                        } else {
                            Toast.makeText(MainActivity4.this, "Text length must be max 9 letters", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                final AlertDialog dialog = builder.create();
                dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

                dialog.show();
                input.requestFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(input, InputMethodManager.SHOW_IMPLICIT);
            }
        });
        /*Team name changing 1*/

        /*Team changing 2*/
        /*team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(words1.length);
                team1.setText(words1[index]);
            }
        });

        team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(words2.length);
                team2.setText(words2[index]);
            }
        });*/
        /*Team changing 2*/
    }
    public static boolean team() {
        return team;
    }

    public static void toggleText() {
        team = !team;
    }
}