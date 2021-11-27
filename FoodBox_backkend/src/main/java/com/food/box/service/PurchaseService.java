package com.food.box.service;

import java.util.List;


import com.food.box.model.Purchase;

public interface PurchaseService {
	public List<Purchase> findAll();
	public Purchase save (Purchase purchase );

	

}
