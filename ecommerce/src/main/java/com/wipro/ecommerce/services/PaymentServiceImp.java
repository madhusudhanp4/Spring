package com.wipro.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.ecommerce.entity.Payment;
import com.wipro.ecommerce.repository.PaymentRepository;

@Service
public class PaymentServiceImp implements IPaymentService {

	PaymentRepository repo;

	@Override
	public Payment addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return repo.save(payment);
	}

	@Override
	public Payment updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		return repo.save(payment);
	}

	@Override
	public String deletePayment(int paymentId) {
		// TODO Auto-generated method stub
		repo.deleteById(paymentId);
		
		return "Payment Cancelled";
	}

	@Override
	public Payment getPaymentById(int paymentId) {
		// TODO Auto-generated method stub
		return repo.findById(paymentId).orElse(null);
		
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
}
