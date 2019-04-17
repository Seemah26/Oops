package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.AlgorithmUtil;

public class MergSort {
	public static void main(String[] args) {

		System.out.println("Enter the value of N: ");
		int N = AlgorithmUtil.getInt();
		String[] array = new String[N];
		System.out.println("Enter Strings : ");
		for (int i = 0; i < N; i++) {
			array[i] = AlgorithmUtil.getString();
		}

		int n = array.length;

		mergeSort(array);
		for (int j = 0; j < n; j++) {
			System.out.println(array[j]);
		}
	}

	public static void mergeSort(String[] array) {
		if (array.length >= 2) {

			String[] left = new String[array.length / 2];
			String[] right = new String[array.length - array.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = array[i];
			}
			for (int i = 0; i < right.length; i++) {
				right[i] = array[i + array.length / 2];
			}
			mergeSort(left);
			mergeSort(right);
			merge(array, left, right);
		}
	}

	public static void merge(String[] array, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < array.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				array[i] = left[a];
				a++;
			} else {
				array[i] = right[b];
				b++;
			}
		}
	}
}
