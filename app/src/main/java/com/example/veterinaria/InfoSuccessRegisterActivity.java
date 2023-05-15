package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class InfoSuccessRegisterActivity extends AppCompatActivity {

    ImageView imgSuccess;
    String nameAnimal, ageAnimal;
    TextView infoNameAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_success_register);

        infoNameAnimal = findViewById(R.id.info_name_animal);

        imgSuccess = findViewById(R.id.img_success_register);
        Glide.with(this).load(R.drawable.check_green).into(imgSuccess);
        Intent animalRegister = getIntent();
        nameAnimal = animalRegister.getStringExtra("nameAnimal");
        ageAnimal = animalRegister.getStringExtra("ageAnimal");
        infoNameAnimal.setText(nameAnimal);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(InfoSuccessRegisterActivity.this,ViewMainAnimalsActivity.class);
                intent.putExtra("nameAnimal", nameAnimal);
                intent.putExtra("ageAnimal", ageAnimal);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 3000);
    }
}