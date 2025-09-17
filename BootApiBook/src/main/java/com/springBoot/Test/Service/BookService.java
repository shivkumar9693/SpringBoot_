package com.springBoot.Test.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springBoot.Test.Entity.bookEntity;
@Component
public class BookService {
	 private static List<bookEntity>list=new ArrayList<>();
	 static {
		 list.add(new bookEntity(1,"java"));
		 list.add(new bookEntity(2,"python"));
		 list.add(new bookEntity(3,"c++"));
		 
	 }
	
	public static  List<bookEntity> getAllBooks() {
		return list;
	}
	public static bookEntity getBooksById(int id) {
		bookEntity book=new bookEntity();
		book=list.stream().filter(e->e.getBookid()==id).findFirst().get();
		return book;
	}

}
