package com.vho.producto_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.vho.producto_service.model.Producto;
    
@RestController
@RequestMapping("/productos")  
public class ProductoController {  
  
    private static final List<Producto> PRODUCTOS = List.of(  
            new Producto(1L, "Laptop", 1200.00),  
            new Producto(2L, "Smartphone", 800.00),  
            new Producto(3L, "Laptop ASUS", 1200.00),  
            new Producto(4L, "Smartphone Samsung", 800.00)  
    );  
  
    @GetMapping("/{id}")  
    public Producto obtenerProducto(@PathVariable Long id) {  
        return PRODUCTOS.stream()  
                .filter(p -> p.id().equals(id))  
                .findFirst()  
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));  
    }  
  
    @GetMapping("/productos")  
    public List<Producto> listarProductos() {  
        return List.of(  
                new Producto(1L, "Laptop", 1500.0),  
                new Producto(2L, "Mouse", 25.0),  
                new Producto(3L, "Laptop ASUS", 1200.00),  
                new Producto(4L, "Smartphone Samsung", 800.00)  
        );  
    }  
}