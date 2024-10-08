package com.richard.backend.cardapp.backend_cartapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.richard.backend.cardapp.backend_cartapp.models.entities.Product;
import com.richard.backend.cardapp.backend_cartapp.repositories.ProductRepository;

@Service
public class ProductServicesImpl implements ProductServices{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() { 
        return (List<Product>)repository.findAll();
    }


    
}
