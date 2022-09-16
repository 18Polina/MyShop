package com.example.Shop.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String postname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public Collection<Laborbook> getTenants() {
        return tenants;
    }

    public void setTenants(Collection<Laborbook> tenants) {
        this.tenants = tenants;
    }

    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
    private Collection<Laborbook> tenants;
}
