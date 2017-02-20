package com.array.challange;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void getIntegers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element at position " + i + " is " + array[i]);
		}
	}
	
	public static int[] sortIntegers(int[] array) {
		int[] result = new int[array.length];
		int counter = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			int highestElement = array[0];
			int highestElementIndex = 0;
			for (int j = 1; j < array.length; j++) {
				if (array[i] > highestElement) {
					highestElement = array[i];
					highestElementIndex = j;
				}
			}
			array[highestElementIndex] = -1;
			result[counter] = highestElement;
			counter++;
		}
		return result;
	}
	
	public static int[] sortIntegersV2(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = array[i];
		}
		
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length-1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
				
			}
		}
		return sortedArray;
	}
	
	public static void main(String[] args) {
		int[] myArr = new int[5];
		getIntegers(myArr);
		printArray(myArr);
		int[] sortedArr = sortIntegers(myArr);
		printArray(sortedArr);
		
	}

}
