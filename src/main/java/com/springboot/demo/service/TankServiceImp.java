package com.springboot.demo.service;

import java.util.List;
import java.util.Optional;

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

	public TankRepository getTankRepository() {
		return tankRepository;
	}

	public void setTankRepository(TankRepository tankRepository) {
		this.tankRepository = tankRepository;
	}



}
