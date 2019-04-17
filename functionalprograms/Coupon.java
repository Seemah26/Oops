package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Coupon {

	public static void main(String[] args) {
		System.out.println("enter the value of n");
		int n = FunctionalLogic.getInt();
		int count = FunctionalLogic.collect(n);
		System.out.println(count);
	}
}