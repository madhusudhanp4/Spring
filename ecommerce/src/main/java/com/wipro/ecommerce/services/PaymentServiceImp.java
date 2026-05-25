package com.wipro.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecommerce.entity.Payment;
import com.wipro.ecommerce.repository.PaymentRepository;

@Service
public class PaymentServiceImp implements IPaymentService {

	
	
	
    @Autowired
    PaymentRepository repo;

    
    @Override
    public Payment addPayment(Payment payment) {
        return repo.save(payment);
    }
    
    
    @Override
    public Payment updatePayment(Payment payment) {
        return repo.save(payment);
    }

    @Override
    public void deletePayment(int id) {
        repo.deleteById(id);
    }

    @Override
    public Payment getPaymentById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Payment> getAllPayments() {
        return repo.findAll();
    }
}
