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

import com.wipro.ecommerce.entity.Order;
import com.wipro.ecommerce.services.IOrderService;

@RestController
@RequestMapping("/orders")
public class OrderRestController {

    @Autowired
    IOrderService service;

    @PostMapping("/add")
    public Order add(@RequestBody Order o) {
        return service.addOrder(o);
    }

    @PutMapping("/update")
    public Order update(@RequestBody Order o) {
        return service.updateOrder(o);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteOrder(id);
        return "Deleted";
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable int id) {
        return service.getOrderById(id);
    }

    @GetMapping
    public List<Order> getAll() {
        return service.getAllOrders();
    }
}