package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.Repository.ProductRepository;
import example.service.ProductService;
import example.service.ProductServiceImpl;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//ProductService ps = new ProductServiceImpl();
		//ProductRepository  pr = ac.getBean("dbconnect",ProductRepository.class);		
		//pr.getProducts().forEach(System.out::println);
		
		ProductService ps = ac.getBean("service",ProductService.class);
		ps.getProducts().forEach(System.out::println);
	}

}
