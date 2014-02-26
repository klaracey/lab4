package Sorting;

import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Generates a random array
		int[] unsortedArray = new int[(int) (Math.random()*20.0)];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = (int) (Math.random()*20.0);
		}
		
		System.out.println("Unsorted Array:");
		
		for (int i: unsortedArray) {
				System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("Sorted Array:");
		System.out.println("Array sorted by insertion sort:");
		// insertion sort here

		System.out.println("Array sorted by bubble sort:");
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(unsortedArray)));
		//TODO: sort the array and print out its contents
		
		int[] insertionSorted = InsertionSort.insertionSort(unsortedArray);
		for (int i: insertionSorted) {
				System.out.print(i + " ");
		}
	}

}
