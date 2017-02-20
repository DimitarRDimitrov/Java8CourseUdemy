package com.autoboxing.challange;

import java.util.ArrayList;

public class Branch {
	
	private String nameOfBranch;
	private ArrayList<Customer> customers;
	
	public Branch(String nameOfBranch) {
		this.nameOfBranch = nameOfBranch;
		this.customers = new ArrayList<>();
	}
	
	public static Branch init(String name) {
		return new Branch(name);
	}

	public String getNameOfBranch() {
		return nameOfBranch;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public void addNewCustomer(Customer c) {
		customers.add(c);
	}
	
	public boolean addCustomer(Customer c, double transaction) {
		if(hasCustomer(c.getName()) == null) {
			return false;
		}
		
		customers.add(c);
		c.addTransaction(transaction);
		return true;
	}
	
	public boolean addCustomer(String name, double transaction) {
		if(hasCustomer(name) != null) {
			return false;
		}
		customers.add(Customer.initialize(name, transaction));
		return true;
	}
	
	public boolean addTransaction(String customerName, double transaction) {
		Customer c = hasCustomer(customerName);
		
		if(c == null) {
			System.out.println("No such customer found");
			return false;
		}
		c.addTransaction(transaction);
//		System.out.println("Customer " + customerName + " was added transaction: " + transaction);
		return true;
	}
	
	private Customer hasCustomer(String name) {
		for(int i = 0; i < this.customers.size(); i++) {
			Customer cust = this.customers.get(i);
			if(cust.getName().equals(name)) {
				return cust;
			}
		}
		return null;
	}
	
	

}
