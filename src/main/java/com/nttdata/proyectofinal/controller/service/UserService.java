package com.nttdata.proyectofinal.controller.service;

import io.quarkus.security.User;

import java.util.List;

public interface UserService {

    User getUserById(String id);

    User createUser(User user);

    boolean updateUser(String id, User user);

    User updateUser(User user);

    List<User> getAllUsers();

    boolean deleteUser(String id);


}
