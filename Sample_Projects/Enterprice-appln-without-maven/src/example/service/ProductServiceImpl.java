package example.service;

import java.util.List;

import example.Repository.MongoDBRepository;
import example.Repository.MySqlRepository;
import example.Repository.ProductRepository;
import example.modal.Product;

public class ProductServiceImpl implements ProductService {

	// Step 1 ~ Intantiate repo and expose through an interface
	
	//ProductRepository pr = new MySqlRepository();
	ProductRepository pr1 = new MongoDBRepository();
	@Override
	public List<Product> getProduct() {
		return pr1.getProducts();
	}
}
