package com.exercise10sequencialsearch.app;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		final int ELEMENTS_ARRAY = 10;
		int numberToFind = 0;
		int indexFound = -1;
		
		int temp=0;
		
		int limInf = 0;
		int limSup = ELEMENTS_ARRAY-1;
		int pivotal = (limSup - limInf) / 2;
		
		int[] myArray = new int[ELEMENTS_ARRAY];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		Scanner input = new Scanner(System.in);
		
		
		//Adding pseudo random numbers to the array
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			myArray[i] = randomNumbers.nextInt(101);
		}
		
		//show array elements
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(myArray[i] + " ");
		}
		
		//Constraint that the user must enter a positive number
		do {
			System.out.println("Enter the number to find in the array (0-100):");
			numberToFind = input.nextInt();
			if(numberToFind<0) {
				System.out.println("Number must be a positive value");
			}
			
		}while(numberToFind<0);
		
		//sorting algorithm
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			for(int j=0;j<ELEMENTS_ARRAY-1;j++)
			{
				if(myArray[j]<myArray[j+1])
				{
					temp=myArray[j+1];
					myArray[j+1]=myArray[j];
					myArray[j]=temp;
				}
			}
		}
		
		//display ordered array
		System.out.println(" ");
		//Display the disordered vector
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(myArray[i]+" ");
		}
		//Binary search algorithm
		
		while(limInf<=limSup) {
			pivotal = (limSup - limInf) / 2;
			if(numberToFind==myArray[pivotal]) {
				indexFound = pivotal;
				break;
			}else if(numberToFind>myArray[pivotal]) {
				limInf = pivotal +1;
			}else if(numberToFind<myArray[pivotal]) {
				limInf = pivotal -1;
			}
		}
		
		System.out.println(indexFound);
		
		if(indexFound!=-1) {
			System.out.println("Element found ar index: " + indexFound);
		}else {
			System.out.println("Element not present in the array! :(");
		}
		
		input.close();
	}

}
