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
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		
		return service.addProduct(product);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		return	service.deleteProduct(id);
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		
		return service.getProductById(id);
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		
		return service.getAllProducts();
	}
}
