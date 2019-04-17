package com.bridgelabz.util.datastructure;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Datastructure {
	private static Scanner scanner=new Scanner(System.in);
	public static int getInt() {
		return scanner.nextInt();
	}
	public static String getString() {
		return scanner.next();
	}
	public static double getDouble() {
		return scanner.nextDouble();
	}
	public static ArrayList<Integer> prime() {
		ArrayList<Integer> prime=new ArrayList<Integer>();
	String primeNumbers =" ";
	for (int i = 0; i <= 1000; i++) {
		int counter = 0;
		for (int j = i; j >= 1; j--) {
			if (i % j == 0) {
				counter = counter + 1;
			}
		}
		if (counter == 2) {
			prime.add(i);
		}
	}

	//System.out.println(primeNumbers);
	return prime;
}
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static boolean areParenthesisBalanced(char[] ch) {

		StackImplementation<Character> st = new StackImplementation<Character>();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
				st.push(ch[i]);

			else if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {

				if (st.isEmpty()) {
					return false;
				}
  if (!isMatchingPair((char)st.pop(), ch[i])) {
					return false;
				}
			}
		}
		if (st.isEmpty())
			return true;
		else {
			return false;
		}
	}

	public static int dayOfWeek(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	/**
		 *static function to print the prime numbers for the given range
		 * 
		 * @param m the integer that represents the lower bound of the range
		 * @param n the integer that represents the upper bound of the range
		 * @return list of integers that are prime numbers between the range
		 */
		public static ArrayList<Integer> primeNumbers(int m,int n) {
			ArrayList<Integer> lst=new ArrayList<Integer>();
			int temp;

			//swapping of bounds if the given lower bound is greater than upper bound
			if(m>n) {
				temp=m;
				m=n;
				n=temp;}
			int flag=1;
			//try all the possible values from lower bound to upper bound
			//if the number has the factor then it must be checked within lower bound
			for(int i=m;i<=n;i++){
				for(int j=2;j<i;j++){
					//If the number is divisible by any of the number then 
					//initializing flag to zero and break
					//else flag is initialized to one
					if(i%j==0){
						flag=0;
						break;}
					else
						flag=1;}
				//If the number is prime which is indicated by the flag,
				//then adds the number into an ArrayList.
				if(flag==1)
					lst.add(i);}
			return lst;
			}
		public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
	 // return true if the given year is a leap year
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }
	    /**
		 * to find number of total number of BST that can be performed
		 * @param n double type
		 * @return double type result 
		 */
		public static double binaryCount(int n) {
			double c = binomialCoeff(2 * n, n);
			double count = c / (n + 1);
			return count;
	}
		/**
		 * to find out binomial co-efficient of number
		 * @param n double type number
		 * @param k double type number
		 * @return double type result
		 */
		public static double binomialCoeff(double n, double k) {
			int res = 1;
		    if (k > n - k) 
		        k = n - k;  
			for (int i = 0; i < k; ++i) {
				res *= (n - i);
				res /= (i + 1);
			}
			return res;		
	}
		
	
	public static boolean isAnagram(String word, String anagram) {
			boolean isAnagram = false;

			if (word != null && anagram != null && word.length() == anagram.length()) {
				char[] arr = word.toCharArray();
				StringBuilder temp = new StringBuilder(anagram);
				//int wordLength = FunctionalUtility.readInteger();
				for (char ch : arr) {
					int index = temp.indexOf("" + ch);
					if (index != -1) {
						temp.deleteCharAt(index);
					}
				}
				isAnagram = temp.toString().isEmpty();
			}
			return isAnagram;
		}
	
	public static Set<Integer> primeAnagram(java.util.List<Integer> primenumbers) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primenumbers.size(); i++) {
			for (int j = i+1; j < primenumbers.size(); j++) {
				if (isAnagram(String.valueOf(primenumbers.get(i)), String.valueOf(primenumbers.get(j)))) {
					primeAnagram.add(primenumbers.get(i));
					primeAnagram.add(primenumbers.get(j));
				}
			}
		}
		return primeAnagram;
	}
	public static  StackImplementation<Integer> primeAnagram1(java.util.List<Integer>  primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (StackImplementation<Integer>) primeAnagram;
	}


	/*	public static Set<Integer> primeAnagrams() {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			System.out.println();
			boolean b;
			for (int j = 2; j <= 1000; j++) {
				b = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						b = false;
						break;
					}
				}
				if (b)
					ar.add(j);
			}
			for (int i = 0; i < ar.size(); i++) {
				for (int j = i + 1; j < ar.size(); j++) {
					if (anagram(ar.get(i), ar.get(j))) {
						System.out.println(ar.get(i) + "  " + ar.get(j));
					}
				}
			}
			return null;			
		}
		private static boolean anagram(Integer n1,Integer n2){
			int[] n1count = count(n1);
			int[] n2count = count(n2);
			for (int i = 0; i < n2count.length; i++) {
				if (n1count[i] != n2count[i]) {
					return false;
				}
			}
			return true;
		}
		public static int[] count(int n) {
			int[] count = new int[10];
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				count[r]++;
				temp = temp / 10;
			}
			return count;
		}*/
		
}


