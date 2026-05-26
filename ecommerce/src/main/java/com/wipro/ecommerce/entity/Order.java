package com.wipro.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
    private int orderId;
	private int totalProducts;
    private double totalAmount;
    private String orderStatus;
    
    
    

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
    
   

	public Order(int orderId, int totalProducts, double totalAmount, String orderStatus) {
		super();
		this.orderId = orderId;
		this.totalProducts = totalProducts;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
	}

	


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(final int orderId) {
		this.orderId = orderId;
	}


	public int getTotalProducts() {
		return totalProducts;
	}


	public void setTotalProducts(final int totalProducts) {
		this.totalProducts = totalProducts;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(final double totalAmount) {
		this.totalAmount = totalAmount;
	}

	

	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


}
