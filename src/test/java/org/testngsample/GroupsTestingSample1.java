package org.testngsample;

import org.junit.Assert;
import org.testng.annotations.Test;

public class GroupsTestingSample1 {
	
	@Test(groups="Sanity", dependsOnGroups="Regg")
	private void tc1() {
		System.out.println("Test1");
	}
	@Test(groups="Smoke")
	private void tc2() {
		System.out.println("Test2");
	}
	@Test(groups="Regg")
	private void tc3() {
		System.out.println("Test3");
	}

	@Test(groups="Regg", dependsOnMethods="tc6", alwaysRun=true)
	private void tc4() {
		System.out.println("Test4");
	}

	@Test(groups="Sanity")
	private void tc5() {
		System.out.println("Test5");
	}

	@Test(groups="Sanity")
	private void tc6() {
		System.out.println("Test6");
	}

	@Test(groups="Smoke")
	private void tc7() {
		System.out.println("Test7");
	}

	@Test(groups="Sanity")
	private void tc8() {
		Assert.assertTrue(false);
		System.out.println("Test8");
	}

	@Test(groups="Sanity")
	private void tc9() {
		System.out.println("Test9");
	}

	@Test(groups="Smoke")
	private void tc10() {
		System.out.println("Test10");
	}


}
