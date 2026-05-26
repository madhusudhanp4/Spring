package com.wipro.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecommerce.entity.Customer;
import com.wipro.ecommerce.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements  ICustomerService{

	@Autowired
	CustomerRepository repo;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		return repo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public String deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		repo.deleteById(customerId);
		
		return "Customer deleted";
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		
		return repo.findById(customerId).orElse(null);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
}
