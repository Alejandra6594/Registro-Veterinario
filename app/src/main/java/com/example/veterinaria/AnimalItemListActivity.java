package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AnimalItemListActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout animalList;
    ImageView animalName;
    LinearLayout containerItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_item_list);

        animalList=findViewById(R.id.animal_item);
        animalList.setOnClickListener(this);

        animalName=findViewById(R.id.image_animal);
        animalName.setOnClickListener(this);

        containerItem=findViewById(R.id.container_animal_item);
        containerItem.setOnClickListener(this);

        Toast.makeText(AnimalItemListActivity.this,
                "Animales inicializados " ,
                Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        if(view==containerItem){
            Toast.makeText(AnimalItemListActivity.this,
                    "Cargar Vacunas de Perros " ,
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}