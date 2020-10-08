package com.cg.tm;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TesterMaximum {

	@Test
	public void givenFirst_whenMax_returnsFirst() {
		TestMaximum<String> tm = new TestMaximum<String>(Arrays.asList("Peach", "Apple", "Banana"));
		String result = tm.testMaximum();
		assertEquals("Peach", result);
	}

	@Test
	public void givenSecond_whenMax_returnsSecond() {
		TestMaximum<Float> tm = new TestMaximum<Float>(Arrays.asList(4.3f, 5.3f, 3.3f));
		Float result = tm.testMaximum();
		assertEquals(new Float(5.3), result);
	}

	@Test
	public void givenThird_whenMax_returnsThird() {
		TestMaximum<Integer> tm = new TestMaximum<Integer>(Arrays.asList(4, 3, 5));
		Integer result = tm.testMaximum();
		assertEquals(new Integer(5), result);
	}

}