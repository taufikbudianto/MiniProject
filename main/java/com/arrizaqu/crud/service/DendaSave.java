package com.arrizaqu.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrizaqu.crud.entity.HeaderDenda;
import com.arrizaqu.crud.repository.HeaderDendaDao;

@Service
@Transactional
public class DendaSave {
	@Autowired
	private HeaderDendaDao headerDendaDao;

	
	

}
