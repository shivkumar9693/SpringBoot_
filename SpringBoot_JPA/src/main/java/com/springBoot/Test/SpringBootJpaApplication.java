package com.springBoot.Test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springBoot.Test.DEO.UserRepo;
import com.springBoot.Test.Entity.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJpaApplication.class, args);
		 UserRepo repo=context.getBean(UserRepo.class);
		 
		 //*****************Insert************
		 
//		 User user=new User();
//		 user.setUserName("shiv kumar");
//		 user.setUserAddress("patna bihar");
//		 //single user 
//		 User user1=repo.save(user);
//		 
//		 User user2=new User();
//		 user2.setUserName("shivam");
//		 user2.setUserAddress("madhubani bihar");
//		 
//		 //save Many User Using List 
//		 List<User>userAll=List.of(user1,user2);
//		Iterable<User>result= repo.saveAll(userAll);
//		//we can print directly all user or we store it in iterable and print all using lambda function
////		System.out.println(userAll);
//		result.forEach(User->{System.out.print(result);});
		 
		 //*******Update**********
		       //user for finding one 
//		 Optional<User> user=repo.findById(1);
//		 User res=user.get();
//		 res.setUserName("Ankit Yadav");
//		User userUpdate=repo.save(res); 
//		 System.out.println(userUpdate);
//		 
//		 //*********Read******
//		 //how to get all data //findById() if it present then it give data
//		Iterable<User>AllUser= repo.findAll();
//		AllUser.forEach(user2->{System.out.println(user2);}); 
		
		
		//******Delete*************
		   ///delete One
		repo.deleteById(103);
		System.out.println("Deleted");
		
		// Delete Many
		 //first find all then delete it using iteration
		Iterable<User>allusers=repo.findAll();
		allusers.forEach(user->{System.out.println(user);});
		repo.deleteAll(allusers);
		
		
		 
		 
		 
		 
		
		 
	}

}
