package com.oop.challange;

public class Hamburger {
	
	private String name;
	private String breadType;
	private String meat;
	private double price;

	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
		
	public Hamburger(String name, String breadType, String meat, double price) {
		this.name = name;
		this.breadType = breadType;
		this.meat = meat;
		this.price = price;
	}
	

	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}
	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double itemizeHamburger() {
		double hamPrice = this.price;
		System.out.println(this.name + " hamburger " + " on a " + this.breadType + " roll with" +this.meat + " price is " + this.price);
		if (this.addition1Name != null) {
			hamPrice += this.addition1Price;
			System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
		}
		if (this.addition2Name != null) {
			hamPrice += this.addition2Price;
			System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
		}
		if (this.addition3Name != null) {
			hamPrice += this.addition3Price;
			System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
		}
		if (this.addition4Name != null) {
			hamPrice += this.addition4Price;
			System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
		}
		System.out.println("TOTAL: " + hamPrice);
		return hamPrice;
	}

}
