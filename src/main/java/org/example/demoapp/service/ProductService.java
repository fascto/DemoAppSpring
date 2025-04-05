package org.example.demoapp.service;

import org.example.demoapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>(List.of(
            new Product(101, "SAMSUNG", 1_200_000),
            new Product(12, "iPhone", 433_333)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(new Product(-1, "Not item found", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }


    public void updateProduct(Product productToUpdate) {
        for (Product item : products) {
            if (item.getId() == productToUpdate.getId()) {
                products.set(products.indexOf(item), productToUpdate);
            }
        }

    }
        public void deleteProduct (int id){
            boolean exist = products.removeIf(product -> product.getId() == id);
            if (!exist) {
                throw new IllegalArgumentException("Product ID: " + id + " Not Found...");
            }
    }

}
