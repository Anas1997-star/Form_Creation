package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@Controller
public class RegistrationController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
public String register(Model model)
{
		User user =new User();
		model.addAttribute("user" ,user);
	return "register";
}
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
		String result="error";
		if(user.getPassword().equals(user.getConfirm_password()))
		{
		try {
			userService.registerUser(user);
			result="home";
		}
		catch(Exception e) {
			result="error";
		}
		System.out.println(user);
		}
		return result;
	}
	
}
