package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void backStart(View view){
        Intent intent = new Intent(this, MainScreenActivity.class);
        startActivity(intent);
    }

    public void goToCod(View view){
        Intent intent = new Intent(this, AutenticationActivity.class);
        startActivity(intent);
    }
}