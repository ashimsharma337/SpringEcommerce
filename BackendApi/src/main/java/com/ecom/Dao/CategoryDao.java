package com.ecom.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entities.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
