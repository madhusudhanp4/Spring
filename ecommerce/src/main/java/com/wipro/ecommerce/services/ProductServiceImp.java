package com.wipro.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecommerce.entity.Product;
import com.wipro.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public String deleteProduct(int productId) {
		// TODO Auto-generated method stub
		repo.deleteById(null);
		return "Product deleted";
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return repo.findById(productId).orElse(null);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}