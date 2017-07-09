package com.arrizaqu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arrizaqu.crud.entity.Employee;
import com.arrizaqu.crud.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeserv;

	@RequestMapping
	public String index(Model model){
		List<Employee> employee = employeeserv.getAllEmployee();
		
		model.addAttribute("employee", employee);
		for (Employee temp : employee){
			System.out.println(" "+temp.getName());
			System.out.println(""+temp.getCity());
			
		}
			
		
		return "view-employee";//lari ke web general
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public @ResponseBody String edit(){
		return "Hello world";
	}

}
