package com.autoboxing.challange;

public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank("FI BANK");
		
		if(bank.addBranch("SOFIA")){
			System.out.println("SOFIA branch created");
		}
		bank.addCustomer("SOFIA", "Tim", 50.05);
		bank.addCustomer("SOFIA", "Mike",123.45);
		bank.addCustomer("SOFIA", "Jo", 0.99);
		
		bank.addBranch("LOVECH");
		bank.addCustomer("LOVECH", "Bob", 222.22);
		
		bank.addCustomerTransaction("SOFIA", "Tim", 44.22);
		bank.addCustomerTransaction("SOFIA", "Tim", 12.44);
		bank.addCustomerTransaction("SOFIA", "Mike", 1.11);
		
		bank.listCustomers("SOFIA", true);
		bank.listCustomers("LOVECH", true);
		
		bank.addBranch("Melb");
		
		if(!bank.addCustomer("Melb", "Brian", 9292)) {
			System.out.println("error - branch does not exist");
		}
		if(!bank.addBranch("SOFIA")) {
			System.out.println("ALREADY EXISTS");
		}
		if(!bank.addCustomerTransaction("SOFIA", "BOBOBO", 2)){
			System.out.println("CUST NOT PRESENT");
		}
		
		if(!bank.addCustomer("SOFIA", "Tim", 12.21)){
			System.out.println("CUST ALREADY EXISTS");
		}
		
	}

}
