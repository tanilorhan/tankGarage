package com.springboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.demo.entity.Tank;

public interface TankRepository extends JpaRepository<Tank,Long>{
	
	@Query("Select t from Tank t where (:tier is null or t.tier=:tier) and (:name is null or t.name=:name)")
	public List<Tank> getTanksByFilter(int tier,String name);
}
