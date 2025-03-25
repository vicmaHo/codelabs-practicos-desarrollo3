package com.vho.democleanarch.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vho.democleanarch.domain.model.Producto;
import com.vho.democleanarch.domain.repository.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}