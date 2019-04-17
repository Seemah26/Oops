package com.bridgelabz.opps.commonmethods;

import java.util.Scanner;

import com.bridgelabz.listofcompanyshare.model.CompanyShare;
import com.bridgelabz.util.datastructure.Node;

public class CustomLinkedList<T> {
private static Node head;
private static Node tail;

    public CustomLinkedList() 
    {
		head = null;
	}
	static Scanner s = new Scanner(System.in);
	public static int userInt() {
		return s.nextInt();
	}
    public static double userDouble() 
    {
		return s.nextDouble();
	}
    public static boolean userBoolean() {
		return s.nextBoolean();
	}
    public static String userString() {
		return s.next();
	}
    public static boolean isEmpty() {
		return head == null;
	}

	public static void add(CompanyShare share) {
		Node nd = new Node();
        nd.setValue(share);//nd.setData(data);
        System.out.println(share);
		if (isEmpty()) {
			head = nd;
			tail = nd;
		} else {
			 tail.setNextRef(nd);  //tail.setNext(nd);
			tail = nd;
		}
	}
    public static boolean search(String data) {
		Node temp = head;

		// Function call to get the link present in Node class
		// of com.bridgelabz.datastructureprograms
		while (temp.getNextRef()!= null) {

			// Function call to get the data present in Node class
			// of com.bridgelabz.datastructureprograms
			if (temp.getValue().equals(data))
			{
				return true;
			}
			temp = temp.getNextRef();
		}
		return false;
	}
    public static int index(String data) {
		Node curr = head;
		int count = 0;
		while (curr != null) {
			if (curr.getValue().equals(data)) {
				curr.getNextRef();
				return count;
			}
			count++;
			curr = curr.getNextRef();
		}
		assert (false);
		return 0;
	}

	/**
	 * Function to remove the element of the specified index
	 * 
	 * @param index
	 *            the index of an element which is needed to be deleted
	 */
	public static void remove(int index) {
		if (isEmpty())
			return;
		Node temp = head;
		if (index == 0) {
			head = temp.getNextRef();
			return;
		}
		for (int i = 0; temp != null && i < index - 1; i++) {
			temp = temp.getNextRef();
		}
		if (temp == null || temp.getNextRef() == null)
			return;
		Node next = temp.getNextRef().getNextRef();

		temp.setNextRef(next);
	}



   
	/**
	 * Function that returns the size of the linked list
	 * 
	 * @return
	 */
	public static int size() {
		Node tnode = head;
		int len = 0;
		while (tnode != null) {
			len++;
			tnode = tnode.getNextRef();
		}
		return len;
	}

	
	public static String[] convArray(String[] array) {
		Node tnode = head;
		int i = 0;
		while (tnode != null) {
			array[i] = String.valueOf(tnode.getValue());
			tnode = tnode.getNextRef();
			i++;
		}
		return array;
	}

	
	public static int[] convertIntArray(String[] arr) {
		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.valueOf(arr[i]);
		}
		return arrInt;
	}

	
	public static int[] sort(int[] intArray) {
		int temp;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	
	public static void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.getValue() + " ");
			tnode = tnode.getNextRef();
		}
	}
	

}