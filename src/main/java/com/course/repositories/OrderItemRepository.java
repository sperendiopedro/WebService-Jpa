package com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entities.OrderItem;
import com.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
