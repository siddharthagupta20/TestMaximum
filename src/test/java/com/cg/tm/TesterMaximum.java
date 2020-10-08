package com.cg.tm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesterMaximum {
	
	@Test
	public void givenFirst_whenMax_returnsFirst() {
		TestMaximum tm=new TestMaximum();
		Integer result=tm.testMax(5, 4, 3);
		assertEquals(new Integer(5), result);
	}
	@Test
	public void givenSecomd_whenMax_returnsSecond() {
		TestMaximum tm=new TestMaximum();
		Integer result=tm.testMax(4, 5, 3);
		assertEquals(new Integer(5), result);
	}
	@Test
	public void givenThird_whenMax_returnsThird() {
		TestMaximum tm=new TestMaximum();
		Integer result=tm.testMax(3, 4, 5);
		assertEquals(new Integer(5), result);
	}

}
