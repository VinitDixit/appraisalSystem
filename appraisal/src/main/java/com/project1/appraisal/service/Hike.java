package com.project1.appraisal.service;

import com.project1.appraisal.entity.AppraisalDetails;
import com.project1.appraisal.entity.EmployeeDetails;

public interface Hike {
	Float calculateHike(AppraisalDetails appraisalDetails,EmployeeDetails employeeDetails);
}
