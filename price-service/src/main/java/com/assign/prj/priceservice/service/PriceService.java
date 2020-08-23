package com.assign.prj.priceservice.service;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.prj.priceservice.config.Configuration;
import com.assign.prj.priceservice.model.Price;


@Service
public class PriceService {

	@Autowired
	private Configuration configuration;
	private Map<String, Price> accountCache= new HashMap<>();
	
	
	@PostConstruct
	public void setupTestData() {
		
		Price p1 = new Price("1", "Handbag", "200");
		Price p2 = new Price("2", "Kajal", "50");
		
		accountCache.put(p1.getAccountId(), p1);
		accountCache.put(p2.getAccountId(), p2);
	}
	
	
	/**
	 * Add account to cache
	 * 
	 * @param account
	 */
/*	public void createBankAccount(BankAccount account) {
		
		/* check balance is within allowed limits */
		/*if(account.getAccountBlance().doubleValue() >= configuration.getMinBalance() && 
		   account.getAccountBlance().doubleValue() <= configuration.getMaxBalance()) {
			
			accountCache.put(account.getAccountId(), account);
		}
		else {
			
			throw new InvalidAccountBalanceException("Bank Account Balance is outside of allowed thresholds");
		}		
	}*/
	
	
	/**
	 * Get account from cache
	 * 
	 * @param account
	 */
	public Price retrieveBankAccount(String accountId) {
		
		return accountCache.get(accountId);
	}
	
}

