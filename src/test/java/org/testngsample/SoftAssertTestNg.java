package org.testngsample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestNg {
	@Test
	private void tc01() {
		String s = "Stefi";
		boolean contains = s.contains("i");
		System.out.println("Test");
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(contains);
		System.out.println("Assert getting passed: " + contains);
	}

}
