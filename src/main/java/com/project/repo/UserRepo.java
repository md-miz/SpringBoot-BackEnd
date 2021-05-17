package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.User;

public interface UserRepo extends JpaRepository<User,String> {
	

}
