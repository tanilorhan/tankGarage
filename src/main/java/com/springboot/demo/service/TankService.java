package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.Tank;

public interface TankService extends BaseService<Tank>{
	
	public List<Tank> getTanksByFilter(int tier,String name);

}
