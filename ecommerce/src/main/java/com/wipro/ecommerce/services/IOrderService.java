package com.wipro.ecommerce.services;

import java.util.List;

import com.wipro.ecommerce.entity.Order;

public interface IOrderService {

    Order addOrder(Order order);

    Order updateOrder(Order order);

    void deleteOrder(int id);

    Order getOrderById(int id);

    List<Order> getAllOrders();
}