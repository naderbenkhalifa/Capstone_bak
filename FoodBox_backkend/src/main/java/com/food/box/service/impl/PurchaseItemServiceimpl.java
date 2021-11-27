package com.food.box.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.box.dao.PurchaseItemRepository;
import com.food.box.model.PurchaseItem;
import com.food.box.service.PurchaseItemService;




@Service
public class PurchaseItemServiceimpl implements  PurchaseItemService {
	@Autowired
	private PurchaseItemRepository purchaseItemRepo;

	public List<PurchaseItem> findAll() {
		return purchaseItemRepo.findAll();
	}
	
	public PurchaseItem save (PurchaseItem purchaseItem ) {
		return  purchaseItemRepo.save(purchaseItem);
		
	}
	
	
	
	

}
