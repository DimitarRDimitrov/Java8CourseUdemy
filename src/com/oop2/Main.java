package com.oop2;

public class Main {

	public static void main(String[] args) {
		Wall wall1 = new Wall("east");
		Wall wall2 = new Wall("west");
		Wall wall3 = new Wall("north");
		Wall wall4 = new Wall("south");
		
		Ceiling ceiling = new Ceiling(12, "blue");
		
		Bed bed = new Bed("Modern", 4, 2, 3, 1);
		
		Lamp lamp = new Lamp("Classic", false, 75);
		
		Bedroom br = new Bedroom("tim's room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		
		br.makeBed();
		
		br.getLamp().turnOn();
		
	}

}
