package com.example.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.food.model.*;
import com.example.food.dao.*;
import java.util.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	@Autowired
	FoodOrderRepo fo2;
	@GetMapping("/orders/{partnerid}")
	public List<FoodOrder> get6(@PathVariable int partnerid)
	{
		return fo2.findByDeliverypartner_Id(partnerid);
	}
	@PutMapping("/status/{orderid}")
	public FoodOrder get7(@PathVariable int orderid)
	{
		FoodOrder order = fo2.findById(orderid).get();
		order.setStatus(OrderStatus.DELIVERED);
		return fo2.save(order);
		
	}
}
