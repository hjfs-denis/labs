package com.practise.Service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practise.Modal.Product;
import com.practise.Repository.OracleRepository;
import com.practise.Repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
//	ProductRepository pr = new OracleRepository();
	ProductRepository ps;
	
	public ProductServiceImpl(OracleRepository dbcon) {
		this.ps = dbcon;
	}
	
	public List<Product> getProducts() {
				
//		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
//		ps = ac.getBean("dbcon",ProductRepository.class);
		
		return ps.getProducts();		
	}
}
