package com.oop2.encapsulation;

public class Car {

	private String name;
	private boolean hasEngine;
	private int cylinders;
	private int wheels;
	private int doors;

	public Car(String name, boolean hasEngine, int cylinders, int wheels, int doors) {
		this.name = name;
		this.hasEngine = hasEngine;
		this.cylinders = cylinders;
		this.wheels = wheels;
		this.doors = doors;
	}
	
	public void startEngine() {
		System.out.println("Generic car engine started");
	}
	
	public void accelerate() {
		System.out.println("Increasing the speed of CAR");
	}

	public void brake() {
		System.out.println("The car has stopped");
	}
	
	public boolean isHasEngine() {
		return hasEngine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public int getDoors() {
		return doors;
	}

	
	
}
