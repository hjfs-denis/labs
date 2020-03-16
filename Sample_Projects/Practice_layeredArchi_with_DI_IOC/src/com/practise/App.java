package com.practise;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practise.Modal.Product;
import com.practise.Service.ProductService;
import com.practise.Service.ProductServiceImpl;

public class App {
	
	public static void main(String[] args) {
		
		//ProductService ps = new ProductServiceImpl();
		ProductService ps;
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		
		ps = ac.getBean("service",ProductService.class);
		
		ps.getProducts().forEach(System.out::println);
	
		
	}
}
