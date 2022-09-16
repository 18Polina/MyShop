package com.example.Shop.Models;

import javax.persistence.*;

@Entity
public class Arenda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String datenachala, street,nomerdogovora;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Mesto mesto;

    public Arenda(String datenachala, String street, String nomerdogovora, Mesto mesto) {
        this.datenachala = datenachala;
        this.street = street;
        this.nomerdogovora = nomerdogovora;
        this.mesto = mesto;
    }


    public Arenda() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDatenachala() {
        return datenachala;
    }

    public void setDatenachala(String datenachala) {
        this.datenachala = datenachala;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNomerdogovora() {
        return nomerdogovora;
    }

    public void setNomerdogovora(String nomerdogovora) {
        this.nomerdogovora = nomerdogovora;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
}
