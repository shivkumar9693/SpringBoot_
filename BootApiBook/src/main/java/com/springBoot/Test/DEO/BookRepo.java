package com.springBoot.Test.DEO;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.Test.Entity.bookEntity;

public interface BookRepo extends CrudRepository<bookEntity,Integer >{
	public bookEntity findById(int id);
}
