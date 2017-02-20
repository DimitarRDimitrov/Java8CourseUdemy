package com.theatre.challange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Theatre t = new Theatre("Olymp", 8, 12);
		if(t.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		} else {
			System.out.println("Seat already reserved.");
		}
		if(t.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		} else {
			System.out.println("Seat already reserved.");
		}
		
		if(t.reserveSeat("B13")) {
			System.out.println("Please pay for B13");
		} else {
			System.out.println("Seat already reserved.");
		}
		
		List<Theatre.Seat> priceSeats = new ArrayList<>(t.getSeats());
		priceSeats.add(t.new Seat("B00", 13.00));
		priceSeats.add(t.new Seat("A00", 13.00));
		Collections.sort(priceSeats, Theatre.PRICE_ORDER);
		printList(priceSeats);
		
	}
	
	public static void printList(List<Theatre.Seat> l) {
		for (Theatre.Seat s: l) {
			System.out.println(s.getSeatNumber() + " $" + s.getPrice());
		}
	}
	

}
