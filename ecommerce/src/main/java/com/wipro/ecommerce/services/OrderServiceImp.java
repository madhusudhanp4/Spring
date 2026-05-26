package com.wipro.ecommerce.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.ecommerce.entity.Order;
import com.wipro.ecommerce.repository.OrderRepository;

@Service
public class OrderServiceImp implements IOrderService {

	@Autowired
	OrderRepository repo;
	
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return repo.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return repo.save(order);
	}

	@Override
	public String deleteOrder(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
		return "Order deleted";
	}

	@Override
	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
