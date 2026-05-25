package com.wipro.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Payment {
	
	@Id

	private int paymentId;

	private String paymentMethod;
	private double amount;
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Payment(int paymentId, String paymentMethod, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
	}


	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	
	
	

}
