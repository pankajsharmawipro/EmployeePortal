package com.employee.main.service;

import java.util.Comparator;

import com.employee.main.model.Employee;

public class CompareBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee a, Employee b) {
		// TODO Auto-generated method stub
		return a.getSalary()-b.getSalary();
	}

}
