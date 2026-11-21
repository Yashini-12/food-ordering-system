package com.example.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.food.model.*;
public interface UserRepo extends JpaRepository<User,Integer>{
	

}
