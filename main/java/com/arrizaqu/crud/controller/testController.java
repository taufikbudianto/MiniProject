package com.arrizaqu.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arrizaqu.crud.entity.User;


@Controller
public class testController {

	@RequestMapping(value ="/ajax/{noref}",produces = "application/json")
	public @ResponseBody String index(@PathVariable(value="noref") String noref, Model model){
		
		ObjectMapper mapper = new ObjectMapper();
		//jika diperlukan untuk fileter
		//String data = noref;
		
		// example jika menghasilkan data single
		List<User> data = new ArrayList();
		User user = new User();
		user.setName("arrizaqu");
		user.setEmail("example@xml.com");
		user.setPassword("fasdfasdf");
		
		// contoh jika menghasilkan data lebih daripada satu
		String myreturn = null;
		try{
			//untuk data yang menghasilkan single.
			myreturn = mapper.writeValueAsString(user);
			
			//untuk data yang menghasiilkan banyak.
			/*
			List<User> ct= new ArrayList<>();
			User users1 = new User();
			users1.setName("arrizaqu");
			users1.setEmail("example@xml1.com");
			users1.setPassword("fasdfasdf");
			
			User users2 = new User();
			users2.setName("arrizaqu2");
			users2.setEmail("example@xml2.com");
			users2.setPassword("fasdfasdf");
			
			User users3 = new User();
			users3.setName("arrizaqu3");
			users3.setEmail("example@xml3.com");
			users3.setPassword("fasdfasdf");
			
			ct.add(users1);
			ct.add(users2);
			ct.add(users3);
			
			myreturn = mapper.writeValueAsString(ct);
			*/
		}catch(Exception e){}
		
		return   myreturn;
	}
}
