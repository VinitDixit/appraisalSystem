package com.project1.appraisal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.appraisal.models.Employee;
import com.project1.appraisal.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/register")
	public ResponseEntity<Employee> createEmployee(@RequestBody()Employee employee) {
		Employee savedEmployee = employeeService.registerEmployee(employee);
		ResponseEntity<Employee>response=ResponseEntity.ok(savedEmployee);
		return response;
		
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("employeeId")Integer employeeId){
		Employee employee = employeeService.getEmployee(employeeId);
		ResponseEntity<Employee>response=ResponseEntity.ok(employee);
		return response;
	}

}
