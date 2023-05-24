package com.example.veterinaria;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class FragmentDetalles extends Fragment {

Button btnDetail, btnVacunas, btnMed;
ImageView atras;
    public FragmentDetalles() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalles, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnDetail = view.findViewById(R.id.detalles_btn_d);
        btnVacunas = view.findViewById(R.id.detalles_btn_v);
        btnMed = view.findViewById(R.id.detalles_btn_m);

        atras = view.findViewById(R.id.btn_atras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),DetailAnimalsActivity.class);
                startActivity(intent);
            }
        });

        btnVacunas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.fragmentVacunas);
            }
        });

        btnMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.fragmentMedicamentos);
            }
        });

    }
}