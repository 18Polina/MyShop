package com.example.Shop.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Mesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public long getId() {
        return id;
    }



    public Collection<Arenda> getTenants() {
        return tenants;
    }

    public void setTenants(Collection<Arenda> tenants) {
        this.tenants = tenants;
    }

    @OneToMany(mappedBy = "mesto", fetch = FetchType.EAGER)
    private Collection<Arenda> tenants;
    public Mesto() {
    }
}
