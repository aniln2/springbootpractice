package com.springbootpractice.examples.employeemanagement.service;

import org.springframework.stereotype.Service;

import com.springbootpractice.examples.employeemanagement.data.Employee;

@Service
public interface EmployeeService {
	
	public Employee getEmployeeById(String id);

	public Employee saveEmployees(Employee employee);

}
