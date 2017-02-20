package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in);
	
	private static GroceryList groceryList = new GroceryList();
	
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - to print choice options.");
		System.out.println("\t 1 - to print list of grocery items");
		System.out.println("\t 7 - to quit");
	}
	
	public static void addItem() {
		System.out.println("Please enter the grocery item: ");
		groceryList.addGroceryItem(s.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("Current item name: ");
		String itemNumber = s.nextLine();
		s.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = s.nextLine();
		groceryList.modifyGroceryItem(itemNumber, newItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter item number: ");
		String itemNumber = s.nextLine();
		groceryList.removeGroceryItem(itemNumber);
	}
	
	public static void searchForItem() {
		System.out.println("Item to search for: ");
		String searchedItem = s.nextLine();
		if(groceryList.onFile(searchedItem)) {
			System.out.println("Found " + searchedItem + " in the grocery list.");
		} else {
			System.out.println(searchedItem + " is not in the list");
		}
	}
	
	
	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<>();
		newArray.addAll(groceryList.getGroceryList());
		
//		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
		
		String[] myArray = new String[groceryList.getGroceryList().size()];
		myArray = groceryList.getGroceryList().toArray(myArray);
	}
	
	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = s.nextInt();
			s.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				processArrayList();
				break;
			case 7:
				quit = true;
				break;
			}
		}
		
	}

}
