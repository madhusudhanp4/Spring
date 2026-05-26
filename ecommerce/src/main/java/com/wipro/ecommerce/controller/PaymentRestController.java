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

import com.wipro.ecommerce.entity.Payment;
import com.wipro.ecommerce.services.IPaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentRestController {

	@Autowired
	IPaymentService service;
	
	
	@PostMapping
	public Payment addPayment(@RequestBody Payment payment) {
		
		return service.addPayment(payment);
	}
	
	@PutMapping
	public Payment updatePayment(@RequestBody Payment payment) {
		
		return service.updatePayment(payment);
	}
	
	@DeleteMapping("{id}")
	public String deletePayment(@PathVariable int id) {
		
		return service.deletePayment(id);
	}
	
	@GetMapping("/{id}")
	public Payment getPayment(@PathVariable int id) {
		
		return service.getPaymentById(id);
	}
	
	@GetMapping
	public List<Payment> getAllPayments(){
		return service.getAllPayments();
	}
}
