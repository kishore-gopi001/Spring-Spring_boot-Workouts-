package com.kisho.Crud.REST_Api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kisho.Crud.REST_Api.entity.User;
import com.kisho.Crud.REST_Api.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrep;
	
	public User saveuser(User user) {
		return userrep.save(user);
	}
	
	public User findBYId(int id) {
		Optional<User> user = userrep.findById(id);
		if(user.isEmpty()) throw new RuntimeException( "no user found");
		
		return user.get();
	}
	public List<User> findAll(){
		return userrep.findAll();
	}
}
