package com.Main.Controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Main.Entity.User;

import jakarta.validation.Valid;

@Controller
public class myController {
	
	@GetMapping("/signup")
	public String getSignUp(Model model) {
		model.addAttribute("user" ,new User());
		return "signup";
	}
	
	@PostMapping("/home")
	public String processPage(@Valid @ModelAttribute("user") User user ,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "signup";
		}
		 
		System.out.println(user);
		return "home";
	}

}
