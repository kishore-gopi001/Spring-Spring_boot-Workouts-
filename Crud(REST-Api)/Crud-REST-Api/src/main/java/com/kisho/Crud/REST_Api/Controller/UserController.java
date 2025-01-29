package com.kisho.Crud.REST_Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kisho.Crud.REST_Api.entity.User;
import com.kisho.Crud.REST_Api.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService us;
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		 return us.saveuser(user);
	}
	@GetMapping("/findAll")
	public List<User> findAll(){
		return us.findAll();
	}
	@GetMapping("/findbyid")
	public User findById(@RequestParam int id) {
		return us.findBYId(id);
	}
}
