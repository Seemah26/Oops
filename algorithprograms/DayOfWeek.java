package com.bridgelabz.algorithprograms;

public class DayOfWeek {

	public static void main(String[] args) {

		System.out.println("enter date in day month year");
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		System.out.println("day is " + dayOfWeek(d, m, y));
	}

	public static int dayOfWeek(int d, int m, int y) {
		int d0=0;
		if(m>0&& m<=12) {
			if(d>0&&d<=31)
			{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		 d0 = (d + x + (31 * m0) / 12) % 7;
		
			}
		}
		return d0;
		
	}
	
}
