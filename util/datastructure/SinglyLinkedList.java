package com.bridgelabz.util.datastructure;

import java.util.Scanner;

public class SinglyLinkedList<T> {
	public Node<T> head;
	public Node<T> tail;
	public int size = 0;
	static String[] str = new String[100];
	static SinglyLinkedList<String> newList = new SinglyLinkedList<String>();

	public boolean isEmpty() {
		return head == null;
	}
	public String addElement(T key) {
		Node<T> nd = new Node<T>();
		nd.setValue(key);
		size++;

		/**
		 * check if the list is empty
		 */
		if (isEmpty()) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
		}
		return null;
	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	@Override
	public String toString() {
		Node<T> temp = head;
		String elements = "";
		while (temp.getNextRef() != null) {
			elements += " "+ temp.getValue() +" ";
			temp = temp.getNextRef();
		}
		return elements + temp.getValue();
	}

	public void get() {

		Node<T> tmp = head;
		int k = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			str[k] = String.valueOf(tmp.getValue());
			k++;
			tmp = tmp.getNextRef();
		}
	}

	@SuppressWarnings("unchecked")
	public SinglyLinkedList<T> searchKey(SinglyLinkedList<T> list, String key) {
		Node<T> current = head;
		boolean status = false;
		
		Node<T> temp = current.getNextRef();
		
		if (current.getValue().equals(key)) {
			 head = temp;
			status = true;
		}

		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				str[i] = null;
				current = current.getNextRef();
				break;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null)
				newList.addElement(str[i]);
		}
		if (status) {
			System.out.println("Element is present in the list ");
		} else {
			System.out.println("Element is not present in the list ");
			newList.addElement(key);
		}
		return (SinglyLinkedList<T>) newList;
	}
	 static String[] bubbleSort(String[] array) {
			for (int j = 0; j < array.length; j++) {
				for (int i = j + 1; i < array.length; i++) {
					// comparing strings
					if (array[i].compareTo(array[j]) < 0) {

						String temp = array[j];
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
		private Node<T> head1;

		/*
		 * tail of the type Node<T> is declared private to achieve encapsulation
		 */
		private Node<T> tail1;

		/**
		 * Constructos to initialize the instance variable head
		 */
		public SinglyLinkedList() {
			head = null;
		}

		/**
		 * static object is created for Scanner class to avoid multiple object
		 * creations of the same class.
		 */
		static Scanner s = new Scanner(System.in);

		/**
		 * static function to read integers input from the user
		 * 
		 * @return integer values that are read
		 */
		public static int userInt() {
			return s.nextInt();
		}

		/**
		 * static function to read double input from the user
		 * 
		 * @return double values that are read
		 */
		public static double userDouble() {
			return s.nextDouble();
		}

		/**
		 * static function to read boolean input from the user
		 * 
		 * @return boolean values that are read
		 */
		public static boolean userBoolean() {
			return s.nextBoolean();
		}

		/**
		 * static function to read string input from the user
		 * 
		 * @return strings that are read
		 */
		public static String userString() {
			return s.next();
		}

		/**
		 * non-static function to check if the list is empty or not
		 * 
		 * @return true if list is empty else false
		 */
		public boolean isEmpty1() {
			return head == null;
		}

		/**
		 * Function to add the elements to the linked list
		 * 
		 * @param data
		 *            the element that is to be added
		 */
		public void add(T data) {
			Node<T> nd = new Node<T>();

			// Function call to set the data present in Node class
			// of com.bridgelabz.datastructureprograms
			nd.setValue(data);

			System.out.println("Adding: " + data);
			if (isEmpty()) {
				head = nd;
				tail = nd;
			} else {

				// Function call to set the data present in Node class
				// of com.bridgelabz.datastructureprograms
				tail.setNextRef(nd);
				tail = nd;
			}
		}

		/**
		 * Function to search the entered element in the list
		 * 
		 * @param data
		 *            the element that is to be searched
		 * @return true if present else false
		 */
		public boolean search(T data) {
			Node<T> temp = head;

			// Function call to get the link present in Node class
			// of com.bridgelabz.datastructureprograms
			while (temp.getNextRef() != null) {

				// Function call to get the data present in Node class
				// of com.bridgelabz.datastructureprograms
				if (data.equals(temp.getValue())) {
					return true;
				}
				temp = temp.getNextRef();
			}
			return false;
		}

		/**
		 * Function that gives the index of a specified element
		 * 
		 * @param data
		 *            the data whose index is to be found
		 * @return the index of the specified element
		 */
		public int index(T data) {
			Node<T> curr = head;
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
		public void remove(int index) {
			if (isEmpty())
				return;
			Node<T> temp = head;
			if (index == 0) {
				head = temp.getNextRef();
				return;
			}
			for (int i = 0; temp != null && i < index - 1; i++) {
				temp = temp.getNextRef();
			}
			if (temp == null || temp.getNextRef() == null)
				return;
			Node<T> next = temp.getNextRef().getNextRef();

			temp.setNextRef(next);
		}

		public T removeLink(int index) {
			if (isEmpty())
				return null;
			Node<T> temp = head;
			if (index == 0) {
				head = temp.getNextRef();
				return head.getValue();
			}
			for (int i = 0; temp != null && i < index - 1; i++) {
				temp = temp.getNextRef();
			}
			if (temp == null || temp.getNextRef() == null)
				return null;
			Node<T> next = temp.getNextRef().getNextRef();
			temp.setNextRef(next);
			return temp.getValue();
		}

	    public void getLinkedList() {
	        Node<T> tmp = head;
	        while (true) {
	            if (tmp == null) {
	                break;
	            }
	            if(tmp.getValue()!=null)
	            {
	            System.out.print(tmp.getValue()+"\t\t\t\t");
	            }
	            tmp = tmp.getNextRef();
	        }
	    }
		
		/**
		 * Function that returns the size of the linked list
		 * 
		 * @return
		 */
		public int size() {
			Node<T> tnode = head;
			int len = 0;
			while (tnode != null) {
				len++;
				tnode = tnode.getNextRef();
			}
			return len;
		}

		/**
		 * Function that converts the list into String array
		 * 
		 * @param array
		 *            the array that is empty
		 * @return the array of strings
		 */
		public String[] convArray(String[] array) {
			Node<T> tnode = head;
			int i = 0;
			while (tnode != null) {
				array[i] = String.valueOf(tnode.getValue());
				tnode = tnode.getNextRef();
				i++;
			}
			return array;
		}

		/**
		 * Function to convert the array of strings to array of integers
		 * 
		 * @param arr
		 *            the array of strings that is needed to be converted
		 * @return the array of integer
		 */
		public int[] convertIntArray(String[] arr) {
			int[] arrInt = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arrInt[i] = Integer.valueOf(arr[i]);
			}
			return arrInt;
		}

		/**
		 * Function that sorts the given array in ascending order
		 * 
		 * @param array
		 *            the array of integers that is needed to be sorted
		 * @return array of integers that is sorted
		 */
		public int[] sort(int[] array) {
			int temp;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return array;
		}

		/**
		 * Function that prints all the elements present in the linked list
		 */
		public void printList() {
			Node<T> tnode = head;
			while (tnode != null) {
				System.out.print(tnode.getValue() + " ");
				tnode = tnode.getNextRef();
			}
		}		
}