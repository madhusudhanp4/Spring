package com.wipro.ecommerce.services;

import java.util.List;

import com.wipro.ecommerce.entity.Payment;

public interface IPaymentService {

    Payment addPayment(Payment payment);

    Payment updatePayment(Payment payment);

    void deletePayment(int id);

    Payment getPaymentById(int id);

    List<Payment> getAllPayments();
}