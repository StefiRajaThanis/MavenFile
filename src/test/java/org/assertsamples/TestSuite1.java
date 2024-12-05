package org.assertsamples;

import org.junit.Assert;
import org.junit.Test;

public class TestSuite1 {
	@Test
	public void tc01() {
		String s = "Jack";
		System.out.println("Test1");
		boolean contains = s.contains("k");
		Assert.assertTrue(contains);
		System.out.println(contains);
	}
	@Test
	public void tc02() {
		String s= "Lisa";
		System.out.println("Test2");
		boolean contains = s.contains("A");
		Assert.assertFalse(contains);
		System.out.println(contains);
	}
	@Test
	public void tc03() {
		String s="hexa";
		System.out.println("Test3");
		boolean contains = s.contains("x");
		Assert.assertEquals(true, contains);
		System.out.println(contains);
	}

}
