package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.security.UserRepository;

@Controller
@RequestMapping("registration")
public class RegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public RegistrationController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public String showRegistrationPage () {
		return "registration";
	}
	
	@PostMapping
	public void processRegistration(Model model) {
		System.out.println(model.getAttribute("userName"));
		System.out.println(model.getAttribute("password"));
	}

}
