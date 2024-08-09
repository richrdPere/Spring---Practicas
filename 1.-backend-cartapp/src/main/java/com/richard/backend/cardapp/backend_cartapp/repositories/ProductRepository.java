package com.richard.backend.cardapp.backend_cartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.richard.backend.cardapp.backend_cartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
    
} 
