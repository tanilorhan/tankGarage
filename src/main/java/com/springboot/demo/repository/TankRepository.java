package com.springboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.demo.entity.Tank;

public interface TankRepository extends JpaRepository<Tank,Long>{
	
	@Query("Select t from Tank t left join TankClass tc on tc.Id=t.tankClass.id where (:#{#tiers == null} = true or t.tier IN (:tiers)) and (:#{#tankClasses == null} = true or tc.id IN (:tankClasses)) and (:name is null or t.name=:name)")
	public List<Tank> getTanksByFilter(List<Integer> tiers,List<Long> tankClasses,String name);
}
