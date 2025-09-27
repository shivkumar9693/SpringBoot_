package com.Main.Controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Main.Entity.User;

@Controller
public class myController {
	
	@GetMapping("/signup")
	public String getSignUp() {
		return "signup";
	}
	
	@PostMapping("/home")
	public String processPage(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "home";
	}

}
