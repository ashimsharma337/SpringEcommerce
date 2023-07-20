package com.ecom.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Dao.CategoryDao;
import com.ecom.entities.Category;
import com.ecom.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> findAll() {
		
		return categoryDao.findAll();
	}

	@Override
	public Optional<Category> findById(Integer categoryId) {
		
		return categoryDao.findById(categoryId);
	}

	@Override
	public Category createCategory(Category category) {
		categoryDao.save(category);
		return category;
	}

	@Override
	public Category updateCategory(Category category) {
	    categoryDao.save(category);
	    return category;
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		categoryDao.deleteById(categoryId);
	}

	


	

}
