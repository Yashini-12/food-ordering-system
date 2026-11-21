package com.example.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.food.model.*;
import com.example.food.dao.*;
import java.util.*;

@RestController
@RequestMapping("/customer")

public class CustomerController {

	@Autowired
	FoodItemRepo fr1;
	@Autowired
	FoodOrderRepo fo1;
	@Autowired
	UserRepo ur2;
	
	@GetMapping("/showfoods")
	public List<FoodItem> get4()
	{
		return fr1.findAll();
	}
	
	@PostMapping("/order/{customerid}")
	public FoodOrder get5(@PathVariable int customerid,@RequestBody List<Integer> foodids)
	{
		FoodOrder order=new FoodOrder();
		order.setCustomer(ur2.findById(customerid).get());
		order.setItems(fr1.findAllById(foodids));
		order.setStatus(OrderStatus.PLACED);
		return fo1.save(order);
			
		
	}
}
