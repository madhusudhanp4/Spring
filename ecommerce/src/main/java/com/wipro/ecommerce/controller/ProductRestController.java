package com.wipro.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ecommerce.entity.Product;
import com.wipro.ecommerce.services.IProductService;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @Autowired
    IProductService service;

    @PostMapping("/add")
    public Product add(@RequestBody Product p) {
        return service.addProduct(p);
    }

    @PutMapping("/update")
    public Product update(@RequestBody Product p) {
        return service.updateProduct(p);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteProduct(id);
        return "Deleted";
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }
}
