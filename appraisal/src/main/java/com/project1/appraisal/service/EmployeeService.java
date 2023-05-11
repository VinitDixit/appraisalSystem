package com.project1.appraisal.service;

import com.project1.appraisal.models.Employee;

public interface EmployeeService {

	public Employee registerEmployee(Employee employee);
	
	public Employee getEmployee(Integer id);
}
