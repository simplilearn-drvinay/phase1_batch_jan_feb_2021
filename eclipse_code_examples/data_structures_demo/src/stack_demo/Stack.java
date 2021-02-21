package stack_demo;

import java.util.Arrays;

public class Stack {

	private String ar[] = new String[10];
	private int top;

	public Stack() {
		// TODO Auto-generated constructor stub
		top = -1;
	}

	public boolean push(String element) {

		if (top >= (ar.length - 1)) {
			System.out.println("Stack overflow");
			return false;
		} else {
			ar[++top] = element;
			return true;
		}
	}

	public String pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			String temp = ar[top];
			ar[top--] = null;

			return temp;
		}
	}

	@Override
	public String toString() {
		return "Stack [ar=" + Arrays.toString(ar) + ", top=" + top + "]";
	}

	public String peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			return ar[top];
		}
	}
}
