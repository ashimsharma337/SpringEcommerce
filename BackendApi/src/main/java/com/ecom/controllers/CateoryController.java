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

import com.ecom.entities.Category;
import com.ecom.services.CategoryService;

@RestController
public class CateoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return this.categoryService.findAll();
	}
	
	@PostMapping("/categories")
	public Category createCategory(@RequestBody  Category category) {
		return this.categoryService.createCategory(category);
	}
	
	@GetMapping("/categories/{categoriesId}")
	public Optional<Category> getCategoryById(@PathVariable String categoriesId) {
		return this.categoryService.findById(Integer.parseInt(categoriesId));
	}
	
	@PutMapping("/categories")
	public Category updateCategory(@RequestBody  Category category) {
		return this.categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/categories/{categoriesId}")
	public ResponseEntity<HttpStatus> deleteCategory(@PathVariable String categoriesId) {
		try {
			this.categoryService.deleteCategory(Integer.parseInt(categoriesId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
