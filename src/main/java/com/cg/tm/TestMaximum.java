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

	public Float testMaxFloat(Float a, Float b, Float c) {
		Float max = a;
		if (max.compareTo(b) < 0)
			max = b;
		if (max.compareTo(c) < 0)
			max = c;
		return max;

	}

	public String testMaxString(String a, String b, String c) {
		String max = a;
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
