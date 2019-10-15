package com.exercise10sequencialsearch.app;
import java.util.Random;
import java.util.Scanner;

public class SequencialSearchNonGreedy {

	public static void main(String[] args) {
		final int ELEMENTS_ARRAY = 100;
		int[] vector = new int[ELEMENTS_ARRAY];
		int numberToFind = 0;
		boolean found = false;
		
		Random numbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//Add pseudo random numbers to the array
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			vector[i] = numbers.nextInt(101);
		}
		
		//display array
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.print(vector[i] + " ");
		}
		
		do {
			System.out.println("\nEnter the number that you want to find:");
			numberToFind = input.nextInt();
			if(numberToFind< 0) {
				System.out.println("Number must be greater than or equal to 0");
			}
		}while(numberToFind < 0);
		
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			if(numberToFind == vector[i]) {
				System.out.println(numberToFind + " was found at " + "position #" + i);
				found = true;
			}
			if(found) {
				break;
			}
		}

		input.close();
	}
}
