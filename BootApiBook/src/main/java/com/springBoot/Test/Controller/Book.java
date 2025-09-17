package com.springBoot.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Test.Entity.bookEntity;
import com.springBoot.Test.Service.BookService;

@RestController
public class Book {
	@Autowired
	private BookService bookservice;
	
//	@GetMapping("/book")
//	public  bookEntity getBook() {
////		bookEntity book=new bookEntity();
////		book.setBookid(1);
////		book.setBookname("Programming Language");
////		return book;	 
//	}
	
	@GetMapping("/book")
	public  List<bookEntity> getBook() {
		return this.bookservice.getAllBooks();
  
	}
	

}
