package com.demo.service;

import java.util.List;

import com.demo.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();
	
	void addCustomer(Customer customer);
}
