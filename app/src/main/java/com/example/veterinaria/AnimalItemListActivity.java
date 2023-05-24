package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AnimalItemListActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout animalList;
    ImageView animalName;
    LinearLayout containerItem;
    Button btnDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_item_list);
/*

        animalList=findViewById(R.id.animal_item);
        animalList.setOnClickListener(this);

        animalName=findViewById(R.id.image_animal);
        animalName.setOnClickListener(this);

        containerItem=findViewById(R.id.container_animal_item);
        containerItem.setOnClickListener(this);
*/

        btnDetails = findViewById(R.id.btn_details);
        btnDetails.setOnClickListener(this);

        Toast.makeText(AnimalItemListActivity.this,
                "Animales inicializados " ,
                Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {

        if(view==btnDetails){
            Intent intent = new Intent(AnimalItemListActivity.this, DetailAnimalsActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}