package com.oop1;

public class Main {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
		ba.setBalance(100);
		ba.deposit(100);
		ba.withdraw(150);
		ba.withdraw(150);
		
	}

}
