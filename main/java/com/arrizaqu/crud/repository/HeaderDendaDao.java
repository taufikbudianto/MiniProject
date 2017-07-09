package com.arrizaqu.crud.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arrizaqu.crud.entity.HeaderDenda;

public interface HeaderDendaDao extends JpaRepository<HeaderDenda, Integer> {
	
	@Query("select b.NoRegistrasi from HeaderDenda b")
	List<String> getNoRegistrasi(Pageable pageable);
	
	

}
