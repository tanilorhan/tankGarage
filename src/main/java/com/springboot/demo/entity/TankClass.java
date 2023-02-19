package com.springboot.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name="TankClass")
public class TankClass extends BaseEntity {

	public TankClass() {
	}
	
	@Column(name="Name")
	private String name;
	@Column(name="ClassFeaturesSummary")
	private String classFeaturesSummary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassFeaturesSummary() {
		return classFeaturesSummary;
	}
	public void setClassFeaturesSummary(String classFeaturesSummary) {
		this.classFeaturesSummary = classFeaturesSummary;
	}
	
	

}
