package org.reruntestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunSample1 {
	@Test(retryAnalyzer=RetryClass.class)
	private void tc06() {
		System.out.println("Testing failed method");
		Assert.assertTrue(false);
		System.out.println("Test6");
	}
	@Test
	private void tc02() {
		System.out.println("Text2");
	}

}
