package com.example.veterinaria.models;

public class Vacunas {
    private String nomVac;
    private String fechaVac;


    public Vacunas(String nomVac, String fechaVac) {
        this.nomVac = nomVac;
        this.fechaVac = fechaVac;
    }

    public String getNomVac() {
        return nomVac;
    }

    public void setNomVac(String nomVac) {
        this.nomVac = nomVac;
    }

    public String getFechaVac() {
        return fechaVac;
    }

    public void setFechaVac(String fechaVac) {
        this.fechaVac = fechaVac;
    }
}
