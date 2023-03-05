package com.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demo.entity.Tank;
import com.springboot.demo.entity.TankClass;
import com.springboot.demo.pojo.TankFilterParameterWrapper;
import com.springboot.demo.service.TankClassService;
import com.springboot.demo.service.TankService;

@Controller
@RequestMapping("listTanks")
public class ListTanksController {
	
	@Autowired
	private TankService tankService;
	@Autowired
	private TankClassService tankClassService;
	
	public ListTanksController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public String showTankList(Model model) {
		List<Tank> tanks = tankService.findAll();
		model.addAttribute("tanks", tanks);
		model.addAttribute("tiers", getTiers());
		model.addAttribute("tankFilterParameter", new TankFilterParameterWrapper());
		List<TankClass> tankClasses = tankClassService.findAll();
		model.addAttribute("tankClasses",tankClasses);
		return "tankList";
	}
	
	@PostMapping
	public String showTankListFiltered(Model model, @ModelAttribute TankFilterParameterWrapper tankFilterParameter) {
		List<Tank> tanks = new ArrayList<Tank>();
		tanks = tankService.getTanksByFilter(tankFilterParameter.getTiers(),tankFilterParameter.getTankClasses(), tankFilterParameter.getName());
		model.addAttribute("tanks", tanks);
		model.addAttribute("tiers", getTiers());
		model.addAttribute("tankFilterParameter", tankFilterParameter);
		
		List<TankClass> tankClasses = tankClassService.findAll();
		model.addAttribute("tankClasses",tankClasses);
		
		return "tankList";
	}
	
	private List<Integer> getTiers(){
		List<Integer> tiers = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			tiers.add(i);
		}
		return tiers;
	}

}
