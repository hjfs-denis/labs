package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
public class Customer {
	
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	@Column(name = "customer_name", nullable = true, length = 30)
	private String custName;
	@Column(name = "gender")
	private String custGender;
	
	public Customer() {
		
	}
	
	public void setCustId(int id) {
		this.custId = id;
	}
	
	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custGender=" + custGender + "]";
	}
	
	

}
