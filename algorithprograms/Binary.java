package com.bridgelabz.algorithprograms;  
import com.bridgelabz.util.AlgorithmUtil;

public class Binary {
	public static void main(String[] args) {
		System.out.println("Enter a decimal number to convert it into binary");
		int n = AlgorithmUtil.getInt();
		decToBinary(n);
	}

	static void decToBinary(int n) {

		int[] binaryNum = new int[1000];
	int i = 0;
		while (n > 0) {

	binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			  System.out.print(binaryNum[j]);
	}
}
