package com.project1.appraisal.models;

public class Employee {
	Integer id;
    String fName;
    String lName;
    String designation;
    Double salary;
    Float tenure;
    Character servingNoticePeriod;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
