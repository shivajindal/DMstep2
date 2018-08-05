package com.stackroute.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrBufTest {

	@Test
	public void testReverse() {
		
		 StrBuff test = new StrBuff();
		
		 int result = test.reverse(123);
		
		 assertEquals(321, result);
		 }
}
