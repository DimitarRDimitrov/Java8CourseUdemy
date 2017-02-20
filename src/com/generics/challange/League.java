package com.generics.challange;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<?>> {
	private String name;
	private int capacity;
	
	ArrayList<T> standings = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public League(String name) {
		this.name = name;
		this.capacity = 10;
	}

	public League(String name, int capacity) {
		this(name);
		this.capacity = capacity;
	}

	public boolean addTeam(T team) {
		if(standings.contains(team) || standings.size() + 1 > capacity) {
			System.out.println("Team not added");
			return false;
		}
		standings.add(team);
		return true;
	}
	
	public void printStandings() {
		Collections.sort(standings);
		for(T t : standings) {
			System.out.println((standings.indexOf(t)+1) + ". " + t.getName() + " - " + t.ranking());
		}
	}




}
