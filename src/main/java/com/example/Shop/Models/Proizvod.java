package com.example.Shop.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Proizvod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Collection<Tovar> getTenants() {
        return tenants;
    }

    public void setTenants(Collection<Tovar> tenants) {
        this.tenants = tenants;
    }

    @OneToMany(mappedBy = "proizvod", fetch = FetchType.EAGER)
    private Collection<Tovar> tenants;
}
