package com.ecom.services;

import java.util.List;
import java.util.Optional;
import com.ecom.entities.Category;

public interface CategoryService {

	List<Category> findAll();
	
	Optional<Category> findById(Integer categoryId);
	
	Category createCategory(Category category);
	
	Category updateCategory(Category category);
	
	void deleteCategory(Integer categoryId);
	
}
