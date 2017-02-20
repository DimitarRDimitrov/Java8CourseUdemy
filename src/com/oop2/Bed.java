package com.oop2;

public class Bed {
	private String syle;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;
	
	public Bed(String syle, int pillows, int height, int sheets, int quilt) {
		super();
		this.syle = syle;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}

	public String getSyle() {
		return syle;
	}

	public int getPillows() {
		return pillows;
	}

	public int getHeight() {
		return height;
	}

	public int getSheets() {
		return sheets;
	}

	public int getQuilt() {
		return quilt;
	}
	
	public void make() {
		System.out.println("BED - MAKING");
	}
	
	

}
