package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.veterinaria.Adapters.AnimalListAdapter;
import com.example.veterinaria.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class ViewMainAnimalsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_newAnimal,  btn_update;

    List<Animal> animalList = null;
    AnimalListAdapter animalAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_main_animals);

        btn_newAnimal=findViewById(R.id.btn_add_animals);
        btn_newAnimal.setOnClickListener(this);

        btn_update=findViewById(R.id.updateBtn);
        btn_update.setOnClickListener(this);

        animalList = new ArrayList<>();

        getAnimalRegister();
        animalAdapter = new AnimalListAdapter(this, animalList);
        ListView animalsListView=findViewById(R.id.animal_list_view);
        animalsListView.setAdapter(animalAdapter);
    }

    public void getAnimalRegister(){
        /*Intent animalRegister = getIntent();
        String nameAnimal = animalRegister.getStringExtra("nameAnimal");
        String ageAnimal = animalRegister.getStringExtra("ageAnimal");
        String razaAnimal = animalRegister.getStringExtra("razaAnimal");
        String especieAnimal = animalRegister.getStringExtra("especieAnimal");
        String generoAnimal = animalRegister.getStringExtra("generoAnimal");*/

        animalList.add(new Animal("chau", "3", "perro", "doberman", "macho"));
        animalList.add(new Animal("huevo", "3", "gato", "cruza", "macho"));
        animalList.add(new Animal("chimole", "2", "perro", "doberman", "hembra"));
        animalList.add(new Animal("Coqueta", "5", "gato", "cruza", "hembra"));
        animalList.add(new Animal("Capricho", "3", "conejo", "cruza", "macho"));
    }


    @Override
    public void onClick(View view) {
        if(view==btn_newAnimal){
            Intent intent = new Intent(ViewMainAnimalsActivity.this,RegisterAnimalActivity.class);
            startActivity(intent);
            finish();
        }

        if(view==btn_update){
            Intent intent = new Intent(ViewMainAnimalsActivity.this,DetailAnimalsActivity.class);
            startActivity(intent);
            finish();
        }
    }
}