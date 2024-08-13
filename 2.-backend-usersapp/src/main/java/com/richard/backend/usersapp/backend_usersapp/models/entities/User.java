package com.richard.backend.usersapp.backend_usersapp.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

    @Column(unique = true)
    private String email;

    // Metodos set y get
    // para id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // para username
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    // para password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // para email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
