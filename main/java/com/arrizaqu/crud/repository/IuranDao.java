package com.arrizaqu.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arrizaqu.crud.entity.Iuran;

public interface IuranDao extends JpaRepository<Iuran, Integer>{
	
	@Query("Select b.jumlah from Iuran b where b.Id =3")
	Double getDenda();
	
	


	

}
