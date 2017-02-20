package com.oop2.encapsulation;

public class BMW extends Car{

	public BMW() {
		super("BMW", true, 6, 4, 3);
	}

	@Override
	public void startEngine() {
		System.out.println("BMW's engine started");
	}

	@Override
	public void accelerate() {
		System.out.println("BMW is accelerating");
	}

	@Override
	public void brake() {
		System.out.println("THE BMW IS SLOWING DOWN");
		super.brake();
	}
	
	

	
}
