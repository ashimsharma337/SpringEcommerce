package com.ecom.services;

import java.util.List;
import java.util.Optional;

import com.ecom.entities.Product;

public interface ProductService {
       
	List<Product> getAllProducts();
	
	Product createProduct(Product product);
	
	Optional<Product> getProductById(Integer productId);
	
	Product updateProduct(Product product);
	
	void deleteProduct(Integer productId);
}
