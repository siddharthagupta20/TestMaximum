package com.cg.tm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesterMaximum {

	@Test
	public void givenFirst_whenMax_returnsFirst() {
		TestMaximum<String> tm = new TestMaximum<String>("Peach", "Apple", "Banana");
		String result = tm.testMaximum();
		assertEquals("Peach", result);
	}

	@Test
	public void givenSecomd_whenMax_returnsSecond() {
		TestMaximum<Float> tm = new TestMaximum<Float>(4.3f, 5.3f, 3.3f);
		Float result = tm.testMaximum();
		assertEquals(new Float(5.3), result);
	}

	@Test
	public void givenThird_whenMax_returnsThird() {
		TestMaximum<Integer> tm = new TestMaximum<Integer>(4, 3, 5);
		Integer result = tm.testMaximum();
		assertEquals(new Integer(5), result);
	}

}
