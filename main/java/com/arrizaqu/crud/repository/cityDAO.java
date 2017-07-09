package com.arrizaqu.crud.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.City;

public interface cityDAO extends JpaRepository<City, Integer>{ // menunjukan kelas yang berhubangan T

}
