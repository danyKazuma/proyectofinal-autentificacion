package com.nttdata.proyectofinal.service.impl;

import com.nttdata.proyectofinal.controller.UserRepository;
import com.nttdata.proyectofinal.service.UserService;
import io.quarkus.security.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public User getUserById(String id) {
        return userRepository.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }
}