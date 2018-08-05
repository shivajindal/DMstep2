package com.stackroute.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog9Test {

	@Test
	public void test() {
		Prog9 p = new Prog9();
		String result = p.reverse("mat");
		assertEquals("tam",result);
	}
}
