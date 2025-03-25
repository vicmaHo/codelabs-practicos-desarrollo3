package com.vho.democleanarch.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vho.democleanarch.domain.model.Producto;
import com.vho.democleanarch.domain.repository.ProductoRepository;

@Service
public class ListarProductosUseCase {
    private final ProductoRepository productoRepository;

    public ListarProductosUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> ejecutar() {
        return productoRepository.findAll();
    }
}