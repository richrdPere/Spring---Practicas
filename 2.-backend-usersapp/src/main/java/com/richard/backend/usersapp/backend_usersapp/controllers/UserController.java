package com.richard.backend.usersapp.backend_usersapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import com.richard.backend.usersapp.backend_usersapp.services.UserService;
import com.richard.backend.usersapp.backend_usersapp.models.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> list(){
        return service.findAll();
    }

    // Metodo Get
    @GetMapping("/{id}")    
    public ResponseEntity<?> show(@PathVariable Long id){
        Optional<User> userOptional = service.findById(id);

        if(userOptional.isPresent()){
            return ResponseEntity.ok(userOptional.orElseThrow()); // protocolo 200
        }
        return ResponseEntity.notFound().build(); // error 404
    }

    // Metodo Post
    @PostMapping  
    public ResponseEntity<?> create(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(user));
    }

    // Metodo Put
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable Long id) {
        Optional<User> o = service.update(user, id);
        if(o.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(o.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    // Metodo Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id){
        Optional<User> o = service.findById(id);

        if (o.isPresent()){
            service.remove(id);
            return ResponseEntity.noContent().build(); //204
        }
     
        return ResponseEntity.notFound().build(); // 404
    }
}
