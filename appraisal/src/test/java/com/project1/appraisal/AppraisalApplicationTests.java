package com.project1.appraisal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project1.appraisal.entity.EmployeeDetails;
import com.project1.appraisal.models.Appraisal;
import com.project1.appraisal.models.Employee;
import com.project1.appraisal.repository.EmployeeDetailsRepository;
import com.project1.appraisal.service.AppraisalService;
import com.project1.appraisal.service.EmployeeService;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
class AppraisalApplicationTests {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	AppraisalService appraisalService;
	@Autowired 
	EmployeeDetailsRepository employeeDetailsRepository;

	@Test
	public void registerEmployeeTest() {
		Employee employee = createTestEmployee();

		Employee registerEmployee = employeeService.registerEmployee(employee);
		assertNotNull(registerEmployee.getId());
	}

	@Test
	public void provideAppraisal() {
		EmployeeDetails empEntity = createTestEmployeeDetails();
		employeeDetailsRepository.save(empEntity);

		Appraisal appraisal = createTestAppraisal(empEntity.getEmployeeId());
		Appraisal providedAppraisal = appraisalService.provideAppraisal(appraisal);
		assertNotNull(providedAppraisal);
	}
	
	private Employee createTestEmployee() {
		Employee employee = new Employee();
		employee.setfName("Foo");
		employee.setlName("BAR");
		employee.setSalary(30000.0);
		employee.setDesignation("Developer");
		employee.setTenure(3f);
		employee.setServingNoticePeriod('N');
		return employee;
	}

	
	private Appraisal createTestAppraisal(Integer empId) {
		Appraisal appraisal= new Appraisal();
		appraisal.setEmployeeID(empId);
		appraisal.setRating(5);
		appraisal.setAppraisalYear(2022);
		appraisal.setComment("Appraisal Comment");
		appraisal.setAppraisalYear(2023);
		return appraisal;
	}
	

	private EmployeeDetails createTestEmployeeDetails() {
		EmployeeDetails empEntity=new EmployeeDetails();
		empEntity.setEmployeeId(1);
		empEntity.setfName("Foo");
		empEntity.setlName("BAR");
		empEntity.setSalary(30000.0);	
		empEntity.setDesignation("Developer");
		empEntity.setTenure(3f);
		empEntity.setServingNoticePeriod('N');
		return empEntity;
	}
}
