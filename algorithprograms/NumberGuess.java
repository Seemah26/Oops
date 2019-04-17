package com.bridgelabz.algorithprograms;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("guess a no between 0 to 127 ");
		S.next();
			System.out.println("guessed no is " + find());
		} 

	static int find() {
		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			Scanner ref= new Scanner(System.in);
			int c = ref.nextInt();

			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}
}