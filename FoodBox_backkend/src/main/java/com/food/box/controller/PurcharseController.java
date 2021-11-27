package com.food.box.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.box.model.Purchase;
import com.food.box.service.PurchaseService;




@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class PurcharseController {
	
	@Autowired
	private PurchaseService purchaseService;

	@GetMapping("/purchases")
	public List<Purchase> findAll() {
		
		return purchaseService.findAll();
	}

	@PostMapping("/purchase")
	public Purchase save( @RequestBody  Purchase purchase) {
		
		return purchaseService.save(purchase);
	}

}
