package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;

public class DistanceFromOrigin {

	public static void main(String[] args) {
		 int x = Integer.parseInt(args[0]);
	     int y = Integer.parseInt(args[1]);
	     double distance=  FunctionalLogic.calculateDistance(x, y);
	     System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);

	}

}