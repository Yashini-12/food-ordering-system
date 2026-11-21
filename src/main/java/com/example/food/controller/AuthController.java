package com.example.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.food.model.*;
import com.example.food.dao.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	UserRepo ur;
	@Autowired
	PasswordEncoder encoder;
	
	//someone register
	@PostMapping("/register")
	public User register(@RequestBody User u)
	{
		u.setPassword(encoder.encode(u.getPassword()));
		return ur.save(u); //save the password after encoding
	}

}
