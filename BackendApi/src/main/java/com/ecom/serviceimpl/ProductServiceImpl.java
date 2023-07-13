package com.ecom.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Dao.ProductDao;
import com.ecom.entities.Product;
import com.ecom.services.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	public ProductServiceImpl() {
		
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}

	@Override
	public Product createProduct(Product product) {
		productDao.save(product);
		return product;
	
	}

	@Override
	public Optional<Product> getProductById(Integer productId) {
		return productDao.findById(productId);
	}

	@Override
	public Product updateProduct(Product product) {
		return productDao.save(product);
	}

	@Override
	public void deleteProduct(Integer productId) {
		productDao.deleteById(productId);
	}

}
