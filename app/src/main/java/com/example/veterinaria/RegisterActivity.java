package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnNewAccount;
    EditText nameInput, emailInput, pwsInput, pwsConfirmInput;
    String name, email, pws, pwsConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nameInput = findViewById(R.id.name_register);
        emailInput = findViewById(R.id.email_register);
        pwsInput = findViewById(R.id.pass_register);
        pwsConfirmInput = findViewById(R.id.pass_confirm_register);

        btnNewAccount=findViewById(R.id.btn_newAccount);
        btnNewAccount.setOnClickListener(this);

        name = nameInput.getText().toString().trim();
        email = emailInput.getText().toString().trim();
        pws = pwsInput.getText().toString().trim();
        pwsConfirm = pwsConfirmInput.getText().toString().trim();

    }
    @Override
    public void onClick(View view) {
        if (view==btnNewAccount){
            Toast.makeText(this, "Usuario registrado con exito!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
            startActivity(intent);
            finish();

        }
    }
}