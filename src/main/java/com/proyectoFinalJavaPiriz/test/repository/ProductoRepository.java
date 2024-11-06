package com.proyectoFinalJavaPiriz.test.repository;

import com.proyectoFinalJavaPiriz.test.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
