package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.AlgorithmUtil;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort ref = new BubbleSort();

		System.out.println("enter the number of elements");
		int n = AlgorithmUtil.getInt();
		int[] arr = new int[n];
		System.out.println("enter next element");
		for (int i = 0; i < n; i++) {
			arr[i] = AlgorithmUtil.getInt();
		}
		ref.bubbleSort(arr);
		System.out.println("Sorted array");
		ref.printArray(arr);
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

}