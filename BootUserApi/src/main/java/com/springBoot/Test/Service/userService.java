package com.springBoot.Test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.Test.DEO.UserDeo;
import com.springBoot.Test.Entity.User;

@Component
public class userService {
	@Autowired
	private UserDeo deo;
	public List<User> getAllUser(){
		List<User> list=(List<User>)deo.findAll();
		return list;
		
	}
	
	public User getById(int id) {
		  User user =deo.findById(id);
		  return user;
	}
	
	public User saveUser(User user) {
		User res=deo.save(user);
		return res;
	}
	
	public User updateUser(User user,int id) {
		user.setId(id);
		User res=deo.save(user);
		return res;
	}

}
