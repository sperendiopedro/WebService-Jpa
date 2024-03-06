package com.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entities.Category;
import com.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> findAll() {
		return categoryRepo.findAll();
	}

	public Category findById(Long Id) {
		Optional<Category> obj = categoryRepo.findById(Id);
		return obj.get();
	}
}
