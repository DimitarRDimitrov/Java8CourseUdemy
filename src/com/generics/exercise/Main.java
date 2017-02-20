package com.generics.exercise;


public class Main {

	public static void main(String[] args) {

		FootballPlayer joe = new FootballPlayer("Joe");
//		BasketballPlayer pat = new BasketballPlayer("Pat");
		BaseballPlayer beckham = new BaseballPlayer("Beckham");
		
		Team<FootballPlayer> lovechLitex = new Team<>("Litex");
		lovechLitex.addPLayer(joe);
//		lovechLitex.addPLayer(pat);
//		lovechLitex.addPLayer(beckham);
		
		System.out.println(lovechLitex.numPlayers());
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago");
		baseballTeam.addPLayer(beckham);
		
		lovechLitex.matchResult(null, 50, 1);
//		lovechLitex.matchResult(baseballTeam, 50, 1);
		
		System.out.println("Rankings");
		System.out.println(lovechLitex.getName() + ": " + lovechLitex.ranking()); 
		
		
	}

}
