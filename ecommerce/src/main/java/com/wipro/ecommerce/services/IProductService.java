package com.wipro.ecommerce.services;

import java.util.List;
import com.wipro.ecommerce.entity.Product;

public interface IProductService {

    Product addProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(int id);

    Product getProductById(int id);

    List<Product> getAllProducts();
}
