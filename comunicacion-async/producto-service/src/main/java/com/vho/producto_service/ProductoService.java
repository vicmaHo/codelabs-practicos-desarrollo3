package com.vho.producto_service;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final AmqpTemplate customRabbitTemplate;

    public ProductoService(AmqpTemplate customRabbitTemplate) {
        this.customRabbitTemplate = customRabbitTemplate;
    }

    public void enviarListaProductos(List<ProductoDTO> productos) {
        // Enviamos la lista de productos en formato JSON
        customRabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE_NAME,
            RabbitMQConfig.ROUTING_KEY,
            productos
        );
        System.out.println("Lista de productos enviada con éxito en formato JSON.");
    }
}