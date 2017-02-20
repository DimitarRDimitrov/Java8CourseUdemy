package com.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Player tim = new Player("Tim", 10, 15);
		System.out.println(tim.toString());
		saveObject(tim);
		
		tim.setHitPoints(8);
		System.out.println(tim);
		tim.setWeapon("Stormbringer");
		saveObject(tim);
//		loadObject(tim);
		System.out.println(tim);
		
		ISaveable werewolf = new Monster("Werewolf", 20, 40);
		System.out.println(werewolf);
		saveObject(werewolf);
		System.out.println(((Monster) werewolf).getStrength());
		
		
	}

	public static void saveObject(ISaveable objectToSave) {
		for (int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
		}
	}

	public static void loadObject(ISaveable objectToLoad) {
		List<String> values = readValues();
		objectToLoad.read(values);
	}


	public static List<String> readValues() {
		List<String> values = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");

		while(!quit) {
			System.out.print("Choose an option:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice)  {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.println("Enter the string: ");
				String stringInput = scanner.nextLine();
				values.add(index, stringInput);
				index++;
				break;
			}
		}
		scanner.close();
		return values;
	}

}
