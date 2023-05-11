package com.project1.appraisal.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.appraisal.entity.AppraisalDetails;
import com.project1.appraisal.entity.EmployeeDetails;
import com.project1.appraisal.models.Appraisal;
import com.project1.appraisal.repository.AppraisalDetailsRepository;
import com.project1.appraisal.repository.EmployeeDetailsRepository;
import com.project1.appraisal.service.transformer.AppraisalDetailsTransformer;

@Service
public class AppraisalServiceImpl implements AppraisalService {
	@Autowired
	AppraisalDetailsRepository appraisalDetailsRepository;
	@Autowired
	AppraisalDetailsTransformer appraisalDetailsTransformer;
	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;

	@Override
	public Appraisal provideAppraisal(Appraisal appraisal) {
		AppraisalDetails appraisalDetails = appraisalDetailsTransformer.transformEntity(appraisal);
		EmployeeDetails employeeDetails = employeeDetailsRepository.getReferenceById(appraisal.getEmployeeID());
		appraisalDetails.setEmployeeDetails(employeeDetails);
		// apply business logic
		populateAdditionalAppraisalDetails(appraisalDetails, employeeDetails);

		AppraisalDetails savedEntity = appraisalDetailsRepository.save(appraisalDetails);
		return appraisalDetailsTransformer.transformTO(savedEntity);
	}

	void populateAdditionalAppraisalDetails(AppraisalDetails appraisalDetails, EmployeeDetails employeeDetails) {

		Integer rating = appraisalDetails.getRating();
		Float tenure = employeeDetails.getTenure();
		Character servingNoticePeriod = employeeDetails.getServingNoticePeriod();
		Float hikePercent = 0f;
		/*
		 * appraisalDetails.setPipFlag("N"); appraisalDetails.setTrainingRequired("N");
		 */

		if (tenure < 1 || servingNoticePeriod.toString().equalsIgnoreCase("Y")) {
			if (rating == 2 || rating == 1) {
				appraisalDetails.setTrainingRequired("Y");
			}
		} else {
			if (rating == 5) {
				hikePercent = 10.0f;
			} else if (rating == 4) {
				hikePercent = 7.0f;
			} else if (rating == 3) {
				hikePercent = 5.0f;
			} else if (rating == 2 || rating == 1) {
				hikePercent = 0.0f;
				if (appraisalDetails.getDecisionForPipOrTraining().equalsIgnoreCase("PIP")) {
					appraisalDetails.setPipFlag("Y");
				} else {
					appraisalDetails.setTrainingRequired("Y");
				}
			}
		}
		appraisalDetails.setHikePercent(hikePercent);
		// set new hike applicable from date
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		appraisalDetails.setApplicableFrom(cal.getTime());

	}

	@Override
	public List<Appraisal> getAllAppraisals(Integer employeeId) {
		List<AppraisalDetails> appraisalDetailsList = appraisalDetailsRepository.findAllByEmployeeId(employeeId);
		List<Appraisal> appraisalList = new ArrayList<>();
		appraisalDetailsList.forEach(details -> {
			Appraisal transformTO = appraisalDetailsTransformer.transformTO(details);
			appraisalList.add(transformTO);
		});

		return appraisalList;
	}
}
