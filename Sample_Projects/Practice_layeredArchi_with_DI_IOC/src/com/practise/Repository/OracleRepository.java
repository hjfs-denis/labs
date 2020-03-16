package com.practise.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.practise.Modal.Product;

public class OracleRepository implements ProductRepository {

	@Override
	public List<Product> getProducts() {
		System.out.println("In DB");
		List<Product> list = new ArrayList<>();		
		
//		product.setCourse("Java8");
//		product.setBooks("DENIS");		
//		list.add(product);		
//		//System.out.println(list.get(0).toString());		
//		return list;
		
		try {
			System.out.println("In DB");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "oracle");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select username from register");
			
			while(rs.next()) {
				Product product = new Product();
				String uname = rs.getString("username");
				product.setCourse("Java8");
				product.setBooks(uname);
				list.add(product);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("**************");
//		list.forEach(System.out::println);
//		System.out.println("**************");
		return list;
	}
	
}
