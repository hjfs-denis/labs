package com.practise.Modal;

public class Product {
	
	private String course;
	private String books;
	
	public Product() {

	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBooks() {
		return books;
	}

	public void setBooks(String books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Product [course=" + course + ", books=" + books + "]";
	}
	
	

}
