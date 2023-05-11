package com.project1.appraisal.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPLOYEE_ID")
	private Integer employeeId;

	@Column(name = "FIRST_NAME")
	String fName;

	@Column(name = "LAST_NAME")
	String lName;

	@Column(name = "SALARY")
	Double salary;

	@Column(name = "TENURE")
	Float tenure;

	@Column(name = "SERVING_NOTICE_PERIOD")
	Character servingNoticePeriod;
	
	@Column(name="DESIGNATION")
	String designation;
	
	@OneToMany(mappedBy = "employeeDetails")
	List<AppraisalDetails> appraisalDetailsList;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Float getTenure() {
		return tenure;
	}

	public void setTenure(Float tenure) {
		this.tenure = tenure;
	}

	public Character getServingNoticePeriod() {
		return servingNoticePeriod;
	}

	public void setServingNoticePeriod(Character servingNoticePeriod) {
		this.servingNoticePeriod = servingNoticePeriod;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
