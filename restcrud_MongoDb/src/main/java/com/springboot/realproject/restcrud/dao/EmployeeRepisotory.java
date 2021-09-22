package com.springboot.realproject.restcrud.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.realproject.restcrud.entity.Employee;

public interface EmployeeRepisotory extends MongoRepository<Employee, Integer> {

}
