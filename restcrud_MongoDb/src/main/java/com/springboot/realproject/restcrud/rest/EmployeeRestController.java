package com.springboot.realproject.restcrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.realproject.restcrud.entity.Employee;
import com.springboot.realproject.restcrud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
private EmployeeService empser;

@Autowired
public EmployeeRestController(EmployeeService empser) {
	this.empser = empser;
} 

@GetMapping("/employees")
public List<Employee> findAll() {
	return empser.findAll();
}

@GetMapping("/employees/{employeeId}")
public Employee findById(@PathVariable int employeeId) {
	return empser.findById(employeeId);
}

@PostMapping("/employees")
public Employee addEmployee(@RequestBody Employee theEmployee)
{
//theEmployee.setId(0);
empser.save(theEmployee);
return theEmployee;
}

@PutMapping("/employees")
public Employee updateEmployee(@RequestBody Employee theEmployee)
{
//theEmployee.setId(0);
empser.save(theEmployee);
return theEmployee;
}

@DeleteMapping("/employees/{employeeId}")
public void deleteEmployee(@PathVariable int employeeId)
{
//theEmployee.setId(0);
empser.deleteById(employeeId);
}
}