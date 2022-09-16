package com.example.Shop.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chek {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int inn,summi,kolvotovar;

    public List<Tovar> getTovars() {
        return tovars;
    }

    public void setTovars(List<Tovar> tovars) {
        this.tovars = tovars;
    }

    @ManyToMany
    @JoinTable(name="tovar_chek",
            joinColumns=@JoinColumn(name="chek_id"),
            inverseJoinColumns=@JoinColumn(name="tovar_id"))
    private List<Tovar> tovars;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public int getSummi() {
        return summi;
    }

    public void setSummi(int summi) {
        this.summi = summi;
    }

    public int getKolvotovar() {
        return kolvotovar;
    }

    public void setKolvotovar(int kolvotovar) {
        this.kolvotovar = kolvotovar;
    }

    public Paymentmethod getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(Paymentmethod paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Paymentmethod paymentmethod;
    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Personal personal;

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
