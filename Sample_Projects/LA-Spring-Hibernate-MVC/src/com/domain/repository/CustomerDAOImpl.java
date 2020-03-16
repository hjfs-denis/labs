package com.domain.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("from Customer");
		List<Customer> customer = theQuery.list();
		return customer;
	}

}
