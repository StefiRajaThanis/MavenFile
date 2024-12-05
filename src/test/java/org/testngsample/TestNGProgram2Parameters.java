package org.testngsample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGProgram2Parameters {
	@Parameters({"user", "pass"})
	@Test
	private void tc01(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	private void tc02() {
		System.out.println("Test2");
	}

}
