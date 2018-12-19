package com.akhil.springlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.springlearning.entity.Employee;
import com.akhil.springlearning.repository.EmployeeRepository;

@Service
public class EmployeeService
{

	@Autowired
	public EmployeeRepository repository;
	
	public Iterable<Employee> getAllEmployees()
	{
		return repository.findAll();
	}
	
	public List<Employee> getEmployeeByName(String name)
	{
		return repository.findByEmployeeName(name);
	}
}
