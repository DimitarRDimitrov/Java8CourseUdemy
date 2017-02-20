package com.oop.challange;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburger hamburger = new Hamburger("New boy", "white bread", "beef", 5.50);
		double price =hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("tomato", 0.25);
		hamburger.addHamburgerAddition2("lettuce", 0.75);
		hamburger.addHamburgerAddition3("cheese", 1.22);
		System.out.println("Total burger price is " + hamburger.itemizeHamburger());
		
		HealthyBurger hb = new HealthyBurger("beef", 8.99);
		hb.addHamburgerAddition1("Egg", 1.55);
		hb.addHamburgerAddition2("lentils", 3.33);
		System.out.println("Healthy burger: " + hb.itemizeHamburger());
	}

}
