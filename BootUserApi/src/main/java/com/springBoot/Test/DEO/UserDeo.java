package com.springBoot.Test.DEO;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.Test.Entity.User;

public interface UserDeo extends CrudRepository<User, Integer>{
	 public User findById(int id);
}
