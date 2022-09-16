package com.example.Shop.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Paymentmethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cachh;
    private String cards;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCachh() {
        return cachh;
    }

    public void setCachh(String cachh) {
        this.cachh = cachh;
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }

    public Collection<Chek> getTenants() {
        return tenants;
    }

    public void setTenants(Collection<Chek> tenants) {
        this.tenants = tenants;
    }

    @OneToMany(mappedBy = "paymentmethod", fetch = FetchType.EAGER)
    private Collection<Chek> tenants;
}
