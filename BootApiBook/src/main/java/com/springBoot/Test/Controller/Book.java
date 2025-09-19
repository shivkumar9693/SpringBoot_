package com.springBoot.Test.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Test.Entity.bookEntity;
import com.springBoot.Test.Service.BookService;
import org.springframework.web.bind.annotation.PutMapping;



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
	@ResponseBody
	public  ResponseEntity<List<bookEntity>> getBook() {
		List<bookEntity>list=bookservice.getAllBooks();
		
		 if(list.size()<=0) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }else {
			 return ResponseEntity.of(Optional.of(list));
		 }
  
	}
	
	@GetMapping("/book/{id}")
	public  ResponseEntity<bookEntity> getBookById(@PathVariable("id")int id) {
		bookEntity book=bookservice.getBooksById(id);
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.ok(book);
		}
		 
	}
	
	//post route
	@PostMapping("/book")
	public ResponseEntity<bookEntity> postBook(@RequestBody bookEntity book) {
		bookEntity b=null;
		try {
			 b=bookservice.postBook(book);
			 return ResponseEntity.of(Optional.of(b));
			 
		} catch (Exception e) {
		 
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		 
	
	}
	
	//delete
	@DeleteMapping("/book/{id}")
	public  ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
		try {
			bookservice.deleteBook(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	//put
	@PutMapping("/book/{id}")
	public ResponseEntity<bookEntity> putMethodName(@RequestBody bookEntity book,@PathVariable int id) {
		//TODO: process PUT request
		try {
			 bookservice.putBook(book, id);
			 return ResponseEntity.ok().body(book);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		   
		 
	}
	
	

}
