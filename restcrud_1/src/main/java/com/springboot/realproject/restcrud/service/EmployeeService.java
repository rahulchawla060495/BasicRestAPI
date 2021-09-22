package com.springboot.realproject.restcrud.service;

import java.util.List;

import com.springboot.realproject.restcrud.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee theEmployee);
	public void deleteById(int id);
}
