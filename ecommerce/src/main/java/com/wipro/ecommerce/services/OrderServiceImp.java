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
        return repo.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return repo.save(order);
    }
    
    @Override
    public void deleteOrder(int id) {
        repo.deleteById(id);
    }

    
    @Override
    public Order getOrderById(int id) {
        return repo.findById(id).orElse(null);
    }

    
    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }
}
