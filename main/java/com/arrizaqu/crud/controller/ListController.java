package com.arrizaqu.crud.controller;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arrizaqu.crud.entity.BrwDetail;
import com.arrizaqu.crud.entity.HeaderPinjaman;
import com.arrizaqu.crud.service.PinjamanService;

@Controller
public class ListController {
	@Autowired
	private PinjamanService pinjamanServ;
	
	@RequestMapping("/ListPinjaman")
	public String Index (Model model){
		List<HeaderPinjaman> pinjam = pinjamanServ.getAllDataPinjam();
		System.out.println(pinjam);
		model.addAttribute("listData",pinjam);
		return "view-listPinjam";
		}
		@RequestMapping(value="/ListPinjaman/{ID}", method=RequestMethod.GET)
	public @ResponseBody String index(@PathVariable(value="ID") int ID, Model model){
		System.out.println("iD"+ID);
		List<BrwDetail> data = pinjamanServ.findDetailByBrwheader(ID);
		System.out.println("data  =" + data);
	
		 try {
		      	ObjectMapper mapper = new ObjectMapper();
		      	return mapper.writeValueAsString(data);
			  } catch (Exception e) {
					e.printStackTrace();
				}
		      return null;
			}

}
