package com.arrizaqu.crud.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrizaqu.crud.entity.Blog;
import com.arrizaqu.crud.entity.Item;
import com.arrizaqu.crud.entity.User;
import com.arrizaqu.crud.repository.BlogRepository;
import com.arrizaqu.crud.repository.ItemRepository;
import com.arrizaqu.crud.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findOne(int id){
		return userRepository.findOne(id);
	}

	@Transactional
	public User findOneByUser(int id) {
		// TODO Auto-generated method stub
		User user = findOne(id);
		
		// get blogs
		List<Blog> blogs = blogRepository.findBlogByUser(user);
		for(Blog blog : blogs){
			List<Item> items = itemRepository.findItemByBlog(blog);
			blog.setItems(items);
		}
		// get items
		user.setBlogs(blogs);		
		return user;
	}

	
}
