package org.testngsample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunTesting {
	@Test
	private void tc8() {
		System.out.println("Testing failed method");
		Assert.assertTrue(false);
		System.out.println("Test 6");
		
	}
	@Test
	private void tc2() {
		System.out.println("tEST2");
	}

}
