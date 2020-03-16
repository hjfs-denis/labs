package example;

import example.service.ProductService;
import example.service.ProductServiceImpl;

public class App {

	public static void main(String[] args) {
		//Step - 1 Create the service via interface
		ProductService ps = new ProductServiceImpl();
		
		// Step - 2 Fetch the Products from service iterate thru lambda
		ps.getProduct().forEach(System.out::println);
	}
}
