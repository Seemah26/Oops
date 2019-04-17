package com.bridgelabz.util.datastructure;
public class Queue<T> {

	public int capacity = 20;
	private Object queue[] = new Object[capacity];
	private int front = -1;
	int rear=0;
	int size=0;

	public void enque(T item) {
		if (size == capacity) {
			expand();
		}
		queue[rear++] = item;
		size++;
	}

	public int deque() {
		if (size > 0) {
			if (size < capacity ) {
				shrink();
			}
			queue[++front] = null;
			size--;
		}
		return capacity;
	}

	public void expand() {
		Object[] newar = new Object[capacity * 2];
		capacity *= 2;
		for (int i = front + 1; i < rear; i++) {
			newar[i] = queue[i];
		}
		queue = newar;
	}

	public void shrink() {
		Object newar[] = new Object[(capacity)];
		capacity = capacity-1;
		int j = 0;
		for (int i = front + 1; i < rear; i++) {
			newar[j++] = queue[i];
		}
		front = -1;
		rear = size;
		queue = newar;
	}

	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	@Override
	public String toString() {
		String s = "{ ";
		for (int i = front + 1; i < rear; i++) {
			s = s + queue[i] + ", ";
		}
		s = s + "}";
		return s;
	}

}