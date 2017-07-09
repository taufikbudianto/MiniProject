package com.arrizaqu.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arrizaqu.crud.entity.ReturnDetail;
import com.arrizaqu.crud.entity.ReturnHeader;


public interface ReturnDetailDao extends JpaRepository<ReturnDetail, Integer> {
	
	
	List<ReturnDetail> findDetailByHeader(ReturnHeader returnheader);	


}
