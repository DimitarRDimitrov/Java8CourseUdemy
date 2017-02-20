package com.challange.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	
	private ArrayList<Contact> phoneBook = new ArrayList<>();
	
	private Scanner s = new Scanner(System.in);
	
	public void printOptions() {
		System.out.println("Press\n");
		System.out.println("\t 1 - Print list of contacts");
		System.out.println("\t 2 - Add new contact");
		System.out.println("\t 3 - Update existing contact");
		System.out.println("\t 4 - Remove contact");
		System.out.println("\t 5 - Find contact");
		System.out.println("\t 6 - Quit");
	}
	
	public void execute() {
		printOptions();
		boolean flag = true;
		while(flag) {
			System.out.print("Please select an action: ");
			int input = s.nextInt();
			switch (input) {
			case 1:
				printContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				findContact();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
	
	private void printInfo(Contact c) {
		System.out.println(c.getName() + " : " + c.getNumber());
	}
	
	public void printContacts() {
		if (phoneBook.isEmpty()) {
			System.out.println("The phone book is empty!");
			return;
		}
		for (Contact c: phoneBook) {
			printInfo(c);
		}
	}
	
	private void addPerson(String name, String phoneNumber) {
		phoneBook.add(new Contact(name,phoneNumber));
	}
	
	public void addContact() {
		s.nextLine();
		System.out.println("Please enter the name:");
		String name = s.nextLine();
		System.out.println("Please enter the phone number:");
		String phoneNumber = s.nextLine();
		addPerson(name, phoneNumber);
	}
	
	private int contactNamePresent(String name) {
		for (Contact c: phoneBook) {
			if (c.getName().equals(name)) {
				return phoneBook.indexOf(c);
			}
		}
		return -1;
	}
	
	public void findContact() {
		s.nextLine();
		System.out.println("Please enter the name: ");
		String name = s.nextLine();
		int index = contactNamePresent(name);
		if (index < 0) {
			System.out.println("No such name exists in the phonebook");
			return;
		}
		System.out.println(phoneBook.get(index).getName() + " : " + phoneBook.get(index).getNumber());
		
	}
	
	public void updateContact() {
		s.nextLine();
		System.out.println("Please enter the name: ");
		String name = s.nextLine();
		int index = contactNamePresent(name);

		if (index < 0) {
			System.out.println("No such name exists in the phonebook");
			return;
		}
		System.out.println("The existing number is: " + phoneBook.get(index).getNumber());
		System.out.println("Please enter the new number below: ");
		String newNumber = s.nextLine();
		phoneBook.get(index).setNumber(newNumber);
	}
	
	public void removeContact() {
		s.nextLine();
		System.out.println("Please enter the name: ");
		String name = s.nextLine();
		int index = contactNamePresent(name);
		if (index < 0) {
			System.out.println("No such name exists in the phonebook");
			return;
		}
		phoneBook.remove(index);
		System.out.println("Operation complete.");
	}
	
	
	

}
