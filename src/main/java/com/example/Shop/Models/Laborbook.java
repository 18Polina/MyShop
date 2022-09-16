package com.example.Shop.Models;

import javax.persistence.*;
import java.util.Collection;
@Entity
public class Laborbook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int nomer;
    private String datenach;

    public Collection<Personal> getTenant() {
        return tenant;
    }

    public void setTenants(Collection<Personal> tenant) {
        this.tenant = tenant;
    }

    @OneToMany(mappedBy = "laborbook", fetch = FetchType.EAGER)
    private Collection<Personal> tenant;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Post post;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getDatenach() {
        return datenach;
    }

    public void setDatenach(String datenach) {
        this.datenach = datenach;
    }

}
