package com.cg.tm;

public class TestMaximum {

	public Integer testMax(Integer a, Integer b, Integer c) {
		Integer max = a;
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
