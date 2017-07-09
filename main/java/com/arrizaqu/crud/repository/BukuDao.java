package com.arrizaqu.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.Buku;

public interface BukuDao extends JpaRepository<Buku, Integer> {

}
