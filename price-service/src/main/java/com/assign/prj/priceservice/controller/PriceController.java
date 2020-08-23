package com.assign.prj.priceservice.controller;


	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.assign.prj.priceservice.model.Price;
	import com.assign.prj.priceservice.service.PriceService;

	@RestController
	@RequestMapping("/api")
	public class PriceController {
		
		@Autowired
		private  PriceService priceservice;
		
		
		@GetMapping("/1") //TEST URL http://localhost:8081/api/1
		public String temp() {
			return "hiio";
		}
		
		////http://localhost:8081/api/products
		@GetMapping("/price")
		public List<Price> getAllProducts() {
			return priceservice.findAll();
		}

		//http://localhost:8081/api/products/1
		@GetMapping("/price/{id}")
		public Price getByProdId(@PathVariable("id") int id) {
			return priceservice.findById(id);
		}
		
		
	/*	@PostMapping("/products")
		public Product postProducts(@RequestBody Product product) {
			return productservice.saveProduct(product);
		}
		
		@PostMapping("/products/all")
		public List<Product> postProductAll(@RequestBody List<Product> product) {
			return productservice.saveProduct(product);
		}*/
		
	}
