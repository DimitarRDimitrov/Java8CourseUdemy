package com.generics.challange;

public class Main {

	public static void main(String[] args) {

		CSPlayer p1 = new CSPlayer("asd");
		CSPlayer p2 = new CSPlayer("dfd");
		CSPlayer p3 = new CSPlayer("ggg");
		
		Team<CSPlayer> legends = new Team<>("Legends");
		Team<CSPlayer> echo = new Team<>("Echo");
		Team<CSPlayer> buba = new Team<>("buba");
//		Team<RandomPlayer> random = new Team<>("Randoms");
		
		legends.matchResult(echo, 16, 10);
		legends.matchResult(buba, 16, 14);
		buba.matchResult(echo, 14, 16);
		
		legends.addPlayer(p1);
		legends.addPlayer(p2);
		legends.addPlayer(p3);
		legends.addPlayer(p3);
		
		League<Team<CSPlayer>> lcs = new League<>("LCS");
		lcs.addTeam(legends);
		lcs.addTeam(echo);
		lcs.addTeam(buba);
//		lcs.addTeam(random);
		lcs.printStandings();
		
	}

}
