package org.testngsample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTestngSirpgm1 {
		
		@Test
		private void tc01() {
			String s = "Stefi";
			boolean contains = s.contains("J");
			System.out.println("Test");
			Assert.assertTrue(contains);
			System.out.println("Assert getting failed: "+"_"+contains);
		}
		@Test
		private void tc02() {
			String s = "Stefi";
			boolean contains = s.contains("i");
			System.out.println("Test2");
			Assert.assertFalse(contains);
			System.out.println("Assert getting failed: "+"_"+contains);
		}
		@Test
		private void tc03() {
			String s = "Stefi";
			boolean contains = s.contains("M");
			System.out.println("Test3");
			Assert.assertEquals(contains, true, "Assert condition failed due mismatched Result");
			System.out.println("Assert getting passed: "+"_"+contains);
		}
		@Test
		private void tc04() {
			String s = "Sarvesh";
			boolean contains = s.contains("S");
			System.out.println("Test4");
			Assert.assertNotEquals(contains, false, "Assert passed due to mismatched Result");
			System.out.println("Assert getting passed"+"_"+contains);
		}
	}


