package com.project1.appraisal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project1.appraisal.entity.AppraisalDetails;

@Repository
public interface AppraisalDetailsRepository extends JpaRepository<AppraisalDetails, Integer>{
	
	@Query(value="from AppraisalDetails a where a.employeeDetails.employeeId=:employeeID")
	List<AppraisalDetails> findAllByEmployeeId(@Param("employeeID")Integer employeeID);

}
