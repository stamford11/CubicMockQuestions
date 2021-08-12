package com.Employee.service;

import java.util.List;

import com.Employee.entity.EmployeeEntity;

public interface ServiceClass {

	List<EmployeeEntity> showAllEmpl();

	void addEmp(EmployeeEntity emp);

	List<EmployeeEntity> filterByGender(String gender);

}
