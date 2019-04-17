package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class StopWatch {

	public static void main(String[] args) {	
	long start = System.nanoTime();
	System.out.println("start time:"+start);
	long end = System.nanoTime();
	System.out.println("end time : "+end);
	double result=FunctionalLogic.elapse(start,end);
	System.out.println("elapsed time :"+result);
	}	
}