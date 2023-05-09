package com.project1.appraisal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.appraisal.models.Appraisal;
import com.project1.appraisal.service.AppraisalService;

import jakarta.ws.rs.PathParam;

@RestController
@RequestMapping("/appraisal")
public class AppraisalController {

	@Autowired
	AppraisalService appraisalService;

	@PostMapping("/provideAppraisal")
	public ResponseEntity<Appraisal> provideAppraisal(@RequestBody() Appraisal appraisal) {
		Appraisal savedAppraisal = appraisalService.provideAppraisal(appraisal);
		ResponseEntity<Appraisal> response = ResponseEntity.ok(savedAppraisal);
		return response;

	}
	
	@GetMapping("/getAllAppraisalForEmployee")
	public ResponseEntity<List<Appraisal>> getAllAppraisals(@PathParam("employeeId")Integer employeeId){
		List<Appraisal> allAppraisals = appraisalService.getAllAppraisals(employeeId);
		ResponseEntity<List<Appraisal>> response=ResponseEntity.ok(allAppraisals);
		return response;
	}

}
