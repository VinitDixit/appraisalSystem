package com.project1.appraisal.entity;

import java.util.Date;

import org.hibernate.annotations.Fetch;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="APPRAISAL_DETAILS")
public class AppraisalDetails {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="EMPLOYEE_ID")
	EmployeeDetails employeeDetails;
	
	@Column(name="RATING")
	Integer rating;
	
	@Column(name="HIKE")
    Float hikePercent;
	
	@Column(name="BONUS")
	Double bonus;
	
	@Column(name="HIKE_FROM")
	@Temporal(TemporalType.DATE)
	Date applicableFrom;
	
	@Column(name="COMMENT")
    String comment;
	
	@Column(name="YEAR_OF_APPRAISAL")
	Integer appraisalYear;
	
	@Column(name="TRAINING_REQUIRED")
	String trainingRequired;
	
	@Column(name="PIP_FLAG")
	String pipFlag;
	
	@Transient
	String decisionForPipOrTraining;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}


	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Float getHikePercent() {
		return hikePercent;
	}

	public void setHikePercent(Float hikePercent) {
		this.hikePercent = hikePercent;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getAppraisalYear() {
		return appraisalYear;
	}

	public void setAppraisalYear(Integer appraisalYear) {
		this.appraisalYear = appraisalYear;
	}

	
	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	
	public Date getApplicableFrom() {
		return applicableFrom;
	}

	public void setApplicableFrom(Date applicableFrom) {
		this.applicableFrom = applicableFrom;
	}

	public String getTrainingRequired() {
		return trainingRequired;
	}

	public void setTrainingRequired(String trainingRequired) {
		this.trainingRequired = trainingRequired;
	}

	public String getPipFlag() {
		return pipFlag;
	}

	public void setPipFlag(String pipFlag) {
		this.pipFlag = pipFlag;
	}

	public String getDecisionForPipOrTraining() {
		return decisionForPipOrTraining;
	}

	public void setDecisionForPipOrTraining(String decisionForPipOrTraining) {
		this.decisionForPipOrTraining = decisionForPipOrTraining;
	}
      
	
    
}
