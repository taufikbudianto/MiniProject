package com.arrizaqu.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arrizaqu.crud.entity.Anggota;
import com.arrizaqu.crud.entity.ReturnHeader;


public interface ReturnDao extends JpaRepository<ReturnHeader, Integer> {


	
	
	@Query("SELECT b FROM ReturnHeader b WHERE b.SudahDibayar = 0")
	List<ReturnHeader> findAllData(@Param("SudahDibayar") boolean SudahDibayar);
	
	
	@Query("Select count(b) from ReturnHeader b where b.SudahDibayar = 0 ")
	int getCountAll();

	@Modifying(clearAutomatically =true)
	@Query ("update ReturnHeader b set b.SudahDibayar= :SudahDibayar where b.anggota=:anggota")
	void updateReturn(@Param("anggota") Anggota anggota, @Param ("SudahDibayar") boolean SudahDibayar);



/*
	void update(boolean denda, boolean sudahDibayar);*/
}
