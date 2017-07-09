package com.arrizaqu.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
