package com.project1.appraisal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.appraisal.entity.EmployeeDetails;
import com.project1.appraisal.models.Employee;
import com.project1.appraisal.repository.EmployeeDetailsRepository;
import com.project1.appraisal.service.transformer.EmployeeDetailsTransformer;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;
	@Autowired
	EmployeeDetailsTransformer employeeDetailsTransformer;

	@Override
	public Employee registerEmployee(Employee employee) {
		EmployeeDetails employeeDetails = employeeDetailsTransformer.transformEntity(employee);			
		EmployeeDetails savedEmployee = employeeDetailsRepository.save(employeeDetails);
		return employeeDetailsTransformer.transformTO(savedEmployee);
	}

	@Override
	public Employee getEmployee(Integer id) {
		EmployeeDetails employeeDetails = employeeDetailsRepository.getReferenceById(id);
		return employeeDetailsTransformer.transformTO(employeeDetails);
	}

}
