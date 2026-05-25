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

import com.wipro.ecommerce.entity.Payment;
import com.wipro.ecommerce.services.IPaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentRestController {

    @Autowired
    IPaymentService service;

    @PostMapping("/add")
    public Payment add(@RequestBody Payment p) {
        return service.addPayment(p);
    }

    @PutMapping("/update")
    public Payment update(@RequestBody Payment p) {
        return service.updatePayment(p);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deletePayment(id);
        return "Deleted";
    }

    @GetMapping("/{id}")
    public Payment getById(@PathVariable int id) {
        return service.getPaymentById(id);
    }

    @GetMapping
    public List<Payment> getAll() {
        return service.getAllPayments();
    }
}
