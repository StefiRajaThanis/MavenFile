package org.testngsample;

import org.testng.annotations.Test;

public class TestNgProgram1 {
	@Test(priority = 4)
	private void tc01() {
		System.out.println("Test1");
	}
	@Test(priority = 1)
	private void tc02() {
		System.out.println("Test2");
	}
	@Test(priority = -5,invocationCount = 10)
	private void tc03() {
		System.out.println("Test3");
	}
	@Test(priority = -1, enabled = false)
	private void tc04() {
		System.out.println("Test4");
	}
	@Test(priority = -10)
    private void tc05() {
		System.out.println("Test5");
	}



}
