package com.food.box.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.box.model.PurchaseItem;


@Repository	
public interface PurchaseItemRepository extends JpaRepository<PurchaseItem,Long> {

}
