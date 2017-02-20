package com.oop1.exercise1;

public class Vehicle {
	
	private String name;
	private String size;
	
	private int currentVelocity;
	private int currentDirection;
	
	public Vehicle(String name, String size) {
		super();
		this.name = name;
		this.size = size;
		
		this.currentDirection = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer() at degrees " + this.currentDirection);;
	}
	
	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move() at v " + currentVelocity + " s " + currentDirection);
	}
	
	public String getName() {
		return name;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getCurrentDirection() {
		return currentDirection;
	}
	
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	
	public void stop() {
		this.currentVelocity = 0;
	}

}
