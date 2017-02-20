package com.theatre.challange;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

import com.theatre.challange.Theatre.Seat;

public class Theatre {
	private final String theatreName;
	private List<Seat> seats = new ArrayList<>();
	
	static final Comparator<Seat> PRICE_ORDER = new Comparator<Theatre.Seat>() {
		
		@Override
		public int compare(Seat o1, Seat o2) {
			if(o1.getPrice() < o2.getPrice()) {
				return -1;
			} else if(o1.getPrice()>o2.getPrice()) {
				return 1;
			} else {
				return 0;
			}
		}
	};
	
	
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (numRows -1);
		for (char row = 'A'; row <= lastRow; row++) {
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				double price = 12.00d;
				if((row < 'D') && (seatNum >= 4 && seatNum <=9)){
					price = 14.00d;
				} else if ((row>'F') && (seatNum < 4 || seatNum > 9)) {
					price = 7.00d;
				}
				Seat seat = new Seat(row + String.format("%02d", seatNum), price);
				seats.add(seat);
			}
		}
	}
	
	

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestSeat = new Seat(seatNumber, 0);
		int foundSeat = Collections.binarySearch(seats, requestSeat);
		if(foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
//		for(Seat seat: seats) {
//			if(seat.getSeatNumber().equals(seatNumber)) {
//				requestSeat = seat;
//				break;
//			}
//		}
//		if(requestSeat == null) {
//			System.out.println("There is no seat " + seatNumber);
//		}
//		return requestSeat.reserve();
	}
	
	//for testing
//	public void getSeats() {
//		for(Seat seat: this.seats) {
//			System.out.println(seat.getSeatNumber());
//		}
//	}
	
	public Collection<Seat> getSeats() {
		return seats;
	}
	
	public class Seat implements Comparable<Seat>{
		private final String seatNumber;
		private boolean reserved = false;
		private double price;
		
		public Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price = price;
		}
		
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved");
				return true;
			} else {
				return false;
			}
		}
		
		public boolean cancel() {
			if(this.reserved) {
				this.reserved = false;
				System.out.println("Reservation canceled for seat " + seatNumber);
				return true;
			} else {
				
				return false;
				
			}
		}

		public String getSeatNumber() {
			return seatNumber;
		}
		
		public double getPrice() {
			return price;
		}

		@Override
		public int compareTo(Seat o) {
			return this.seatNumber.compareTo(o.getSeatNumber());
		}
		
		
		
		
	}
	
	
	
	

}
