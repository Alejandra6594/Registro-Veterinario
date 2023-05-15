package com.example.veterinaria.models;

public class Animal {
    private String nombre;
    private int edad;
    private String especie;
    private String vacuna;

//constructor
    public Animal() {
        this.nombre = "nombre";
        this.edad = 0;
        this.especie = "especie";
        this.vacuna = "vacuna";
    }
    public Animal(String nombre, int edad, String especie, String vacuna) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.vacuna = vacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }



}
