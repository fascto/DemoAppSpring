package org.example.demoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {

    @Id
    private int id;
    private String name;
    private double price;

    public Product() {

    }

    // Elimina TODOS los getters/setters manuales
    // Lombok los genera automáticamente con @Data
}