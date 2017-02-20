package com.oop1.inheritance;

public class Main extends Object{

	public static void main(String[] args) {

		Animal a = new Animal(1, 1, 5, 5, "animal");
		
		Dog doggo = new Dog(1, 4, "Doggo", 2, 4, 20, 1, "furry");
//		doggo.eat();
		doggo.walk();
		
		
	}

}
