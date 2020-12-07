package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainScreenActivity extends AppCompatActivity {

    Button btn, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        btn = findViewById(R.id.plusBtn);
        btnSettings = findViewById(R.id.settings);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainScreenActivity.this, R.anim.blink_anim);

                btn.startAnimation(anim);
                selectNote();
            }
        });


    }

    public void openReg(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void openLogIn(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void selectNote(){
        Intent intent = new Intent(this, SelectNoteActivity.class);
        startActivity(intent);
    }

    public void noteSettings(View view){
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    }

    public void showNote(View view){
        Intent intent = new Intent(this, ViewNoteActivity.class);
        startActivity(intent);
    }
}