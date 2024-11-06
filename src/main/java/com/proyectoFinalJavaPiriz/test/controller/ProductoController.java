package com.proyectoFinalJavaPiriz.test.controller;

import com.proyectoFinalJavaPiriz.test.dto.ProductoDTO;
import com.proyectoFinalJavaPiriz.test.model.Producto;
import com.proyectoFinalJavaPiriz.test.mapper.ProductoMapper;
import com.proyectoFinalJavaPiriz.test.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<ProductoDTO> getAllProductos() {
        return productoService.getAllProductos()
                .stream()
                .map(ProductoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ProductoDTO getProductoById(@PathVariable Long id) {
        Producto producto = productoService.getProductoById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return ProductoMapper.toDTO(producto);
    }

    @PostMapping
    public ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO) {
        Producto producto = ProductoMapper.toEntity(productoDTO);
        Producto savedProducto = productoService.saveProducto(producto);
        return ProductoMapper.toDTO(savedProducto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }
}

