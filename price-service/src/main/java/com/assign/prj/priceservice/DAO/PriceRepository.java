package com.assign.prj.priceservice.DAO;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assign.prj.priceservice.model.Price;


public interface PriceRepository extends JpaRepository<Price, Long> {
	
	List<Price> findAll();
	
	Price findById(int id); 
	
	List<Price> findByNameEndsWith(String letter);

	

}
