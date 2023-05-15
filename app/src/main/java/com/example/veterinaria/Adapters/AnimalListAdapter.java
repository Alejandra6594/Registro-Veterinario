package com.example.veterinaria.Adapters;


//clase de tipo adaptador en donde retorna una lista con la información de los animales que son registrados
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.veterinaria.R;
import com.example.veterinaria.models.Animal;

import java.util.List;
//arrayadapter pasa información al componente animal_list_item
public class AnimalListAdapter extends ArrayAdapter<Animal> {
    private Context context;
    private List<Animal> animalsList;


    public AnimalListAdapter(@NonNull Context context, List<Animal> animalsList) {
        //la información que recibe la clase se transfiere al componente padre ArrayAdapter
        super(context,R.layout.activity_animal_item_list,animalsList);
        this.context = context;
        this.animalsList = animalsList;
    }
//creamos el metodo getView el cual retorna una vista que está asociada al componente animal_list_item
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        //se creal la lista donde se pasa la información- busca la vista creada donde quieres que mande la información
        View listItemView = inflater.inflate(R.layout.activity_animal_item_list,null,true);

        //busca los textView asociados al animal_list_animal
        TextView nameAnimalView = listItemView.findViewById(R.id.name_animal);
        TextView ageAnimalView = listItemView.findViewById(R.id.age_animal);


        Animal currentAnimal = animalsList.get(position);

        //despues de buscar los textView, setteamos el contenido de los componentes textView con la infromación actual del animal registrado
        nameAnimalView.setText(currentAnimal.getNombre());
        ageAnimalView.setText(String.valueOf(currentAnimal.getEdad()));

        return listItemView;
    }
}
