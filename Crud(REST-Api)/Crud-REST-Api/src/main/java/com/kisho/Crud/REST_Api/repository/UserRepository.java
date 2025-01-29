package com.kisho.Crud.REST_Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kisho.Crud.REST_Api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
