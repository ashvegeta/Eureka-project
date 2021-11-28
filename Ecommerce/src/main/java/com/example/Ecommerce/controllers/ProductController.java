package com.example.Ecommerce.controllers;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.example.Ecommerce.models.Product;
import com.example.Ecommerce.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/getAllProducts")
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @GetMapping(value = "/getProduct")
    public Optional<Product> getProduct(@RequestParam Long id) {
        return repo.findById(id);
    }

    @PostMapping(value = "/addProduct")
    public Product addProduct(@RequestBody Product product) {
        repo.save(product);
        return product;
    }

    @PutMapping(value = "/editProduct")
    public Product addProduct(@RequestParam Long id, @RequestBody Product newProduct) {
        Product oldProduct = (Product)repo.findById(id).get();
        if(newProduct.getId() != null) oldProduct.setId(newProduct.getId());
        if(newProduct.getName() != null) oldProduct.setName(newProduct.getName());
        if(newProduct.getCost() != null) oldProduct.setCost(newProduct.getCost());
        if(newProduct.getCategory() != null) oldProduct.setCategory(newProduct.getCategory());
        repo.save(oldProduct);
        return oldProduct;
    }

    @DeleteMapping(value = "/deleteProduct")
    public String deleteProduct(@RequestParam Long id) {
        repo.deleteById(id);
        return "deleted!";
    }

    @DeleteMapping(value = "/deleteAllProducts")
    public String deleteAllProduct() {
        repo.deleteAll();
        return "deleted all products!";
    }
}
