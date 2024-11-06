package com.proyectoFinalJavaPiriz.test.repository;

import com.proyectoFinalJavaPiriz.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
