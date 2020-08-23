package com.assign.prj.priceservice.model;



import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Price {

	public Price(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Setter
	@Getter
	private String accountId;

	@Setter
	@Getter
	private String accountName;

	@Setter
	@Getter
	private String price;
}

