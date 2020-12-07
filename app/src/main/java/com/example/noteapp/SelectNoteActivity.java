package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectNoteActivity extends AppCompatActivity {

    Button textNote, imgNote, voiceNote, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_note);

        textNote = findViewById(R.id.textNote);
        imgNote = findViewById(R.id.imgNote);
        voiceNote = findViewById(R.id.voiceNote);
        back = findViewById(R.id.backStart);

        textNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTextNote();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backStart(v);
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

    public void addTextNote(){
        Intent intent = new Intent(this, AddNoteActivity.class);
        startActivity(intent);
    }

    public void backStart(View view){
        Intent intent = new Intent(this, MainScreenActivity.class);
        startActivity(intent);
    }
}