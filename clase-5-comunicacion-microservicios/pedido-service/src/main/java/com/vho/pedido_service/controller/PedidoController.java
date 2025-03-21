package com.vho.pedido_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vho.pedido_service.client.ProductoClient;
import com.vho.pedido_service.dto.ProductoDTO;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final ProductoClient productoClient;

    public PedidoController(ProductoClient productoClient) {
        this.productoClient = productoClient;
    }

    @GetMapping("/crear")
    public ResponseEntity<?> crearPedido() {
        List<ProductoDTO> productos = productoClient.obtenerProductos();
        return ResponseEntity.ok("Pedido creado con productos: " + productos);
    }
}