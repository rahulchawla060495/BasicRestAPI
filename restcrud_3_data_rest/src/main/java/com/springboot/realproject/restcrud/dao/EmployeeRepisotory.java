package com.springboot.realproject.restcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.realproject.restcrud.entity.Employee;

public interface EmployeeRepisotory extends JpaRepository<Employee, Integer> {

}
