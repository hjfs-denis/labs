package example.modal;

public class Product {
	// Step 1
	private String productid;
	private String productname;

	// Step 2
	public Product() {
		
	}

	// Step 3 (Getters & Setters)
	public String getProductid() {
		return productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", getProductid()=" + getProductid()
				+ ", getProductname()=" + getProductname() + "]";
	}


}
