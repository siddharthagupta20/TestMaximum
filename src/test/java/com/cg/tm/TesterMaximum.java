package com.cg.tm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesterMaximum {
	
	@Test
	public void givenFirst_whenMax_returnsFirst() {
		TestMaximum tm=new TestMaximum();
		Float result=tm.testMaxFloat(5.3f, 4.3f, 3.3f);
		assertEquals(new Float(5.3), result);
	}
	@Test
	public void givenSecomd_whenMax_returnsSecond() {
		TestMaximum tm=new TestMaximum();
		Float result=tm.testMaxFloat(4.3f, 5.3f, 3.3f);
		assertEquals(new Float(5.3), result);
	}
	@Test
	public void givenThird_whenMax_returnsThird() {
		TestMaximum tm=new TestMaximum();
		Float result=tm.testMaxFloat(3.3f, 4.3f, 5.3f);
		assertEquals(new Float(5.3), result);
	}

}
