package com.example.veterinaria.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Animal implements Parcelable {
    private String nombre;
    private String edad;
    private String especie;
    private String raza;

    private String genero;

//constructor
    public Animal() {
        this.nombre = "nombre";
        this.edad = "0";
        this.especie = "especie";
        this.raza = "raza";
        this.genero = "genero";
    }
    public Animal(String nombre, String edad, String especie, String raza, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero(){return genero;}

    public void setGenero(String genero){this.genero = genero;}


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {

    }
}
