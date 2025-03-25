package com.vho.democleanarch.delivery;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vho.democleanarch.application.ProductoService;
import com.vho.democleanarch.application.usecase.ListarProductosUseCase;
import com.vho.democleanarch.domain.model.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    // en la realidad se usaria o el servicio o el usecase, no ambos, pero por temas de practica lo hago ambas
    private final ProductoService productoService;
    private final ListarProductosUseCase listarProductosUseCase;

    public ProductoController(ProductoService productoService, ListarProductosUseCase listarProductosUseCase) {
        this.productoService = productoService;
        this.listarProductosUseCase = listarProductosUseCase;
    }


    // hago uso del usecase
    @GetMapping("/listar")
    public List<Producto> listarProductos() {
        return listarProductosUseCase.ejecutar();
    }

    // uso del servicio
    @GetMapping
    public List<Producto> obtenerProductos() {
        return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {
        return productoService.buscarPorId(id);
    }
}