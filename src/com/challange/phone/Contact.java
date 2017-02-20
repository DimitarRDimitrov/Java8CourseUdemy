package com.challange.phone;

public class Contact {
	
	private String number;
	private String name;
	
	public Contact(String name, String number) {
		this.number = number;
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static Contact createContact(String name, String number) {
		return new Contact(name, number);
	}

}
