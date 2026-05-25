package com.wipro.ecommerce.services;

import java.util.List;

import com.wipro.ecommerce.entity.Customer;

public interface ICustomerService {
	
	Customer addCustomer(Customer customer);
	
	List<Customer> getAllCustomers();

	Customer getCustomerById(int id);

	Customer updateCustomer(Customer customer);

	void deleteCustomer(int id);

}
