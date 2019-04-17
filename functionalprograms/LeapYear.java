package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("enter a year to check it is leap year or not");
		int Year=FunctionalLogic.getInt();
		if(Year>999)
		{
		 boolean isLeap= FunctionalLogic.LeapYear2(Year);
		
	     if(isLeap==true) 
		 System.out.println("year is leap");
			 
	     else
		 System.out.println("year is not leap");	
		}
		else
			System.out.println("please enter 4 digit number");
}
}