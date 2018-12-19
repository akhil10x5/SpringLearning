package com.akhil.springlearning.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.akhil.springlearning.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	List<Employee> findByEmployeeName(String name);
}
