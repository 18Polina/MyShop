package com.example.Shop.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String surname,name,birthday,street;
    private String middlename;
    private int seriapasporta,nomerpasporta,snils,home,flat,salary;
    private int thebuildingofthehouse;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private User user;

    public Laborbook getLaborbook() {
        return laborbook;
    }

    public void setLaborbook(Laborbook laborbook) {
        this.laborbook = laborbook;
    }

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Laborbook laborbook;
    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Mesto mesto;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public int getSeriapasporta() {
        return seriapasporta;
    }

    public void setSeriapasporta(int seriapasporta) {
        this.seriapasporta = seriapasporta;
    }

    public int getNomerpasporta() {
        return nomerpasporta;
    }

    public void setNomerpasporta(int nomerpasporta) {
        this.nomerpasporta = nomerpasporta;
    }

    public int getSnils() {
        return snils;
    }

    public void setSnils(int snils) {
        this.snils = snils;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getThebuildingofthehouse() {
        return thebuildingofthehouse;
    }

    public void setThebuildingofthehouse(int thebuildingofthehouse) {
        this.thebuildingofthehouse = thebuildingofthehouse;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
