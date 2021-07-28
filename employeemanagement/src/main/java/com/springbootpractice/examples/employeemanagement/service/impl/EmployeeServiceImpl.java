package com.springbootpractice.examples.employeemanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootpractice.examples.employeemanagement.dao.EmployeeRepository;
import com.springbootpractice.examples.employeemanagement.data.Employee;
import com.springbootpractice.examples.employeemanagement.service.EmployeeService;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee saveEmployees(Employee employee) {
		return employeeRepository.save(employee);
	}

}
