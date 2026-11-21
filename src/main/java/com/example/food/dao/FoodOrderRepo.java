package com.example.food.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.model.*;
public interface FoodOrderRepo extends JpaRepository<FoodOrder,Integer> {

	public List<FoodOrder> findByDeliverypartner_Id(int id);
}
