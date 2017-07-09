package com.arrizaqu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrizaqu.crud.entity.BrwDetail;
import com.arrizaqu.crud.entity.HeaderPinjaman;
import com.arrizaqu.crud.repository.BRWDetailDao;
import com.arrizaqu.crud.repository.HeaderPinjamDao;

@Service
@Transactional
public class PinjamanService {
	@Autowired
	private HeaderPinjamDao pinjamanDao;
	
	@Autowired
	private BRWDetailDao brwdetails;
	
	public List<HeaderPinjaman> getAllDataPinjam (){
		
		return pinjamanDao.findAll();
		
	}
	public HeaderPinjaman findOneById(int id){
		
		return pinjamanDao.findOne(id);
		
	}
	public List<BrwDetail> findDetailByBrwheader(int id) {
		// TODO Auto-generated method stub
		HeaderPinjaman headerPin = findOneById(id);
		List<BrwDetail> detailss = brwdetails.findDetailByBrwheader(headerPin);
		
		return detailss;
	}
	
	
}
