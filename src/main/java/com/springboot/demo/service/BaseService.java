package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.BaseEntity;

public interface BaseService<T extends BaseEntity>  {
	
	public List<T> findAll();
	
	public T findById(long id);
	
	public void save(T entity);
	
	public void deleteById(long theId);
}
