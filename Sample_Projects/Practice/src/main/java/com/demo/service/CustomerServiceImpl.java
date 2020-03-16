package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Customer;
import com.demo.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo cr;

	@Override
	public List<Customer> getCustomers() {
		return cr.findAll();
	}
	
	@Override
	public void addCustomer(Customer customer) {
		cr.save(customer);
	}

}
