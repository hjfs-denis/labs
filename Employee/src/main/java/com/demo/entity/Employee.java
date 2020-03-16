package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;
	@Column(name = "emp_name", nullable = true, length = 50)
	private String empName;
	@Column(name = "emp_gender", nullable = false, length = 10)
	private String empGender;	
	@Column(name="email", nullable = false)
	private String empEmail;
	@Column(name="password", nullable = false)
	private String empPassword;
	
	public Employee() {
		
	}
	
	public String getEmpGender() {
		return empGender;
	}
	
	public String getEmpName() {
		return empName;
	}

	public int getId() {
		return id;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empGender=" + empGender + ", empEmail=" + empEmail
				+ ", empPassword=" + empPassword + "]";
	}
	
	
}
