package com.generics.exercise;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addPLayer(T player) {
		if (members.contains(player)) {
			System.out.println(player.getName() + " is already in the team.");
			return false;
			
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
	}
	
	public int numPlayers() {
		return members.size();
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if(ourScore > theirScore) {
			won++;
		} else if (ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		played++;
		if (opponent != null) {
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> o) {
		if(this.ranking() > o.ranking()) {
			return -1;
		} else if (this.ranking() == o.ranking()) {
			return 0;
		} else {
			return 1;
		}
		
	}	
	

}
