package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.AlgorithmUtil;

public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("Enter the value of N: ");
		int N = AlgorithmUtil.getInt();
		String[] arr = new String[N];
		System.out.println("Enter Strings : ");
		for (int i = 0; i < N; i++) {
			arr[i] = AlgorithmUtil.getString();
		}
		int n = arr.length;
		sort_sub(arr, n);
		System.out.println("Sorted array: ");

		String sortedArray[] = sort_sub(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

	public static String[] sort_sub(String array[], int n) {
		String temp = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
