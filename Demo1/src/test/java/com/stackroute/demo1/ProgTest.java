package com.stackroute.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgTest {

	@Test
	public void test() {
		Prog p = new Prog();
		String result=p.Out("london");
		assertEquals("londondondondon", result);
	}

}