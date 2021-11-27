package com.food.box.service;

import java.util.List;
import com.food.box.model.FoodBoxModel;

public interface FoodBoxService {
	
	public FoodBoxModel addFood(FoodBoxModel food); 		
	public FoodBoxModel updateFood(FoodBoxModel food);
	public void deleteFoodById(int id);						
	public FoodBoxModel getFoodById(int id);
	public List<FoodBoxModel> getAllFoods();

}
