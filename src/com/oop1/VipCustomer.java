package com.oop1;

public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	public VipCustomer() {
		this("Uknown", 50, "Unknown");
	}
	
	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "not specified");
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
	
	

}
