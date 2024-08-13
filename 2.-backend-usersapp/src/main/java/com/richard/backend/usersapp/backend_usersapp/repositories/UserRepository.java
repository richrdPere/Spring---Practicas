package com.richard.backend.usersapp.backend_usersapp.repositories;

import org.springframework.data.repository.CrudRepository;

// Modelos
import com.richard.backend.usersapp.backend_usersapp.models.entities.User;
public interface UserRepository extends CrudRepository<User, Long>{

}
