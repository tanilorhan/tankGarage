package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.security.User;
import com.springboot.demo.security.UserRepository;
import com.springboot.demo.utility.DateUtility;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public static class RegistrationDTO{
		private String userName;
		private String password;
		private String passwordConfirm;
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPasswordConfirm() {
			return passwordConfirm;
		}
		public void setPasswordConfirm(String passwordConfirm) {
			this.passwordConfirm = passwordConfirm;
		}
		
		
	}

	public RegistrationController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public String showRegistrationPage () {
		return "registration";
	}
	
	@PostMapping
	public String processRegistration(RegistrationDTO dto,Model model) {
		if(dto.getUserName()==null || dto.getUserName().isBlank()) {
			model.addAttribute("errorMessage", "User name must be filled!");
			return "registration";
		}
		User user = userRepository.findByUsernameAndDeletedFalse(dto.getUserName());
		if(user!=null) {
			model.addAttribute("errorMessage", "User name is already taken, enter a different user name.");
			return "registration";
		}
		if(dto.getPassword()!=null && dto.getPasswordConfirm()!=null && dto.getPassword().equals(dto.getPasswordConfirm())) {
			user = new User();
			user.setCreateTime(DateUtility.getCurrentTimestamp());
			user.setUpdateTime(DateUtility.getCurrentTimestamp());
			user.setUsername(dto.getUserName());
			user.setPassword(passwordEncoder.encode(dto.getPassword()));
			userRepository.save(user);
			return "login";
		}else {
			model.addAttribute("errorMessage", "Passwords did not match. Enter same password twice.");
			return "registration";
		}
		
	}

}
