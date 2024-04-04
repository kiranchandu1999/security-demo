package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.UserRepo;

@SpringBootApplication
public class DemoApplication{

	@Autowired
	UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
