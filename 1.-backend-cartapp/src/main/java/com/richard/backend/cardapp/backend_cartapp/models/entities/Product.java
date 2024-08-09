package com.richard.backend.cardapp.backend_cartapp.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long price;

    // Metodos Set y Get
    // Para id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Para description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Para price
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    } 
}
