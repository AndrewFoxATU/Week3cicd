package com.example.week3cicd;

import org.springframework.core.PriorityOrdered;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product("Tv", "Made by Sony", 899, 0));
        products.add(new Product("Radio", "Made by Samsung", 99, 1));
        products.add(new Product("Car", "Made by cool", 200, 2));
        products.add(new Product("Train", "Made by Sa", 888, 3));
        products.add(new Product("Yes", "Made by 1", 444, 4));
        products.add(new Product("Test", "Made by Myself", 222, 5));
        products.add(new Product("Word", "Made by Me", 777, 6));
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return products;
    }

    @PostMapping("/addProduct")
    public ResponseEntity<List> addProduct(@RequestBody Product product) {
        products.add(product);
        return ResponseEntity.ok(products);
    }

    @PutMapping("/putProduct/{id}")
    public ResponseEntity<List> putProduct(@PathVariable int id, @RequestBody Product ProductController) {

        products.set(id, ProductController);
        return ResponseEntity.ok(products);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<List> deleteProduct(@PathVariable int id) {
        products.remove(id);
        return ResponseEntity.ok(products);
    }
}
