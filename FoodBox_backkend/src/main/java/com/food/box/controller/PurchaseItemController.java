package com.food.box.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.box.model.PurchaseItem;


import com.food.box.service.PurchaseItemService;




@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PurchaseItemController {
	@Autowired(required=true)
	private PurchaseItemService purchaseItemService;
	
	@GetMapping("/purchaseItems")
	public List<PurchaseItem>findAll() {
		
		return purchaseItemService.findAll();
	}
	
	
	@PostMapping ("/purchaseItem")
	public PurchaseItem save(@RequestBody PurchaseItem purchaseItem) {
		
		return purchaseItemService.save(  purchaseItem);
	}


}
