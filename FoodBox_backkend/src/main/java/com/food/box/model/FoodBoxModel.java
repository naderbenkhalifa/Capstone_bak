 package com.food.box.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table

public class FoodBoxModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String foodName;
	private String description;
	private boolean availability;

	private int price;
	

	private String avatar;
	
	
	public FoodBoxModel() {
		super();
	
	}
	
	public FoodBoxModel(int id, String foodName, String description, boolean availability, int price, String avatar) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.description = description;
		this.availability = availability;
		this.price = price;
		this.avatar = avatar;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public FoodBoxModel(String foodName, String description, boolean availability, int price) {
		super();
		this.foodName = foodName;
		this.description = description;
		this.availability = availability;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodBoxModel [id=" + id + ", foodName=" + foodName + ", description=" + description + ", availability=" + availability
				+ ", price=" + price + ", avatar=" + avatar + "]";
	}


}
