package com.springBoot.Test.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.Test.DEO.BookRepo;
import com.springBoot.Test.Entity.bookEntity;
@Component
public class BookService {
	 @Autowired
	private BookRepo bookRepo;
//	
//	 private static List<bookEntity>list=new ArrayList<>();
//	 static {
//		 list.add(new bookEntity(1,"java"));
//		 list.add(new bookEntity(2,"python"));
//		 list.add(new bookEntity(3,"c++"));
//		 
//	 }
	
	public   List<bookEntity> getAllBooks() {
		 List<bookEntity> list=(List<bookEntity>)bookRepo.findAll();
		return list;
		
	}
	public   bookEntity getBooksById(int id) {
		bookEntity book=null;
		try {
//			book=list.stream().filter(e->e.getBookid()==id).findFirst().get();
		 book=bookRepo.findById(id);
		}catch (Exception e) {
			 e.printStackTrace();
		}
		
		return book;
	}
	
	//post
	public    bookEntity postBook(bookEntity book) {
		  bookEntity newBook=bookRepo.save(book);
		 return book;
	}
	//delete
	public    void deleteBook(int id) {
		try {
//			list= list.stream().filter(book->book.getBookid()!=id).collect(Collectors.toList());
			bookRepo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
	}
	
	//put
	public  void putBook(bookEntity book,int id) {
//		list=list.stream().map(e->{
//			if(e.getBookid()==id) {
//				 e.setBookid(book.getBookid());
//				 e.setBookname(book.getBookname());
//			}
//			return e;
//		}).collect(Collectors.toList());
	 book.setBookid(id);
		bookRepo.save(book);
		
		
	}

}
