package com.employee.main.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.main.model.Employee;
import com.employee.main.service.CompareByName;
import com.employee.main.service.EmployeeService;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
    EmployeeService employeeService;
	
	@GetMapping("/employees")
    public List<Employee> getAllPersons() {
        return employeeService.getAllEmployees();
    }
	
	@GetMapping("/sortedbyname")
	public List<Employee> getSortedListByName() {
		List list=employeeService.getAllEmployees();
		Collections.sort(list,new CompareByName() );
		System.out.println(list);
        return list;
    }
	

}
