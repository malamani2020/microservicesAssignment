package com.assign.prj.priceservice.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.assign.prj.priceservice.model.Price;

	@Entity
	public class Price implements Comparable<Price>{

		@Id
		@GeneratedValue
		private int id;
		private String name;
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		
		public Price() {
			super();
		}

		public Price(int id, String name, double price_value) {
			this.id = id;
			this.name = name;
			this.price_value = price_value;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the price
		 */
		public double getPrice() {
			return price_value;
		}

		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			this.price_value = price;
		}
		private double price_value;
		
		@Override
		public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("id::"+this.id);
		str.append(":name::"+this.name);
		str.append(":price::"+this.price_value);
		
		return str.toString();
		}

		@Override
		public int compareTo(Price o) {
			// TODO Auto-generated method stub
			return 0;
		}

}