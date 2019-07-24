package com.employee.main.service;

import org.springframework.data.repository.CrudRepository;

import com.employee.main.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
