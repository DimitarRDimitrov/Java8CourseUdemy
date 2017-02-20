package com.generics.challange;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
	
	private String name;
	private int won;
	private int lost;
	private ArrayList<T> players = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public Team(String name) {
		this.name = name;
	}
	
	public boolean addPlayer(T player) {
		if(players.contains(player)) return false;
		players.add(player);
		System.out.println(player.getName() + " was signed to " + this.name);
		return true;
	}

	public int ranking() {
		return (won * 3) - (lost);
	}
	
	public void matchResult(Team<T> enemy, int ourScore, int enemyScore) {
		if (ourScore == enemyScore) {
			System.out.println("There should be a winner");
			return;
		}
		if (ourScore > enemyScore) {
			won++;
		} else {
			lost++;
		}
		if (enemy != null) {
			matchResult(null, enemyScore, ourScore);
		}
	}
	
	@Override
	public int compareTo(Team<T> o) {
		if(this.ranking() > o.ranking()) {
			return -1;
		} else if (this.ranking() < o.ranking()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	
	
	

}
