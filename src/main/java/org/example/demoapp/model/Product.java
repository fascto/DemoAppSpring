package org.example.demoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;

    // Elimina TODOS los getters/setters manuales
    // Lombok los genera automáticamente con @Data
}