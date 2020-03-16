package com.domain.entity;


public class Customer {
	
	private String userId, userName, email;
	
	public Customer() {
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserId(String uid) {
		this.userId = uid;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "Model [ Username : " + userName + " ]";
	}
	

}
