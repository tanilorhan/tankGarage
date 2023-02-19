package com.springboot.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="Tank")
public class Tank extends BaseEntity {

	public Tank() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="Name")
	private String name;
	@Column(name="Tier")
	private int tier;
	@Column(name="HitPoints")
	private int hitPoints;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ClassId")
	private TankClass tankClass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public TankClass getTankClass() {
		return tankClass;
	}
	public void setTankClass(TankClass tankClass) {
		this.tankClass = tankClass;
	}
	
	

}
