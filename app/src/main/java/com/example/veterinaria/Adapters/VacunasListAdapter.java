package com.example.veterinaria.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.veterinaria.R;
import com.example.veterinaria.models.Vacunas;

import java.util.List;

public class VacunasListAdapter extends ArrayAdapter<Vacunas> {
    private Context context;
    private List<Vacunas> vacunasList;


    public VacunasListAdapter(@NonNull Context context, List<Vacunas> vacunasList) {
        //la información que recibe la clase se transfiere al componente padre ArrayAdapter
        super(context, R.layout.activity_vacunas_item_list,vacunasList);
        this.context = context;
        this.vacunasList = vacunasList;
    }


    //creamos el metodo getView el cual retorna una vista que está asociada al componente animal_list_item
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        //se creal la lista donde se pasa la información- busca la vista creada donde quieres que mande la información
        View listItemView =inflater.inflate(R.layout.activity_vacunas_item_list,null,true);

        //busca los textView asociados al animal_list_animal
        TextView nameVacunasView = listItemView.findViewById(R.id.name_vacuna);

        Vacunas currentVacunas = vacunasList.get(position);

        //despues de buscar los textView, setteamos el contenido de los componentes textView con la información actual de la vacuna registrada
        nameVacunasView.setText(currentVacunas.getNomVac());

        TextView fechaVacunasView = listItemView.findViewById(R.id.date_vacuna);

        nameVacunasView.setText(currentVacunas.getFechaVac());


        return listItemView;
    }
}
