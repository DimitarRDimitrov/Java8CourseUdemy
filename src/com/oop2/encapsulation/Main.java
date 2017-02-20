package com.oop2.encapsulation;

public class Main {
	
	public static void main(String[] args) {
		
//		Player p = new Player();
//		
//		p.name = "tim";
//		p.health = 20;
//		p.weapon = "sword";
//		
//		int damage = 10;
//		p.loseHealth(damage);
//		System.out.println("Remaining health: " + p.health);
//		
//		damage = 11;
//		p.health = 200;
//		p.loseHealth(damage);
//		System.out.println("Remaining health: " + p.health);
		
//		EnhancedPlayer p = new EnhancedPlayer("Tim", 50, "Sword");
//		System.out.println("Initial health " + p.getHealth());
		
//		Printer p = new Printer(50,true);
//		System.out.println("initial page count = " + p.getPagesPrinted());
//		int pagesPrinted = p.printPages(2);
//		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " + p.getPagesPrinted());
		
		Car bmw = new BMW();
		bmw.accelerate();
		bmw.brake();
	}
	
}
