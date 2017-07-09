package com.arrizaqu.crud.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrizaqu.crud.entity.Blog;
import com.arrizaqu.crud.entity.Item;
import com.arrizaqu.crud.entity.Role;
import com.arrizaqu.crud.entity.User;
import com.arrizaqu.crud.repository.BlogRepository;
import com.arrizaqu.crud.repository.ItemRepository;
import com.arrizaqu.crud.repository.RoleRepository;
import com.arrizaqu.crud.repository.UserRepository;

@Service
@Transactional
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void init(){
		/*
		// add data role
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		// add user
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<>();
		roles.add(roleUser);
		roles.add(roleAdmin);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		// add blog
		Blog myblog = new Blog();
		myblog.setName("arrizaqu");
		myblog.setUrl("github.com/arrizaqu");
		myblog.setUser(userAdmin);
		blogRepository.save(myblog);
		
		//add item 
		Item item1 = new Item();
		item1.setBlog(myblog);
		item1.setTitle("first");
		item1.setLink("github.com/arrizaqu");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setBlog(myblog);
		item2.setTitle("second");
		item2.setLink("github.com/arrizaqu");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);
		*/
	}
}
