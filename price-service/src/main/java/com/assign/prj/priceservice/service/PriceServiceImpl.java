	package com.assign.prj.priceservice.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.assign.prj.priceservice.DAO.PriceRepository;
	import com.assign.prj.priceservice.model.Price;

	@Service
	public class PriceServiceImpl implements PriceService{

		@Autowired
		private PriceRepository productDao;

		@Override
		public List<Price> findAll() {
			return productDao.findAll();
		}

		@Override
		public Price findById(int id) {
			System.out.println("id:: "+id);
			return productDao.findById(id);
		}

		

		@Override
		public List<Price> saveProduct(List<Price> products) {
			// TODO Auto-generated method stub
			return productDao.saveAll(products);
		}

		@Override
		public Price saveProduct(Price products) {
			// TODO Auto-generated method stub
			return productDao.save(products);
		}
		
		
	}
