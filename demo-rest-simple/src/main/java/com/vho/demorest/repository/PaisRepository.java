package com.vho.demorest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vho.demorest.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {

    Optional<Pais> findByName(String name);
}
