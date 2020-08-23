package com.assign.prj.priceservice.service;


import java.util.List;

import com.assign.prj.priceservice.model.Price;




public interface PriceService {

	List<Price> findAll();
	
	Price findById(int id); 
	
	//List<Price> findByNameEndsWith(String letter);

	
	List<Price> saveProduct(List<Price> products);

	Price saveProduct(Price products);
	
}

