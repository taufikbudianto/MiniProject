package com.arrizaqu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrizaqu.crud.entity.Employee;
import com.arrizaqu.crud.repository.EmployeeDao;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeedao;
	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		List<Employee> employees =employeedao.findAll();
		return employees;
	}
	
	

}
