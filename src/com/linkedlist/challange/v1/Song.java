package com.linkedlist.challange.v1;

public class Song {
	
	private String name;
	private int durationInSeconds;
	public Song(String name, int durationInSeconds) {
		this.name = name;
		this.durationInSeconds = durationInSeconds;
	}
	public String getName() {
		return name;
	}
	public int getDurationInSeconds() {
		return durationInSeconds;
	}
	

}
