package com.example.Shop.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tovar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nametovar;

    public List<Chek> getCheks() {
        return cheks;
    }

    public void setCheks(List<Chek> cheks) {
        this.cheks = cheks;
    }

    @ManyToMany
    @JoinTable (name="tovar_chek",
            joinColumns=@JoinColumn (name="tovar_id"),
            inverseJoinColumns=@JoinColumn(name="chek_id"))
    private List<Chek> cheks;
    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Producttype producttype;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNametovar() {
        return nametovar;
    }

    public void setNametovar(String nametovar) {
        this.nametovar = nametovar;
    }

    public Producttype getProducttype() {
        return producttype;
    }

    public void setProducttype(Producttype producttype) {
        this.producttype = producttype;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Proizvod proizvod;
}
