package com.example.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.food.model.*;
import com.example.food.dao.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	ResturantRepo rr;
	@Autowired
	FoodItemRepo fr;
	@Autowired
	FoodOrderRepo fo;
	@Autowired
	UserRepo ur1;
	
	@PostMapping("/addrestuarant")
	public Resturant get1(Resturant r)
	{
		return rr.save(r);
		
	}
	
	@PostMapping("/addfood")
	public FoodItem get2(FoodItem f) {
		return fr.save(f);
	
	}
	
	@PutMapping("/assign/{orderid}/{partnerid}")
	public FoodOrder get3(@PathVariable int orderid,@PathVariable int partnerid)
	{
		FoodOrder order=fo.findById(orderid).get();
		User partner=ur1.findById(partnerid).get();
		
		order.setDeliverypartner(partner);
		order.setStatus(OrderStatus.OUT_OF_DELIVERY);
		return fo.save(order);
		
	}


}
