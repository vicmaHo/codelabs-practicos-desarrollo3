package com.vho.producto_service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductoDTO {

    private Long id;
    private String nombre;
    private Double precio;

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
