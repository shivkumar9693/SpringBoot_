package com.springBoot.Test.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Test.Entity.User;
import com.springBoot.Test.Service.userService;


@RestController
public class UserController {
	@Autowired
	private userService service;
	//get All User
	@GetMapping("/user")
	@ResponseBody
	public ResponseEntity<List<User>> getAllUser(){
		List<User>list=  service.getAllUser();
		
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.of(Optional.of(list));
		}
		
	}
	
	//get User By Id
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
		 User user=service.getById(id);
		 if(user==null) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }else {
			 return ResponseEntity.ok(user);
		 }
	}
	//post User
	@PostMapping("/user")
	public ResponseEntity<User> postUser(@RequestBody User user){
		User res=null;
		try {
			res=service.saveUser(user);
			return ResponseEntity.of(Optional.of(res));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}
		
	}
	
	//update
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable int id){
		User res=null;
		 try{
			 res=service.updateUser(user, id);
				return ResponseEntity.ok().body(res);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}  
		
		
		
	}
	
	
	

}
