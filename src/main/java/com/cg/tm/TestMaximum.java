package com.cg.tm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMaximum<E extends Comparable<E>> {
	private List<E> listArg;

	public TestMaximum(List<E> listArg) {
		super();
		this.listArg=new ArrayList<E>();
		for(E e: listArg)

			this.listArg.add(e);
	}

	public E testMaximum() {
		E value = testMax(listArg);
		return value;
	}

	public static <E extends Comparable<E>> E testMax(List<E> listArg) {
		Collections.sort(listArg);
		return listArg.get(listArg.size() - 1);

	}


	public static void main(String[] args) {
		System.out.println("Welcome to Test Maximum Program.");
		TestMaximum<String> tm = new TestMaximum<String>(Arrays.asList("Peach", "Apple", "Banana"));
		System.out.println(tm.testMaximum());

	}

}