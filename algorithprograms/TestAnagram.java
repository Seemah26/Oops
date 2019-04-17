package com.bridgelabz.algorithprograms;

import java.util.Arrays;

import com.bridgelabz.util.AlgorithmUtil;
import com.bridgelabz.util.FunctionalLogic;

public class TestAnagram<T> {
	public static <T extends Comparable<T>> boolean areAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println("enter a first string ");
		String firstString = FunctionalLogic.getString();
		char[] s = firstString.toCharArray();
		System.out.println("enter a second string ");
		String secondString = FunctionalLogic.getString();
		char[] r = firstString.toCharArray();

		if (areAnagram(s, r))
			System.out.println("The two strings are anagram of each other");

		else
			System.out.println("The two strings are not anagram of each other");
	}
}
