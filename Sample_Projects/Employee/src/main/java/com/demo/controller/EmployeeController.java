package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value ="/all", method = RequestMethod.GET)
	public List<Employee> getAllUsers() {
		return empService.getAllEmployees();
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addEmployee(@RequestBody Employee employee) {
		empService.addEmployee(employee);
	}
	
	@RequestMapping(value = "/deletebyid", method = RequestMethod.GET)
	public void deleteEmployee(int id) {
		empService.deleteEmpById(id);
	}
	
	@RequestMapping(value = "/deleteall", method = RequestMethod.GET)
	public void deleteAll() {
		empService.deleteEmployee();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployee(@RequestBody Employee employee) {
		empService.updateEmployee(employee);
	}
}
