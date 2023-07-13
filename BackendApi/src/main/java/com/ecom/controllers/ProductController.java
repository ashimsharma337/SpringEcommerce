package com.ecom.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.entities.Product;
import com.ecom.services.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}
	
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		return this.productService.createProduct(product);
	}
	
	@GetMapping("/products/{productId}")
	public Optional<Product> getProductById(@PathVariable String productId) {
		return this.productService.getProductById(Integer.parseInt(productId));
	}
	
	@PutMapping("/products/{productId}")
	public Product updateProduct(@RequestBody Product product) {
		return this.productService.updateProduct(product);
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId) {
		try {
			this.productService.deleteProduct(Integer.parseInt(productId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
