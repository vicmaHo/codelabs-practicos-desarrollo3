package com.vho.producto_service;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productorService;

    public ProductoController(ProductoService productorService) {
        this.productorService = productorService;
    }

    @PostMapping("/enviar")
    public String enviarProductos(@RequestBody List<ProductoDTO> productos) {
        productorService.enviarListaProductos(productos);
        return "Productos enviados con éxito al pedido-service";
    }
}