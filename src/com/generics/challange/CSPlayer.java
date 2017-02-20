package com.generics.challange;

public class CSPlayer extends Player{

	public CSPlayer(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return (this.getName() + " is a tennis player");
	}

}
