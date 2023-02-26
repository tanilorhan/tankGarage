package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.entity.Tank;
import com.springboot.demo.entity.TankClass;

public interface TankClassRepository extends JpaRepository<TankClass,Long>{

}
