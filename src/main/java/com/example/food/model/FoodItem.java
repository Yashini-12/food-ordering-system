package com.example.food.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class FoodItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	int price;
	
	@ManyToOne
	Resturant rest;

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItem(String name, int price, Resturant rest) {
		super();
		this.name = name;
		this.price = price;
		this.rest = rest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Resturant getRest() {
		return rest;
	}

	public void setRest(Resturant rest) {
		this.rest = rest;
	}

	
}
