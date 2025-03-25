package com.vho.demorest.service;

import org.springframework.stereotype.Service;

import com.vho.demorest.model.Pais;
import com.vho.demorest.repository.PaisRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {
    private final PaisRepository paisRepository;

    // inyecto el repositorio
    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public List<Pais> obtenerTodos() {
        return paisRepository.findAll();
    }

    public Optional<Pais> obtenerPorId(Long id) {
        return paisRepository.findById(id);
    }

    public Optional<Pais> obtenerPorNombre(String nombre) {
        return paisRepository.findByName(nombre);
    }

    public Pais guardarPais(Pais pais) {
        return paisRepository.save(pais);
    }

    public void eliminarPais(Long id) {
        paisRepository.deleteById(id);
    }

    public List<Pais> crearPaises(List<Pais> paises) {
        return paisRepository.saveAll(paises);
    }
}