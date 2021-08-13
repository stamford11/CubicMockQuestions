package com.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Employee.entity.EmployeeEntity;
import com.Employee.service.ServiceClass;

@RestController
public class Controller {
	
	@Autowired
	ServiceClass emplService;


	@GetMapping("/emp")
	public List<EmployeeEntity> getAllEmpl() {
		List<EmployeeEntity> empl = emplService.showAllEmpl();
		return empl;

	}
	@GetMapping("/emp/{gender}")
	public List<EmployeeEntity> getEmpl(@PathVariable String gender) {
		List<EmployeeEntity> empl = emplService.filterByGender(gender);

		return empl;
	}

	@PostMapping("/emp")
	public void postEmpl(@RequestBody EmployeeEntity emp) {
		emplService.addEmp(emp);
		

	}

}
