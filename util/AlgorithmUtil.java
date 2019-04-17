package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class AlgorithmUtil {
	private static Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		return scanner.nextInt();
	}

	public static String getString() {
		return scanner.next();
	}

	public static double getDouble() {
		return scanner.nextDouble();
	}

	/**
	 * primeNumbers
	 * @param start
	 * @param end
	 * @return 
	 */
	public static List<Integer> primeNumbers(int start, int end) {
		List<Integer> lst = new ArrayList<Integer>();
		int flag = 1;
		for (int i = start + 2; i < end; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			if (flag == 1) {
				lst.add(i);
			}
		}
		return lst;
	}

	/**
	 * anagramPrime
	 * @param new_lst
	 * @return
	 */
	public static Set<String> anagramPrime(List<String> new_lst) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < new_lst.size(); i++) {
			for (int j = i + 1; j < new_lst.size(); j++) {
				if (isAnagram(new_lst.get(i), new_lst.get(j))) {
					set.add(new_lst.get(i));
					set.add(new_lst.get(j));
					System.out.println(new_lst.get(i) + "  " + new_lst.get(j));
				}
			}
		}
		return set;
	}

	/**
	 * check whether two are string anagram 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagram(String str1, String str2) {
		char[] array1 = str1.toCharArray();
		char temp1, temp2;
		char[] array2 = str2.toCharArray();
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			return false;
		} else {
			for (int i = 0; i < len1; i++) {
				for (int j = 0; j < len1 - 1; j++) {
					if (array1[j] > array1[j + 1]) {
						temp1 = array1[j];
						array1[j] = array1[j + 1];
						array1[j + 1] = temp1;
					}
				}
			}
			for (int i = 0; i < len2; i++) {
				for (int j = 0; j < len2 - 1; j++) {
					if (array2[j] > array2[j + 1]) {
						temp2 = array2[j];
						array2[j] = array2[j + 1];
						array2[j + 1] = temp2;
					}
				}
			}
			str1 = String.valueOf(array1);
			str2 = String.valueOf(array2);
			if (str1.equals(str2))
				return true;
			else
				return false;
		}
	}

	/**
	 * palindromPrime
	 * @param new_lst
	 * @return
	 */
	public static Set<String> palindromPrime(List<String> new_lst) {
		Set<String> pal_set = new HashSet<>();
		Iterator<String> itr = new_lst.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (isPalindrom(str)) {
				pal_set.add(str);
			}
		}
		return pal_set;
	}

	/**
	 * check input is palindrom or not 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrom(String str) {
		char temp;
		int begin = 0;
		int end = str.length() - 1;
		String rev_str = str;
		char[] array = str.toCharArray();
		while (begin <= end) {
			temp = array[begin];
			array[begin] = array[end];
			array[end] = temp;
			begin++;
			end--;
		}
		String new_str = String.valueOf(array);
		if (rev_str.equals(new_str))
			return true;
		else
			return false;
	}

	/**binary search
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binary(String[] arr, String key) {
		{
			int first = 0;
			int last = arr.length;

			while (first < last) {
				int mid = (first + last) / 2;
				if (key.compareTo(arr[mid]) < 0) {
					last = mid;
				} else if (key.compareTo(arr[mid]) > 0) {
					first = mid + 1;
				} else {
					return mid;
				}
			}
			return -1;
		}

	}

	public static <T extends Comparable<T>> T[] binary(T[] array, T key) {
		int length = array.length;
		int first = 0;
		int last = length - 1;
		int middle = (first + last) / 2;
		while (first <= last) {
			if (key.compareTo(array[middle]) > 0) {
				first = middle + 1;
			}

			else if (array[middle].equals(key)) {
				System.out.println(key + "-found at location-" + middle);
				break;
			} else {
				last = middle - 1;
			}
		}
		return array;
	}

	public static String[] input1DStringArray(int arraySize) {
		String array[] = new String[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter array[" + i + "] : ");
			array[i] = getString();
		}
		return array;

	}

	// Bubble sort
	public static <T extends Comparable<T>> T[] bubble(T[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[i].compareTo(array[j]) < 0) {

					T temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}

			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		return array;

	}

	// Binary Search for String
	public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
		int first = 0;
		int last = array.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (key.compareTo(array[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(array[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	// Insertion sort

	public static <T extends Comparable<T>> T[] inserstionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					T temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else
					break;
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		return array;
	}

}
