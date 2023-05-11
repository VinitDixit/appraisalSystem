package com.project1.appraisal.service.transformer;

import org.springframework.stereotype.Component;

import com.project1.appraisal.entity.EmployeeDetails;
import com.project1.appraisal.models.Employee;

@Component
public class EmployeeDetailsTransformer implements Transformer<EmployeeDetails, Employee>{

	@Override
	public EmployeeDetails transformEntity(Employee employee) {
		EmployeeDetails employeeDetails= new EmployeeDetails();
		//employeeDetails.setEmployeeId(employee.getId());
		employeeDetails.setfName(employee.getfName());
		employeeDetails.setlName(employee.getlName());
		employeeDetails.setSalary(employee.getSalary());
		employeeDetails.setTenure(employee.getTenure());
		employeeDetails.setServingNoticePeriod(employee.getServingNoticePeriod());
		employeeDetails.setDesignation(employee.getDesignation());
		return employeeDetails;
	}

	@Override
	public Employee transformTO(EmployeeDetails employeeDetails) {
		Employee employee= new Employee();
		employee.setId(employeeDetails.getEmployeeId());
		employee.setfName(employeeDetails.getfName());
		employee.setlName(employeeDetails.getlName());
		employee.setSalary(employeeDetails.getSalary());
		employee.setTenure(employeeDetails.getTenure());
		employee.setServingNoticePeriod(employeeDetails.getServingNoticePeriod());
		employee.setDesignation(employeeDetails.getDesignation());
		return employee;
	}

}
