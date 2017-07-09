package com.arrizaqu.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.BrwDetail;
import com.arrizaqu.crud.entity.HeaderPinjaman;

public interface HeaderPinjamDao extends JpaRepository<HeaderPinjaman, Integer>{

	
}
