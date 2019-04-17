package com.bridgelabz.algorithprograms;

import com.bridgelabz.util.AlgorithmUtil;
import com.bridgelabz.util.FunctionalLogic;

public class Anagram {

	public static void main(String[] args) {
System.out.println("Enter a string");
		
		//Reading input two input strings from user
		String str1=AlgorithmUtil.getString();
		System.out.println("Enter another string to detect anagram");
		String str2=AlgorithmUtil.getString();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		boolean res=AlgorithmUtil.isAnagram(str1,str2);
		if(res) {
			System.out.println("The strings are anagram");
		}
		else
			System.out.println("The strings are not anagram");
	}
}
