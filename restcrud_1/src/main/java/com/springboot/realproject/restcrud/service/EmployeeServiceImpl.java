package com.springboot.realproject.restcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springboot.realproject.restcrud.dao.EmployeeRepisotory;
import com.springboot.realproject.restcrud.entity.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

	private EmployeeRepisotory empdo;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepisotory empdo) {
		//super();
		this.empdo = empdo;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empdo.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		 Optional<Employee> opt=empdo.findById(id);
		  if(opt.isPresent()) 
			  {
			  return opt.get();
			  }
		  return null;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		empdo.save(theEmployee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		empdo.deleteById(id);
		
	}

}
