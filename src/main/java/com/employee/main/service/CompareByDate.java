package com.employee.main.service;

import java.util.Comparator;

import com.employee.main.model.Employee;

public class CompareByDate implements Comparator<Employee> {

	@Override
	public int compare(Employee a, Employee b) {
		// TODO Auto-generated method stub
		return a.getHire_date().compareTo(b.getHire_date());
	}

}
