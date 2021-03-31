package com.github.hugovallada.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hugovallada.hruser.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	User findByEmail(String email);
}
