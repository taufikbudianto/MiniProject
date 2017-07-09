package com.arrizaqu.crud.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrizaqu.crud.entity.Anggota;
import com.arrizaqu.crud.entity.DeataiDenda;
import com.arrizaqu.crud.entity.HeaderDenda;
import com.arrizaqu.crud.entity.ReturnDetail;
import com.arrizaqu.crud.entity.ReturnHeader;
import com.arrizaqu.crud.repository.AnggotaDao;
import com.arrizaqu.crud.repository.DendaDetailDao;
import com.arrizaqu.crud.repository.HeaderDendaDao;
import com.arrizaqu.crud.repository.ReturnDetailDao;
import com.arrizaqu.crud.repository.ReturnDao;

@Service
@Transactional
public class ReturnService {
	
	@Autowired
	private ReturnDao returnDao;
	@Autowired
	private AnggotaDao anggotadao;
	
	@Autowired
	private ReturnDetailDao detaildao;
	
	@Autowired
	private HeaderDendaDao headerDendaDao;
	
	@Autowired
	private DendaDetailDao dendaDetailDao;
	
	@Autowired
	private HeaderDendaDao headerdao;
	

	public List<ReturnHeader> findAllData(boolean SudahDibayar){
		//SudahDibayar=false;
		List<ReturnHeader> header =returnDao.findAllData(SudahDibayar);
		return header;
	
	}
	
		public ReturnHeader findOneById(int id){
		return returnDao.findOne(id);
		
	}
		public List<ReturnDetail> findDetailByHeader(int id){
		ReturnHeader header =findOneById(id);
		List<ReturnDetail> detail=detaildao.findDetailByHeader(header);
		System.out.println("abc"+detail);
		return detail;
		
	}
		public void save(Anggota a,HeaderDenda header){
			header.setAnggota(a);
			header.setCreatedBy(1);
			header.setDenda(true);
			headerDendaDao.save(header);
			
			List<DeataiDenda> detail = header.getDetails();
			for(DeataiDenda abc : detail ){
				DeataiDenda details =new DeataiDenda();
				details.setHeader(header);
				details.setModifiedBy(1);
				details.setIDBuku(abc.getIDBuku());
				details.setJumlah(abc.getJumlah());
				dendaDetailDao.save(details);
			}
			
			
		}
		public Anggota findOne(int id) {
			// TODO Auto-generated method stub
			return anggotadao.findOne(id);
		}
		int dataDenda=0;
		public int getCountAll() {
			// TODO Auto-generated method stub
			dataDenda = returnDao.getCountAll();
			
			return dataDenda;
		}

		public void update(Anggota anggota, ReturnHeader rethead) {
			// TODO Auto-generated method stub
			 rethead.setAnggota(anggota);
			 rethead.setDenda(true);
			 boolean SudahDibayar = rethead.setSudahDibayar(true);
			 
			 returnDao.updateReturn(anggota,SudahDibayar);
		}
		public String getNoRegistrasi(){
			PageRequest request = new PageRequest(0,1,Sort.Direction.DESC,"NoRegistrasi");
			String noreg = new String();
			noreg=null;
			String auto = new String();
			auto=null;
			List<String> noregs = headerdao.getNoRegistrasi(request);
			if(noregs.size()==0){
				noreg=null;
			}else{
				noreg =noregs.get(0);
			}
			SimpleDateFormat sdf = new SimpleDateFormat("YYYYMM");
			Calendar cl = Calendar.getInstance();
			String tgl = sdf.format(cl.getTime());
			if (noreg==null){
				auto = "PMT" + tgl + "0001";
			}
			else{
				noreg = noreg.substring(11);
				int temp = Integer.parseInt(noreg) + 1;
				String no_auto = String.valueOf(temp);
				int h = no_auto.length();
				switch (h) {
				case 1:
					auto = "PMT" + tgl + "000" + no_auto;
					break;
				case 2:
					auto = "PMT" + tgl + "00" + no_auto;
					break;
				case 3:
					auto = "PMT" + tgl + "0" + no_auto;
					break;
				case 4:
					auto = "PMT" + tgl + no_auto;	
			}
		} 
		return auto;
			
	}

		public int getBiaya() {
			// TODO Auto-generated method stub
			
			return 0;
		}
}
