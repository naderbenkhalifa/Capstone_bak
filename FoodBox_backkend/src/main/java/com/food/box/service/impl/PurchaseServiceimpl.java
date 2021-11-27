package com.food.box.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.box.dao.PurchaseRepository;
import com.food.box.model.Purchase;
import com.food.box.service.PurchaseService;




@Service
public class PurchaseServiceimpl implements PurchaseService {
	@Autowired
	private PurchaseRepository purchaseRepo;

	
	
	public List<Purchase> findAll() {
		return purchaseRepo.findAll();
	}
	public Purchase save (Purchase purchase ) {
		return  purchaseRepo.save(purchase);
		
	}

	
	
}
