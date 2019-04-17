package com.bridgelabz.algorithprograms;

public class MonthlyPayment {

	public static void main(String[] args) {

		System.out.println("enter principal ,year and rate");

		Double p = Double.parseDouble(args[0]);
		Double y = Double.parseDouble(args[1]);
		Double r = Double.parseDouble(args[2]);
		System.out.println("mothly payment is " + monthlyPayment(p, y, r));
	}

	private static double monthlyPayment(double p, double y, double r) {

		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}

}