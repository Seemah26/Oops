package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class Gambler {

	public static void main(String[] args) {
		System.out.println("enter stake");
		int stake=FunctionalLogic.getInt();
		
		System.out.println("enter goals");
		int goal=FunctionalLogic.getInt();
		
		System.out.println("enter trials");
		int trials=FunctionalLogic.getInt();
        
        FunctionalLogic.gambler_function(stake, goal, trials);
	}
}
