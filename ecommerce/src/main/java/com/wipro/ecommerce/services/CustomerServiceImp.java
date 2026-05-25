package com.wipro.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecommerce.entity.Customer;
import com.wipro.ecommerce.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements  ICustomerService{
	
	
	@Autowired
	CustomerRepository custrepo;

	
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return custrepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return custrepo.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return custrepo.findById(id).orElse(null);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return custrepo.save(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		custrepo.deleteById(id);
		
	}
	
	

}
