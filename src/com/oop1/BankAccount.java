package com.oop1;

public class BankAccount {
	
	private long number;
	private int balance;
	private String customerName;
	private String phoneNumber;
	public long getNumber() {
		return number;
	}
	public void setnumber(long number) {
		this.number = number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(int sum) {
		this.balance += sum;
		System.out.println("The balance was increased by " + sum + " and is now " + balance);
	}
	
	public void withdraw(int sum) {
		if (sum > balance) {
			System.out.println("Insufficient funds!");
			return;
		}
		this.balance -= sum;
		System.out.println("The balance is now " + balance);
	}
	
	

}
