package com.tauseef.webapp.model;

public class Customer {

	// data properties
		private long id;
		private String name;
		private double balance;
		private String address;
		
		// constructor
		public Customer(long id, String name, double balance, String address) {
			super();
			this.id = id;
			this.name = name;
			this.balance = balance;
			this.address = address;
		}
		public Customer() {}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
			
		
		
}
