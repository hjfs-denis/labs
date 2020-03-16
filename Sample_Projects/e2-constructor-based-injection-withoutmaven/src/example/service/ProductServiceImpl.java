package example.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.Modal.Product;
import example.Repository.ProductRepository;
import example.Repository.sqlRepository;

public class ProductServiceImpl implements ProductService{
	
	ProductRepository productRepository;
	
	//pr.getProduct().forEach("System.out::println");
	
	public ProductServiceImpl(ProductRepository dbconnect) {
		System.out.println(dbconnect);
		System.out.println(
				"The productRepository is injected into ProductServiceImpl constructor.");

		this.productRepository = dbconnect;
	}
		
	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}
