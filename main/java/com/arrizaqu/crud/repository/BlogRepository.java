package com.arrizaqu.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.Blog;
import com.arrizaqu.crud.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findBlogByUser(User user);


}
