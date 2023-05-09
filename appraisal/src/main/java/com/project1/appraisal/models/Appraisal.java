package com.project1.appraisal.models;

import java.util.Date;

import lombok.Data;

@Data
public class Appraisal {
	Integer employeeID;
	Integer rating;
	Float hikePercent;
    String comment;
    Integer appraisalYear;
    Double bonus;
    Date applicableFrom;
    String decisionForPipOrTraining;
    String trainingRequired;
    String pipFlag;
    
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
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
	
	public Date getApplicableFrom() {
		return applicableFrom;
	}
	public void setApplicableFrom(Date applicableFrom) {
		this.applicableFrom = applicableFrom;
	}
	public Double getBonus() {
		return bonus;
	}
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	public String getDecisionForPipOrTraining() {
		return decisionForPipOrTraining;
	}
	public void setDecisionForPipOrTraining(String decisionForPipOrTraining) {
		this.decisionForPipOrTraining = decisionForPipOrTraining;
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
    
    
    
}
