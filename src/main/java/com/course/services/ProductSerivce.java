package com.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entities.Product;
import com.course.repositories.ProductRepository;


@Service
public class ProductSerivce {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findById(Long Id) {
		Optional<Product> obj = productRepository.findById(Id);
		return obj.get();
	}
}
