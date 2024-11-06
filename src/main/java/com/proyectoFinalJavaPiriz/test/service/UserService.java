package com.proyectoFinalJavaPiriz.test.service;

import com.proyectoFinalJavaPiriz.test.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}