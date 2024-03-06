package com.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entities.Order;
import com.course.repositories.OrderRespoitory;

@Service
public class OrderService {

	@Autowired
	private OrderRespoitory orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findById(Long Id) {
		Optional<Order> obj = orderRepository.findById(Id);
		return obj.get();
	}

}
