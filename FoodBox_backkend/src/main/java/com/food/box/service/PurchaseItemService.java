package com.food.box.service;

import java.util.List;

import com.food.box.model.PurchaseItem;

public interface PurchaseItemService {
	public List<PurchaseItem> findAll();
	public PurchaseItem save (PurchaseItem purchaseItem );
	

}
