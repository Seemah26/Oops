package com.bridgelabz.algorithprograms;

import java.util.Scanner;

public class BinaryNibbleSwap {
	static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	static boolean powerOf2(int n) {
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	
	static int[] swapNibbles(int[] arr) {
				int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	
	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter a no");
			int[] binary = toBinary(s.nextInt());
			System.out.println("binary is ");
			showArr(binary);
		
			swapNibbles(binary);
			System.out.println("after swapping ");
			showArr(binary);
			int swapDec = toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}

// Function to convert decimal to binary//
	/**
	 * @param d
	 * @return
	 */
	public static int[] toBinary(int d) {
		String bin = "";
		while (d != 0) {
			bin = (d % 2) + bin;
			d /= 2;
		}

		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntArray(bin);

	}

	
	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	// Function to convert binary to decimal//
		public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;

	}
}
