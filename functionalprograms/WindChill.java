package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class WindChill {

	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        double w= FunctionalLogic.wind(t, v);
        System.out.println("Wind chill  = "+w);
       }
	}