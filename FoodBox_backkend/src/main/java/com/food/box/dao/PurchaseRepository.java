package com.food.box.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.box.model.Purchase;


@Repository	
public interface PurchaseRepository extends JpaRepository<Purchase,Long> {

}
