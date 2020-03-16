package com.demo.service;

import java.util.List;

import com.demo.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	void addEmployee(Employee employee);
	
	void deleteEmployee();
	
	void deleteEmpById(int id);
	
	void updateEmployee(Employee employee);
}
