package com.kanchiswork.springbootbackend.service;

import java.util.List;

import com.kanchiswork.springbootbackend.exceptions.ResourceNotFoundException;
import com.kanchiswork.springbootbackend.model.Employee;


public interface EmployeeService {
	public List<Employee> getAllEmployee() throws ResourceNotFoundException; 
	//public List<Employee> findAllEmployee() throws ResourceNotFoundException;

}
