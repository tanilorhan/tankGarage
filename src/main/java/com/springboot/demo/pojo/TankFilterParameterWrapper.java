package com.springboot.demo.pojo;

import java.util.List;

public class TankFilterParameterWrapper {
	
	private List<Integer> tiers;
	private List<Long> tankClasses;
	private String name;
	
	public TankFilterParameterWrapper() {
		// TODO Auto-generated constructor stub
	}

	public List<Integer> getTiers() {
		return tiers;
	}

	public void setTiers(List<Integer> tiers) {
		this.tiers = tiers;
	}

	public List<Long> getTankClasses() {
		return tankClasses;
	}

	public void setTankClasses(List<Long> tankClasses) {
		this.tankClasses = tankClasses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
