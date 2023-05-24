package com.example.veterinaria;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.veterinaria.Adapters.AnimalListAdapter;
import com.example.veterinaria.Adapters.VacunasListAdapter;
import com.example.veterinaria.models.Animal;
import com.example.veterinaria.models.Vacunas;

import java.util.ArrayList;
import java.util.List;


public class FragmentVacunas extends Fragment {
    EditText nameVacuna, dateVacuna;
    Button btnDetail, btnVacunas, btnMed, btnAddVacuna;
    List<Vacunas> vacunasList;
    VacunasListAdapter vacunaAdapter;


    public FragmentVacunas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vacunas, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnDetail = view.findViewById(R.id.detalles_btn_d);
        btnVacunas = view.findViewById(R.id.detalles_btn_v);
        btnMed = view.findViewById(R.id.detalles_btn_m);
        btnAddVacuna = view.findViewById(R.id.btn_add_vacuna);
        nameVacuna = view.findViewById(R.id.edit_nameVac);
        dateVacuna = view.findViewById(R.id.edit_date);

        vacunasList = new ArrayList<>();
        vacunaAdapter = new VacunasListAdapter(getActivity(), vacunasList);
        ListView vacunasListView=view.findViewById(R.id.list_vacunas);
        vacunasListView.setAdapter(vacunaAdapter);


        btnAddVacuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addVacuna();
            }
        });

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.fragmentDetalles);
            }
        });

        btnMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.fragmentMedicamentos);
            }
        });

    }
    public void addVacuna(){

        vacunasList.add(new Vacunas(nameVacuna.getText().toString().trim(), dateVacuna.getText().toString().trim()));
    }
    public void getVacunasRegister(){
        vacunasList.add(new Vacunas("Antirrabica", "05 de Abril del 2023"));

    }
}