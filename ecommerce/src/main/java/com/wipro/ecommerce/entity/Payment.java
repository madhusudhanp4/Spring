package com.wipro.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Payment {
	
	@Id
	private int paymentId;
	private String paymentStatus;
	private int amount;
	private String paymentMethod;
	
	

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, String paymentStatus, int amount, String paymentMethod) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
	}
	
	public int getPaymentId() {
		return paymentId;
	}



	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	
	
	

}
