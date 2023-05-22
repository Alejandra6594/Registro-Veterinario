package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.veterinaria.Adapters.AnimalListAdapter;
import com.example.veterinaria.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class ViewMainAnimalsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_newAnimal;
    ListView animalsListView;
    List<Animal> animalList;
    AnimalListAdapter animalAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_main_animals);

        btn_newAnimal=findViewById(R.id.btn_add_animals);
        btn_newAnimal.setOnClickListener(this);

        animalsListView=findViewById(R.id.animal_list_view);
        animalList = new ArrayList<>();
        Intent animalRegister = getIntent();
        String nameAnimal = animalRegister.getStringExtra("nameAnimal");
        String ageAnimal = animalRegister.getStringExtra("ageAnimal");
        String razaAnimal = animalRegister.getStringExtra("razaAnimal");
        String especieAnimal = animalRegister.getStringExtra("especieAnimal");
        String generoAnimal = animalRegister.getStringExtra("generoAnimal");
        /*animalList.add(new Animal("Chau", "4", "Perro", "Doberman", "Hembra"));*/

       /* animalList.add(new Animal());*/

        Animal data = getAnimalRegister(nameAnimal, ageAnimal, razaAnimal, especieAnimal, generoAnimal);
        animalList.add(data);
        animalAdapter = new AnimalListAdapter(this, animalList);
        animalsListView.setAdapter(animalAdapter);
       /* Toast.makeText(this, "vista cargada", Toast.LENGTH_SHORT).show();*/


    }

    public  Animal getAnimalRegister(String nameAnimal, String ageAnimal, String razaAnimal, String especieAnimal, String generoAnimal){

        return new Animal(nameAnimal, ageAnimal, razaAnimal,especieAnimal, generoAnimal);
    }

    @Override
    public void onClick(View view) {
        if(view==btn_newAnimal){
            Intent intent = new Intent(ViewMainAnimalsActivity.this,RegisterAnimalActivity.class);
            startActivity(intent);
            finish();
        }
    }
}