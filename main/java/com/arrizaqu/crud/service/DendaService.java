package com.arrizaqu.crud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.arrizaqu.crud.repository.IuranDao;
import com.arrizaqu.crud.repository.ReturnHeaderDao;

@Service
@Transactional
public class DendaService {
	
@Autowired
private IuranDao iuranDao;

@Autowired
private ReturnHeaderDao rethead;


public Double getDenda() {
	// TODO Auto-generated method stub

	Double dendaa = iuranDao.getDenda();
	return 5000.0;
	}

}
