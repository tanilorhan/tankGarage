package com.springboot.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name="Tank")
public class Tank extends BaseEntity {

	public Tank() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="Name")
	private String name;
	@Column(name="Type")
	private String type;
	@Column(name="Tier")
	private int tier;
	@Column(name="HitPoints")
	private int hitPoints;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	

}
