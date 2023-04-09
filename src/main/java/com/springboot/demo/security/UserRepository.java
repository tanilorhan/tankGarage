package com.springboot.demo.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
	
	public User findByUsernameAndDeletedFalse(String username);

}
