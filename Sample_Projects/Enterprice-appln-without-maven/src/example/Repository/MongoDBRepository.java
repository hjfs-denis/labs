package example.Repository;

import java.util.ArrayList;
import java.util.List;

import example.modal.Product;

public class MongoDBRepository implements ProductRepository{
	public List<Product> getProducts() {
		
		List<Product> products = new ArrayList<>();
		
		Product product = new Product();
		
		product.setProductid("D1");
		product.setProductname("Angular");
		products.add(product);
		return products;
	}
}
