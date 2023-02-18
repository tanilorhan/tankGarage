package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.entity.Tank;

public interface TankRepository extends JpaRepository<Tank,Long>{

}
