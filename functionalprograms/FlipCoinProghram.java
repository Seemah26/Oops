package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class FlipCoinProghram {

	public static void main(String[] args) {
		System.out.println("enter the number of flips");
        int flips=FunctionalLogic.getInt();
        FunctionalLogic.Toss(flips);   
	}
}