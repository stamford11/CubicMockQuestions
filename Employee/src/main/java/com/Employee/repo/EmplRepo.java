package com.Employee.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.entity.EmployeeEntity;



public interface EmplRepo extends JpaRepository<EmployeeEntity, Integer> {
	List<EmployeeEntity> findByGender(String gender);

}
