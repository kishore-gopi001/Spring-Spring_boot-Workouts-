package com.kisho.Crud.REST_Api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter

public class User{
	@Id
	private int id;
	private String uname;
	private String password;
	
}