package com.assign.prj.priceservice;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.assign.prj.priceservice.DAO.PriceRepository;
import com.assign.prj.priceservice.model.Price;


@SpringBootApplication
public class LoadSearchDataApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(LoadSearchDataApplication.class, args);
	
		PriceRepository repo = ac.getBean(PriceRepository.class);
		
		
		List<Price> product = new ArrayList<>();
	
		

		Price p1=new Price(1, "Wallet", 200);
		
		Price p2=new Price(2, "Shoes", 2500);
		
		product.add(p1);
		product.add(p2);
		product.add(new Price(3, "Laptop - HP", 45000));
		product.add(new Price(4, "Headset", 1500));
		
		
		repo.saveAll(product);
		
		
		

	}

}
