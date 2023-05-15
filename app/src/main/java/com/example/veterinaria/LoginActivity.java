package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener{
    Button btn_login, btn_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login=findViewById(R.id.btn_ingresar);
        btn_login.setOnClickListener(this);

        btn_register=findViewById(R.id.btn_register);
        btn_register.setOnClickListener(this);


    }


    public void onClick(View view) {
        if (view==btn_login){
            Intent intent = new Intent(LoginActivity.this,ViewMainAnimalsActivity.class);
            startActivity(intent);
            finish();
        }

        if (view==btn_register) {
            Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(intent);
            finish();
        }
    }
}