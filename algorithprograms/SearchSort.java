
package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.AlgorithmUtil;

public class SearchSort {

	public static long start = 0;
	public static long end = 0;
	public static long elapsed;
	static int ch = 0;

	public static void main(String[] args) {
		do {
			System.out.println("--------Menu for Searching and Sorting----------");
			System.out.println("1. BinarySearch  for String");
			System.out.println("2. InsertionSort  for String");
			System.out.println("3. BubbleSort for String");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			int choice = AlgorithmUtil.getInt();
			System.out.println();

			switch (choice) {
			case 1:
				start = System.currentTimeMillis();
				System.out.println("BinarySearch  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize1 = AlgorithmUtil.getInt();

				String array[] = AlgorithmUtil.input1DStringArray(arraySize1);
				System.out.println("The resultant array is :");
				AlgorithmUtil.bubble(array);
				System.out.println("Enter Key: ");
				String key = AlgorithmUtil.getString();
				int position1 = AlgorithmUtil.binarySearch(array, key);
				if (position1 == -1) {
					System.out.println("Not Found");
				} else {
					System.out.println("Found at " + position1 + " position");
				}
				end = System.currentTimeMillis();
				elapsed = end - start;
				System.out.println("Total Elapsed Time is: " + elapsed);
				System.out.println();
				break;
			case 2:
				start = System.currentTimeMillis();
				System.out.println("InsertionSort  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize2 = AlgorithmUtil.getInt();
				String array2[] = AlgorithmUtil.input1DStringArray(arraySize2);
				System.out.println("Sorted Array is: ");
				AlgorithmUtil.inserstionSort(array2);
				end = System.currentTimeMillis();
				elapsed = end - start;
				System.out.println("Total Elapsed Time is: " + elapsed);
				System.out.println();
				break;
			case 3:
				start = System.currentTimeMillis();
				System.out.println("BubbleSort  For String");
				System.out.println("Enter number of words to be sorted: ");
				int arraySize3 = AlgorithmUtil.getInt();
				String array3[] = AlgorithmUtil.input1DStringArray(arraySize3);
				System.out.println("Sorted Array is: ");
				AlgorithmUtil.bubble(array3);
				end = System.currentTimeMillis();
				elapsed = end - start;
				System.out.println("Total Elapsed Time is: " + elapsed);
				System.out.println();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong Input");
				break;
			}
		} while (ch < 5);
	}

}
