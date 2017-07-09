package com.arrizaqu.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.Blog;
import com.arrizaqu.crud.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findItemByBlog(Blog blog);
	

}
