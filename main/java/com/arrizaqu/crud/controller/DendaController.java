package com.arrizaqu.crud.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.arrizaqu.crud.entity.Anggota;
import com.arrizaqu.crud.entity.DeataiDenda;
import com.arrizaqu.crud.entity.HeaderDenda;
import com.arrizaqu.crud.entity.ReturnDetail;
import com.arrizaqu.crud.entity.ReturnHeader;
import com.arrizaqu.crud.service.DendaService;
import com.arrizaqu.crud.service.ReturnService;

@Controller
public class DendaController {
	
	@Autowired
	private ReturnService returnService;
	@Autowired
	private DendaService dendaserv;
	
	@RequestMapping("/DendaAnggota")
	public String index (Model model, boolean SudahDibayar){

		List<ReturnHeader> header= returnService.findAllData(SudahDibayar);
		//System.out.println("test="+header.get(1));
		int data1= returnService.getCountAll();
		Double data3=dendaserv.getDenda();
		System.out.println("denda="+data3);
		model.addAttribute("count", data1);	
		model.addAttribute("data",header);
		return "view-denda";
	}

	@RequestMapping(value="/DendaAnggota/{ID}", method=RequestMethod.GET)
	public @ResponseBody String index(@PathVariable(value="ID") int ID, Model model){
	System.out.println(ID);
	
	List<ReturnDetail> data = returnService.findDetailByHeader(ID);
	System.out.println("adafaf"+data.get(0));
	System.out.println("ahsgaj"+data);

	  try {
      	ObjectMapper mapper = new ObjectMapper();
      	return mapper.writeValueAsString(data);
	  } catch (Exception e) {
			e.printStackTrace();
		}
      return null;
	}
	

	@RequestMapping(value = "/DendaAnggota", method = RequestMethod.POST)
    public @ResponseBody String saveDenda(Model model, HttpServletRequest req ) {
		HeaderDenda header = new HeaderDenda();
		ReturnHeader rethead=new ReturnHeader();
		Anggota anggota =new Anggota();
		String noRegistri = returnService.getNoRegistrasi();
		System.out.println(noRegistri);
		List<DeataiDenda> listDetail =new ArrayList<DeataiDenda>();
		anggota=returnService.findOne(Integer.parseInt(req.getParameter("idang")));
		//anggota.setID(Integer.parseInt(req.getParameter("idang")));
		header.setNoReferensi((req.getParameter("noref")));
		header.setNoRegistrasi(returnService.getNoRegistrasi());
		String[] buk = req.getParameterValues("buk[]");	
		System.out.println(buk);
		for(String temp: buk){
			DeataiDenda detaildenda = new DeataiDenda();
			detaildenda.setIDBuku(Integer.parseInt(temp));
			detaildenda.setJumlah(Integer.parseInt(req.getParameter("total")));
			listDetail.add(detaildenda);
			header.setDetails(listDetail);
		}
		returnService.save(anggota, header);
		returnService.update(anggota,rethead);
		String [] data = new String [1];
		data[0]=noRegistri;
	        ObjectMapper mapper = new ObjectMapper();
        String myreturn = null;
        try {
        	 myreturn = mapper.writeValueAsString(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return myreturn;
	}
}



