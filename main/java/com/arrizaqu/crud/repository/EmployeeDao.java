package com.arrizaqu.crud.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	

}
