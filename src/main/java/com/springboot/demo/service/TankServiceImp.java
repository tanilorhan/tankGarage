package com.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.entity.Tank;
import com.springboot.demo.repository.TankRepository;

@Service
public class TankServiceImp implements TankService{
	
	@Autowired
	private TankRepository tankRepository;

	public TankServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Tank> findAll() {
		// TODO Auto-generated method stub
		return tankRepository.findAll();
	}

	@Override
	public Tank findById(long id) {
		// TODO Auto-generated method stub
		Optional<Tank> tankOpt = tankRepository.findById(id);
		return tankOpt.orElse(null);
	}

	@Override
	public void save(Tank entity) {
		tankRepository.save(entity);
	}

	@Override
	public void deleteById(long theId) {
		tankRepository.deleteById(theId);
	}
	
	public List<Tank> getTanksByFilter(List<Integer> tiers,List<Long> tankClasses,String name){
		return tankRepository.getTanksByFilter((tiers!=null && !tiers.isEmpty())?tiers:null
				,(tankClasses!=null && !tankClasses.isEmpty())?tankClasses:null
				, !Strings.isEmpty(name)?name:null);
	}

	public TankRepository getTankRepository() {
		return tankRepository;
	}

	public void setTankRepository(TankRepository tankRepository) {
		this.tankRepository = tankRepository;
	}
	
	



}
