package com.richard.backend.cardapp.backend_cartapp.services;

import java.util.List;

import com.richard.backend.cardapp.backend_cartapp.models.entities.Product;

public interface ProductServices {
    List<Product> findAll();
} 