package com.example.veterinaria;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.veterinaria.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class RegisterAnimalActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    Button btn_insertAnimal;
    ImageButton btn_regresar;
    EditText nameAnimalInput;
    EditText ageAnimalInput;
    Spinner spinnerTypesAnimals;
    String selectedType, nameAnimal;
    Integer ageAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_animal);
        btn_insertAnimal=findViewById(R.id.btn_insert_animal);
        btn_insertAnimal.setOnClickListener(this);

        btn_regresar=findViewById(R.id.button_regresar);
        /*btn_regresar.setBackgroundColor(transparent);*/
        btn_regresar.setOnClickListener(this);


        //se busca el componente por id
        spinnerTypesAnimals=findViewById(R.id.spinner_types_animals);
        //carga el spinner con datos
        loadSpinner(spinnerTypesAnimals);
        //le asignamos un evento cada vez que haya un cambio en el spinner
        spinnerTypesAnimals.setOnItemSelectedListener(this);

        nameAnimalInput = findViewById(R.id.edit_name_animals);
        ageAnimalInput = findViewById(R.id.edit_age_animals);
        //capturando datos de los inputs

    }


    //función que recibe un parametro de tipo Spinner
    public void loadSpinner(Spinner spinnerType){

        //creamos una lista con las especies de los animales
        List<String> listTypesAimals = new ArrayList<>();
        listTypesAimals.add("Selecciona la especie");
        listTypesAimals.add("Perro");
        listTypesAimals.add("Gato");
        listTypesAimals.add("Conejo");

        //crea un ArrayAdapter utilizando una lista de elementos y un layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,listTypesAimals);

        //especifica el layout que se utilizará cuando se muestre la lista de opciones
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //aplica el ArrayAdapter al spinner
        spinnerType.setAdapter(adapter);
    }
        //se ejecuta cada vez que la especie del spinner cambie
    public void loadVaccinesTypes(String typeSpecie){
        if(typeSpecie =="Selecciona la especie"){
            return;
        }
        if(typeSpecie == "Perro"){
            Toast.makeText(RegisterAnimalActivity.this,
                    "Cargar Vacunas de Perros " ,
                    Toast.LENGTH_SHORT).show();
        }
        if(typeSpecie == "Gato"){
            Toast.makeText(RegisterAnimalActivity.this,
                    "Cargar Vacunas de Gatos " ,
                    Toast.LENGTH_SHORT).show();
        }
        if(typeSpecie == "Conejo"){
            Toast.makeText(RegisterAnimalActivity.this,
                    "Cargar Vacunas de Conejos " ,
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
        if(view==btn_insertAnimal){
            String name = nameAnimalInput.getText().toString().trim();
            Integer age = parseInt(ageAnimalInput.getText().toString().trim());

            Intent intent = new Intent(RegisterAnimalActivity.this,InfoSuccessRegisterActivity.class);
            intent.putExtra("nameAnimal", nameAnimalInput.getText().toString());
            intent.putExtra("ageAnimal",ageAnimalInput.getText().toString());
            startActivity(intent);
            finish();
        }
        if(view==btn_regresar){
            Intent intent = new Intent(RegisterAnimalActivity.this,ViewMainAnimalsActivity.class);
            startActivity(intent);
            finish();
        }
    }
    //cuando hay un cambio se ejecuta todo lo de adentro
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
        //guardamos el valor del elemento seleccionado del spinner en la variable selectedType
         selectedType = parent.getItemAtPosition(pos).toString();
        //cada vez que la variable selectedType cambie ejecutamos la funcion loadVaccinesTypes
        loadVaccinesTypes(selectedType);
            /*Toast.makeText(parent.getContext(),
                    "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
                    Toast.LENGTH_SHORT).show();*/
    }


    //se ejecuta cuando deja de escuchar cambios
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        //
    }
}