package com.proyectoFinalJavaPiriz.test.mapper;

import com.proyectoFinalJavaPiriz.test.dto.ProductoDTO;
import com.proyectoFinalJavaPiriz.test.model.Producto;

public class ProductoMapper {

    public static ProductoDTO toDTO(Producto producto) {
        ProductoDTO dto = new ProductoDTO();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setDescripcion(producto.getDescripcion());
        dto.setPrecio(producto.getPrecio());
        dto.setStock(producto.getStock());
        return dto;
    }

    public static Producto toEntity(ProductoDTO dto) {
        Producto producto = new Producto();
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        return producto;
    }
}
