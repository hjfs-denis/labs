package example.Repository;

import java.util.ArrayList;
import java.util.List;

import example.Modal.Product;

public class sqlRepository implements ProductRepository {
	


	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		
		Product p = new Product();
		p.setProduct_id("B1");
		p.setProduct_name("Angular");
		
		products.add(p);
		return products;
	}
	

}
