package com.project1.appraisal.service;

import java.util.List;

import com.project1.appraisal.models.Appraisal;

public interface AppraisalService {
	Appraisal provideAppraisal(Appraisal appraisal);

	List<Appraisal> getAllAppraisals(Integer employeeId);
}
