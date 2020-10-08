package com.cg.tm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesterMaximum {

	@Test
	public void givenFirst_whenMax_returnsFirst() {
		TestMaximum tm = new TestMaximum();
		String result = tm.testMaxString("Peach", "Apple", "Banana");
		assertEquals("Peach", result);
	}

	@Test
	public void givenSecomd_whenMax_returnsSecond() {
		TestMaximum tm = new TestMaximum();
		String result = tm.testMaxString("Apple", "Peach", "Banana");
		assertEquals("Peach", result);
	}

	@Test
	public void givenThird_whenMax_returnsThird() {
		TestMaximum tm = new TestMaximum();
		String result = tm.testMaxString("Apple", "Banana", "Peach");
		assertEquals("Peach", result);
	}

}
