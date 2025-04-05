package org.example.demoapp.service;

import org.example.demoapp.model.Product;
import org.example.demoapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repository;

//    private final List<Product> products = new ArrayList<>(List.of(
//            new Product(101, "SAMSUNG", 1_200_000),
//            new Product(12, "iPhone", 433_333)
//    ));

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id)
                .orElse(new Product(-1, "Not item found", 0));
    }

    public void addProduct(Product product) {
        repository.save(product);
    }


    public void updateProduct(Product productToUpdate) {
        repository.save(productToUpdate);

    }

    public void deleteProduct (int id){
        repository.deleteById(id);
    }

}
