package com.primitiveAndObjectDataTypes.main;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayChallenges {

	public static void main(String[] args) {
		
//		printAndReadArrays();
//		printNegativeArrayElements();
//		printSumOfArrayElements();
//		printMininumAndMaximumElements();
//		printSecondLargestMaximumElement();
//		getOddAndEvenNumbers();
//		getArrayCopy();
//		insertArrayElement();
//		deleteArrayElement();
//		getElementFrequency();
//		getUniqueElements();
		getTotalDuplicates();
//		deleteDuplicateElements();

	}
	
	private static void printAndReadArrays() {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	private static void printNegativeArrayElements() {
		
		int[] numbers = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
		
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
	}
	
	private static void printSumOfArrayElements() {
		
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}
	
	private static void printMininumAndMaximumElements() {
		
		int [] numbers = new int [10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*100);
			System.out.println(numbers[i]);
		}
		int min = numbers[0];
		int max = numbers[0];
		int minIndex = 0;
		int maxIndex = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				minIndex = i;
			}
			if(numbers[i] > max) {
				max = numbers[i];
				maxIndex = i;
			}
				
		}
		System.out.println();
		System.out.println("The minimum number is " + min + " and the position is " + minIndex);
		System.out.println("The maximum numbers is " + max + " and the position is " + maxIndex);	
	}
	
	private static void printSecondLargestMaximumElement() {
		
		int [] numbers = new int [10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*100);
			System.out.println(numbers[i]);
		}
		int max = numbers[0];
		int maxIndex = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
				maxIndex = i;
			}
				
		}
		
		int secondMax = 0;
		int secondMaxIndex = 0;
		for(int j = 0; j < numbers.length; j++) {
			if(numbers[j] > secondMax && max != numbers[j]) {
				secondMax = numbers[j];
				secondMaxIndex = j;
			}
		}
		
		System.out.println();
		System.out.println("The maximum number is " + max + " and the position is " + maxIndex);
		System.out.println("The second maximum number is " + secondMax + " and the position is " + secondMaxIndex);
	}
	
	private static void getOddAndEvenNumbers() {
		int [] numbers = new int [10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
			System.out.println(numbers[i]);
		}
		
		int evenNumbers = 0;
		int oddNumbers = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 ==0)
				evenNumbers++;
			else
				oddNumbers++;
		}
		System.out.println("even counter = " + evenNumbers);
		System.out.println("odd counter = " + oddNumbers);
		
	}
	
	private static void getArrayCopy() {
		int[] arrayA = new int [10];
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random() * 100);
			System.out.println(arrayA[i]);
		}
		
		System.out.println();
		
		int[] arrayB = new int [arrayA.length];
		for(int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[i];
			System.out.println(arrayB[i]);
		}
		
		System.out.println();
		System.out.println(arrayA.hashCode());
		System.out.println(arrayB.hashCode());
		
		System.out.println();
		System.out.println(Arrays.toString(arrayA));
		
	}
	
	private static void insertArrayElement() {
		int[] arrayA = new int [10];
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(arrayA));
		
		arrayA[(int) (Math.random()*10)] = (int)(Math.random()*100);
		
		System.out.println(Arrays.toString(arrayA));
		System.out.println();
	}
	
	private static void deleteArrayElement() {
		int [] arrayA = new int [10];
		int deleteElement;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arrayA));
		
		do {
			System.out.printf("Delete an element based on position from the following array (" + 0 + " - " + (arrayA.length-1) + "): ");
			deleteElement = sc.nextInt();
			if(deleteElement >= 0 && deleteElement < arrayA.length) {
				arrayA[deleteElement] = 0;
		} 
		} while(deleteElement < 0 && deleteElement >= arrayA.length);
		System.out.println(Arrays.toString(arrayA));
	}
	
	private static void getElementFrequency() {
		int [] arrayA = new int [20];
		int counter;
		int currentElement = 0;
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random()*100);
			System.out.print(arrayA[i]);
			System.out.print("\n");
		}
		
		int [] arrayB = new int [arrayA.length];
		
		for(int i = 0; i < arrayA.length; i++) {
			currentElement = arrayA[i];
			counter = 0;
				for(int j = 0; j < arrayA.length; j++) {
					arrayB[j] = arrayA[j];
					if(currentElement == arrayB[j]) {
						counter++;
					}
				}
			System.out.println(currentElement + " appears " + counter + " time(s)." );
				
			}

		}
	
	private static void getUniqueElements() {
		int [] arrayA = new int [20];
		int index = 0;
		int counter;
		int currentElement = 0;
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random()*100);
			System.out.print("Index " + index + ": " + arrayA[i]);
			System.out.print("\n");
			index = index + 1;
		}
		
		int [] arrayB = new int [arrayA.length];
		
		for(int i = 0; i < arrayA.length; i++) {
			currentElement = arrayA[i];
			counter = 0;
				for(int j = 0; j < arrayA.length; j++) {
					arrayB[j] = arrayA[j];
					if(currentElement == arrayB[j]) {
						counter++;
					}
				}
			if (counter == 1)	
				System.out.println(currentElement + " appears " + counter + " time(s)." );
				
			}
	}
	
	private static void getTotalDuplicates() {
		
		int [] arrayA = new int [20];
		int i, j;
		int index = 0;
		boolean elementHasDuplicate;
		int counter = 0;
		int sumDuplicates = 0;
		
		for(i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int)(Math.random()*100);
			System.out.println("Index: [" + index + "] = " + arrayA[i]);
			index = index + 1;
		}
		
		
		index = 0;
		for(i = 0; i < arrayA.length; i++) {
			counter = 0;
			for(j = 0; j < arrayA.length; j++) {
				elementHasDuplicate = arrayA[i] == arrayA[j];
				if(elementHasDuplicate == true) {
					counter++;
				}
				if (counter > 1) {
					System.out.println("Element: " + arrayA[i] + " in Index[" + index + "]" + " has duplicates." );
				}
			}
			if(counter > 1) {
				sumDuplicates = sumDuplicates + 1;
			}
			index = index + 1;
		}
		sumDuplicates = sumDuplicates / 2;
		System.out.println("There is/are " + sumDuplicates + " element(s) with duplicates.");
	}
	
	private static void deleteDuplicateElements() {
		
		int [] arrayA = new int [20];
		int i, j;
		int index = 0;
		
		for(i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int)(Math.random()*100);
			System.out.println("Index[" + index + "] = " + arrayA[i]);
			index++;
		}
		
		index = 0;
		int counter;
		for(i = 0; i < arrayA.length; i++) {
			counter = 0;
			for(j = 0; j < arrayA.length; j++) {
				if(arrayA[i] == arrayA[j]) {
					counter++;
				}
			}
			if (counter > 1) {
				arrayA[i] = 0;
			}
		}
		
	}
		 
}

		


