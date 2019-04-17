package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;

public class Quadratic {
//main method
	public static void main(String[] args) {
		System.out.println("enter the value of a");
	    int a=FunctionalLogic.getInt();
	    
        System.out.println("enter the value of b");
        int b=FunctionalLogic.getInt();
        
        System.out.println("enter the value of b");
        int c=FunctionalLogic.getInt();
        
        //calling method to calculate roots
        FunctionalLogic.findRoots(a, b, c);
        
	}
}