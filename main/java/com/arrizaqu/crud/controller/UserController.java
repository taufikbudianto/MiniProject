package com.arrizaqu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arrizaqu.crud.entity.User;
import com.arrizaqu.crud.service.UserService;

@Controller 
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public String user(Model model){
		List<User> data = userService.findAll();
		model.addAttribute("varUser",data);
		for(Object temp : data){
			User dat = (User)temp;
			System.out.println("name "+ dat.getName());
			
		}
		return "user";
	}
	
	@RequestMapping("/user/{id}")
	public String detail(Model model, @PathVariable int id){
		User data = userService.findOneByUser(id);
		model.addAttribute("user",data);
		return "detail";
	}
}
