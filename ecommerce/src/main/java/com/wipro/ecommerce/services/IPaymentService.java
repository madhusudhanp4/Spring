package com.wipro.ecommerce.services;

import java.util.List;

import com.wipro.ecommerce.entity.Payment;

public interface IPaymentService {

    Payment addPayment(Payment payment);

    Payment updatePayment(Payment payment);

    String deletePayment(int paymentId);

    Payment getPaymentById(int paymentId);

    List<Payment> getAllPayments();
}