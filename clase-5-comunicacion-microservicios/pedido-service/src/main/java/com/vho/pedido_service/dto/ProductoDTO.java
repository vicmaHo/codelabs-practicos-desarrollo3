package com.vho.pedido_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter  
@Setter  
public class ProductoDTO {  
    private Long id;  
    private String nombre;  
    private Double precio;  
    
    @Override  
    public String toString() {  
        return "ProductoDTO{" +  
                "id=" + id +  
                ", nombre='" + nombre + '\'' +  
                ", precio=" + precio +  
                '}';  
    }  
}