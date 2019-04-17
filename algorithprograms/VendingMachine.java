package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.AlgorithmUtil;

public class VendingMachine {

	public static void main(String[] args) {

		System.out.println("enter amoumt");
		int value = AlgorithmUtil.getInt();
		notes(value);
	}

	static int i, total;
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	static void notes(int value) {
		if (value / notes[i] != 0) {
			total += (value / notes[i]);
			System.out.println(notes[i] + "rs notes :" + value / notes[i]);
			value = value % notes[i];
		}
		i++;
		if (value == 0) {
			System.out.println("Total notes :" + total);
			return;
		}
		notes(value);
	}
}