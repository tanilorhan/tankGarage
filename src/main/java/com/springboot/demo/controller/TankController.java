package com.springboot.demo.controller;

import java.sql.Timestamp;
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
import com.springboot.demo.service.TankClassService;
import com.springboot.demo.service.TankService;

@Controller
@RequestMapping("tank")
public class TankController {
	
	@Autowired
	private TankClassService tankClassService;
	@Autowired
	private TankService tankService;
	
	public TankController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("add")
	public String showAddTank(Model model) {
		Tank tank = new Tank();
		model.addAttribute("tank", tank);
		model.addAttribute("title", "Add A New Tank");
		List<TankClass> tankClasses=tankClassService.findAll();
		model.addAttribute("tankClasses",tankClasses);
		return "tank";
	}
	
	@PostMapping("add")
	public String processAddTank(@ModelAttribute Tank tank,Model model) {
		Timestamp currTime = new Timestamp(System.currentTimeMillis());
		tank.setCreateTime(currTime);
		tank.setUpdateTime(currTime);
		tankService.save(tank);
		return "redirect:/listTanks";
		
	}

	public TankClassService getTankClassService() {
		return tankClassService;
	}

	public void setTankClassService(TankClassService tankClassService) {
		this.tankClassService = tankClassService;
	}

	public TankService getTankService() {
		return tankService;
	}

	public void setTankService(TankService tankService) {
		this.tankService = tankService;
	}

}
