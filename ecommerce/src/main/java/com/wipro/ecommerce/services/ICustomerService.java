package com.wipro.ecommerce.services;

import java.util.List;

import com.wipro.ecommerce.entity.Customer;


public interface ICustomerService {
	
	Customer addCustomer(Customer customer);
	
	Customer updateCustomer(Customer customer);
	
	String deleteCustomer(int customerId);
	
	Customer getCustomerById(int customerId);
	
	List<Customer> getAllCustomers();

	
}
