package com.project1.appraisal.service.transformer;

import org.springframework.stereotype.Component;

import com.project1.appraisal.entity.AppraisalDetails;
import com.project1.appraisal.models.Appraisal;

@Component
public class AppraisalDetailsTransformer implements Transformer<AppraisalDetails,Appraisal>{

	@Override
	public AppraisalDetails transformEntity(Appraisal appraisal) {
		AppraisalDetails appraisalDetails= new AppraisalDetails();
		appraisalDetails.setRating(appraisal.getRating());
		appraisalDetails.setComment(appraisal.getComment());
		appraisalDetails.setAppraisalYear(appraisal.getAppraisalYear());
		appraisalDetails.setBonus(appraisal.getBonus());
		appraisalDetails.setDecisionForPipOrTraining(appraisal.getDecisionForPipOrTraining());
		appraisalDetails.setPipFlag(appraisal.getPipFlag());
		appraisalDetails.setTrainingRequired(appraisal.getTrainingRequired());
		return appraisalDetails;
	}

	@Override
	public Appraisal transformTO(AppraisalDetails appraisalDetails) {
		Appraisal appraisal=new Appraisal();
		appraisal.setComment(appraisalDetails.getComment());
		appraisal.setHikePercent(appraisalDetails.getHikePercent());
		appraisal.setRating(appraisalDetails.getRating());
		appraisal.setEmployeeID(appraisalDetails.getEmployeeDetails().getEmployeeId());
		appraisal.setAppraisalYear(appraisalDetails.getAppraisalYear());
		appraisal.setBonus(appraisalDetails.getBonus());
		appraisal.setDecisionForPipOrTraining(appraisalDetails.getDecisionForPipOrTraining());
		appraisal.setPipFlag(appraisalDetails.getPipFlag());
		appraisal.setTrainingRequired(appraisalDetails.getTrainingRequired());
		appraisal.setApplicableFrom(appraisalDetails.getApplicableFrom());
		return appraisal;
	}

}
