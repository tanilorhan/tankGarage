package com.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.entity.TankClass;
import com.springboot.demo.repository.TankClassRepository;

@Service
public class TankClassServiceImp implements TankClassService{
	
	@Autowired
	private TankClassRepository tankClassRepository;
	
	public TankClassServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TankClass> findAll() {
		// TODO Auto-generated method stub
		return tankClassRepository.findAll();
	}

	@Override
	public TankClass findById(long id) {
		// TODO Auto-generated method stub
		return tankClassRepository.findById(id).orElse(null);
	}

	@Override
	public void save(TankClass entity) {
		tankClassRepository.save(entity);
		
	}

	@Override
	public void deleteById(long theId) {
		tankClassRepository.deleteById(theId);
		
	}

	public TankClassRepository getTankClassRepository() {
		return tankClassRepository;
	}

	public void setTankClassRepository(TankClassRepository tankClassRepository) {
		this.tankClassRepository = tankClassRepository;
	}

}
