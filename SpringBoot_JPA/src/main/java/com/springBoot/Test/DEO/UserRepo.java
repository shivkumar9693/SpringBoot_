package com.springBoot.Test.DEO;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.Test.Entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
