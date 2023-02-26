package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.entity.Tank;

@Controller
@RequestMapping("tank")
public class TankController {
	
	public TankController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("add")
	public String showAddTank(Model model) {
		Tank tank = new Tank();
		model.addAttribute("tank", tank);
		model.addAttribute("title", "Add A New Tank");
		return "tank";
	}
	
	@PostMapping("add")
	public String processAddTank(@ModelAttribute Tank tank,Model model) {
		System.out.println(tank.getName());
		return "redirect:/listTanks";
		
	}

}
