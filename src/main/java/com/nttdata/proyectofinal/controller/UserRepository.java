package com.nttdata.proyectofinal.controller;

import io.quarkus.security.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    User createUser(User user);

    User getUserById(String id);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(String id);
}