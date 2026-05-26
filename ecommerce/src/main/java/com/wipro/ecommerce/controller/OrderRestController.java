package com.wipro.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.wipro.ecommerce.entity.Order;
import com.wipro.ecommerce.services.IOrderService;

@RestController
@RequestMapping("/orders")
public class OrderRestController {

	@Autowired
	IOrderService service;
	
	
	@PostMapping
	public Order addProduct(@RequestBody Order order) {
		
		return service.addOrder(order);
	}
	
	@PutMapping
	public Order updateOrder(@RequestBody Order order) {
		
		return service.updateOrder(order);
	}
	
	@DeleteMapping("/{id}")
	public String deleteOrder(@PathVariable int id) {
		
		return service.deleteOrder(id);
	}
	
	@GetMapping("/{id}")
	public Order getOrder(@PathVariable int id) {
		
		return service.getOrderById(id);
	}
	
	@GetMapping
	public List<Order> getAllOrders(){
		
		return service.getAllOrders();
	}
	
	
}