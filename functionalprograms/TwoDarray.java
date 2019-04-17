package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class TwoDarray {

	public static void main(String[] args) {
		  int row=0, col=0;
	     
	      System.out.println("Enter Number of Row for Array : \n");
	      row = FunctionalLogic.getInt();
	      System.out.println("Enter Number of Row for Array : \n");
	      col= FunctionalLogic.getInt();
	      System.out.println("row number = "+row+" and "+"column number = "+col);
	      FunctionalLogic.array(row,col);
	}
}
