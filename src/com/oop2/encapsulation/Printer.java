package com.oop2.encapsulation;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;
	
	public Printer(int tonerLevel, boolean isDuplex) {
		if (tonerLevel > 100) {
			this.tonerLevel = 100;
		} else if (tonerLevel < 0) {
			this.tonerLevel = 0;
		} else this.tonerLevel = tonerLevel;
		this.pagesPrinted = 0;
		this.isDuplex = isDuplex;
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(this.isDuplex) {
			pagesToPrint /= 2;
			if(pages % 2 != 0) {
				pagesToPrint++;
			}
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	
	public int fillToner(int amount) {
		if(amount > 0 && tonerLevel <= 100) {
			if(this.tonerLevel + amount > 100) {
				return -1;
			}
			this.tonerLevel += amount;
			return this.tonerLevel;
		} else {
			return -1;
		} 
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return isDuplex;
	}
	
	
	
	
	

}
