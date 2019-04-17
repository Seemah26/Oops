package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of n");
        int n=FunctionalLogic.getInt();
        if(n!=0)
        FunctionalLogic.generate_harmonicseries(n);
        else
        	System.out.println("please enter non zero number");
	}
}