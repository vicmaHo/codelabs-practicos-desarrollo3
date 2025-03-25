package com.vho.democleanarch.infrastructure.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vho.democleanarch.domain.model.Producto;
import com.vho.democleanarch.domain.repository.ProductoRepository;

public interface ProductoRepositoryImpl extends JpaRepository<Producto, Long>, ProductoRepository {

    @Override
    List<Producto> findAll();

    @Override
    Optional<Producto> findById(Long id);

}
