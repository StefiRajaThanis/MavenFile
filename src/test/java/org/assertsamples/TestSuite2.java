package org.assertsamples;

import org.junit.Assert;
import org.junit.Test;

public class TestSuite2 {
	@Test
	public void tc01() {
		String s = "Stefi";
		System.out.println("Test1");
		boolean contains = s.contains("t");
		Assert.assertEquals(true, contains);
		System.out.println(contains);
	}
	@Test
	public void tc02() {
		String s = "StefiSarvesh";
		System.out.println("Test2");
		boolean contains = s.contains("S");
		Assert.assertNotEquals(false, contains);
		System.out.println(contains);
		
	}
	@Test
	public void tc03() {
		String s = "Sarvesh";
		System.out.println("Test3");
		boolean contains = s.contains("H");
		Assert.assertNotEquals(true, contains);
		System.out.println(contains);
	}
	@Test
	public void tc04() {
		String s = "Sathish";
		System.out.println("Test4");
		boolean contains = s.contains("I");
		Assert.assertNotEquals(true, contains);
		System.out.println(contains);
	}
	@Test
	public void tc05() {
		String s="Sathi";
		System.out.println("Test5");
		boolean contains = s.contains("i");
		Assert.assertNotEquals(false, contains);
		System.out.println(contains);
	}
	@Test
	public void tc06() {
		String s = "GreensTech";
		System.out.println("Test6");
		boolean contains = s.contains("E");
		Assert.assertEquals(false, contains);
		System.out.println(contains);
	}
	@Test
	public void tc07() {
		String s = "Baby";
		System.out.println("Test7");
		boolean contains = s.contains("b");
		Assert.assertEquals(false, contains);
		System.out.println(contains);
	}

}
