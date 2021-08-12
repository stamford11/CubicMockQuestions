package com.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.EmployeeEntity;
import com.Employee.repo.EmplRepo;

@Service
public  class ServiceImpl implements ServiceClass {
	
	@Autowired
	EmplRepo repo;

	@Override
	public List<EmployeeEntity> showAllEmpl() {
		List<EmployeeEntity> empl = repo.findAll();
		return empl;
	}

	@Override
	public void addEmp(EmployeeEntity emp) {
		repo.save(emp);
	}

	@Override
	public List<EmployeeEntity> filterByGender(String gender) {
		List<EmployeeEntity> empl = repo.findByGender(gender);
		return empl;
	}

}
