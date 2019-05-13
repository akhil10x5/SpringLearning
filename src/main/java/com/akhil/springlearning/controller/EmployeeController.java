package com.akhil.springlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akhil.springlearning.entity.Employee;
import com.akhil.springlearning.service.EmployeeService;

@Controller
@RequestMapping(path="/employee")
public class EmployeeController
{

	@Autowired // This means to get the bean called userRepository
    			// Which is auto-generated by Spring, we will use it to handle the data
	private EmployeeService employeeService;
	
	//Request would be like : http://localhost:8080/employee/getall?page=0&size=5
	@GetMapping(path="/getall")
	public @ResponseBody Iterable<Employee> getAllEmployees(Pageable pageable)
	{
		return employeeService.getAllEmployees(pageable);
	}
	
	@GetMapping(path="/get")
	public @ResponseBody List<Employee> getEmployeeByName(@RequestParam String name)
	{
		return employeeService.getEmployeeByName(name);
	}
	
}
