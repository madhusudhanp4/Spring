package com.wipro.ecommerce.services;

import java.util.List;
import com.wipro.ecommerce.entity.Product;

public interface IProductService {

    Product addProduct(Product product);

    Product updateProduct(Product product);

    String deleteProduct(int productId);

    Product getProductById(int productId);

    List<Product> getAllProducts();
}
