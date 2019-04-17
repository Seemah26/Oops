package com.bridgelabz.algorithprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmUtil;

public class Prime {

		/*
		* The main function is written to take input from the user and
		* call the primeNumber() function that finds prime numbers
		*/
		public static void main(String[] args) {
			List<Integer> lst=new ArrayList<>();
			int start=0;
			int end=1000;
			//Method 1- using static function of AlgorithmUtility class of
			//com.bridgelabz.util package
			lst=AlgorithmUtil.primeNumbers(start,end);
			
			for(int i:lst)
				System.out.println(i);
			}
			
	}

