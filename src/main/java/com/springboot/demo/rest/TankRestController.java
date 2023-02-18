package com.springboot.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Tank;
import com.springboot.demo.service.TankService;

@RestController
@RequestMapping("/api/tanks")
public class TankRestController {
	
	
	@Autowired
	private TankService tankService;

	public TankRestController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	private List<Tank> getAllTanks(){
		return tankService.findAll();
	}

	public TankService getTankService() {
		return tankService;
	}

	public void setTankService(TankService tankService) {
		this.tankService = tankService;
	}

}
