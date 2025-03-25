package com.vho.democleanarch.domain.repository;

import java.util.List;
import java.util.Optional;

import com.vho.democleanarch.domain.model.Producto;

public interface ProductoRepository {
    Optional<Producto> findById(Long id);
    List<Producto> findAll();
}