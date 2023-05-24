package com.deliciousDelivery.major.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliciousDelivery.major.model.Category;
import com.deliciousDelivery.major.repository.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List <Category> getAllCategory(){
		return categoryRepository.findAll();
	}
	
	public void addCategory (Category category) {
		categoryRepository.save(category);
		
	}
	
	public void removeCategoryById(int id) {
		categoryRepository.deleteById(id);
		
	}
	
	public java.util.Optional<Category> getCategoryById(int id) {
		return categoryRepository.findById(id);
	}
	
	

}
