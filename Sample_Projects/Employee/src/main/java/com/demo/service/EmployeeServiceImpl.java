package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		empRepo.save(employee);
		
	}

	@Override
	public void deleteEmployee() {
		empRepo.deleteAll();

	}

	@Override
	public void deleteEmpById(int id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		empRepo.saveAndFlush(employee);
		
	}
}
