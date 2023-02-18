package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.entity.Tank;
import com.springboot.demo.service.TankService;

@Controller
@RequestMapping("listTanks")
public class ListTanksController {
	
	@Autowired
	private TankService tankService;

	public ListTanksController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public String showTankList(Model model) {
		List<Tank> tanks = tankService.findAll();
		model.addAttribute("tanks", tanks);
		
		return "tankList";
	}

}
