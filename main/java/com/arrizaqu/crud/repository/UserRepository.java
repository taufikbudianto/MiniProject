package com.arrizaqu.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arrizaqu.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
