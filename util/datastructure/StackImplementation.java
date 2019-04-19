package com.bridgelabz.util.datastructure;
public class StackImplementation <E> {
		
		int capacity = 100;

		
		private Object[] stack = new Object[capacity];
		
		private int top = 0;

		public void push(E data) {
			// checks for cpapcity of array
			if (top == capacity) {
				expand();
			}
			// puts data in stack
			stack[top] = data;
			top++;
		}

		public E pop() {
			if (isEmpty()) {
				System.err.println("cant pop , stack is empty");
				return null;
			} else {
				E data = (E) stack[--top];
				stack[top] = null;
				return data;
			}
		}

		public E peek() {
			return (E) stack[top];
		}
		public boolean isEmpty() {
			return top == 0;
		}
		public int size() {
			return top;
		}

		private void expand() {
			Object[] newStack = new Object[capacity * 2];
			System.arraycopy(stack, 0, newStack, 0, top);
			capacity *= 2;
			stack = newStack;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("{ ");
			for (int i = 0; i < top; i++) {
				sb.append(stack[i]);
				sb.append(", ");
			}
			sb.append("}");
			return sb.toString();
		}
}