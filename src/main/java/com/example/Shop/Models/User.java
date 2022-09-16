package com.example.Shop.Models;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private boolean active;

    public Collection<Personal> getTenants() {
        return tenants;
    }

    public void setTenants(Collection<Personal> tenants) {
        this.tenants = tenants;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Collection<Personal> tenants;


}
