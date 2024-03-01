package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {

    ImageButton back;

    CheckBox armenian, english, russian;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main6);

        back = findViewById(R.id.back);
        armenian = findViewById(R.id.armenian);
        english = findViewById(R.id.english);
        russian = findViewById(R.id.russian);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        armenian.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                preferences.edit().putString("language", "armenian").apply();
            }
        });

        english.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                preferences.edit().putString("language", "english").apply();
            }
        });

        russian.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                preferences.edit().putString("language", "russian").apply();
            }
        });

        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (buttonView != armenian) {
                        armenian.setChecked(false);
                    }
                    if (buttonView != english) {
                        english.setChecked(false);
                    }
                    if (buttonView != russian) {
                        russian.setChecked(false);
                    }
                }
            }
        };

        armenian.setOnCheckedChangeListener(listener);
        english.setOnCheckedChangeListener(listener);
        russian.setOnCheckedChangeListener(listener);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}