package com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entities.Order;

public interface OrderRespoitory extends JpaRepository<Order, Long>{
	
}
