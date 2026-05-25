package com.wipro.ecommerce.repository;

import com.wipro.ecommerce.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Integer> {
	
	

}
