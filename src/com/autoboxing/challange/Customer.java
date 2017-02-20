package com.autoboxing.challange;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String name, double firstTransaction) {
		this(name);
		this.transactions = new ArrayList<>();
		addTransaction(firstTransaction);
	}

	public static Customer initialize(String name, double firstTransaction) {
		return new Customer(name, firstTransaction);
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	public void addTransaction(double d) {
		transactions.add(d);
	}
	
}
