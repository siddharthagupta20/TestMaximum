package com.cg.tm;

public class TestMaximum <E extends Comparable<E>> {
	private E arg1;
	private E arg2;
	private E arg3;
	
	public TestMaximum(E arg1,E arg2, E arg3) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
	}

	public E testMaximum() {
		return testMax(arg1,arg2, arg3);
	}
	
	public static <E extends Comparable<E>> E testMax(E a, E b, E c) {
		E max = a;
		if (max.compareTo(b) < 0)
			max = b;
		if (max.compareTo(c) < 0)
			max = c;
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Test Maximum Program.");
	}

}
