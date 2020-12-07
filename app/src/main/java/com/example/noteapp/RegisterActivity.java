package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText textEmail;
    EditText textPassword;
    EditText textCheckPassword;
    EditText textPhone;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        textEmail = findViewById(R.id.email);
        textPassword = findViewById(R.id.password);
        textCheckPassword = findViewById(R.id.checkPassword);
        textPhone = findViewById(R.id.phoneNumber);

        btnReg = findViewById(R.id.acceptRegister);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateEmail();
                validatePassword();
            }
        });
    }

    private boolean validateEmail() {
        String emailInput = textEmail.getEditableText().toString().trim();

        if (emailInput.isEmpty()) {
            textEmail.setError("Musisz podać emaila");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            textEmail.setError("Prosze sprawdzić poprawność adresu email");
            return false;
        } else {
            textEmail.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        String passwordInput = textPassword.getEditableText().toString().trim();

        if (passwordInput.isEmpty()) {
            textPassword.setError("Musisz podać jakieś hasło");
            return false;
        } else {
            textPassword.setError(null);
            return true;
        }
    }


    public void backStart(View view) {
        Intent intent = new Intent(this, MainScreenActivity.class);
        startActivity(intent);
    }
}