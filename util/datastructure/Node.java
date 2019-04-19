
package com.bridgelabz.util.datastructure;


public class Node<E> {
	public E value;
	public Node<E> nextRef;
	public String data1;
	public int data;
	public Node<E> nextNode;

	Deque<E> front;
	Deque<E> rear;
	public static int size = 0;

	public Node() {
		value = null;
		nextRef = null;
	}

	public Node(E data, Node<E> next) {
		this.value = data;
		this.nextRef = next;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E share) {
		this.value = share;
	}

	public Node<E> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<E> ref) {
		this.nextRef = ref;
	}

	public Node<E> getSize() {
		return this.getSize();
	}

	public void setSize(Node<E> size) {
		this.nextRef = size;

	}

	public void addRear(E c) {
		if (front == null) // if no element in list
		{
			Deque<E> tNode = new Deque<>(c);
			front = tNode;
			rear = front;
		} else // if element in list
		{
			Deque<E> tNode = new Deque<>(c);
			rear.next = tNode;
			tNode.pre = rear;
			rear = tNode;
		}
		size++;
	}

	// remove front
	public E removeFront() {
		E val = null;
		if (front == null) {
			System.out.println("No elements to delete");
		} else {
			val = front.data;
			front = front.next;
		}
		size--;
		return val;
	}
/*
	// remove rear
	public T removeRear() {
		T val = null;
		if (front == null) {
			System.out.println("No element to delete");
		} else {
			val = rear.data;
			rear = rear.pre;
			rear.next = null;
		}
		size--;
		return val;
	}

	// to remove
	public boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	// return size of dequeue
	public static int size() {
		return size;
	}

	// add front
	@SuppressWarnings("null")
	public void addFront(T c) {
		if (front == null) // if no element in list
		{
			front.data = c;
			rear = front;
		} else // if element in list
		{
			Deque<T> tNode = null;
			tNode.data = c;
			tNode.next = front;
			front.pre = tNode;
			front = tNode;
		}
		size++;
	}
*/
	public class Deque<E> {

		public E data;
		public Deque<E> next;
		public Deque<E> pre;

		public Deque() {
			this.next = null;
			this.pre = null;
		}

		public Deque(E val) {
			this.data = val;
			this.next = null;
			this.pre = null;
		}
	}
	/*public int size1() {
		return Node.size();
	}*/
	

}