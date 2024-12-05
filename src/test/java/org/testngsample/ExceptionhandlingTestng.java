package org.testngsample;

import org.testng.annotations.Test;

public class ExceptionhandlingTestng {
	@Test
	private void tc01() {
		try {
		System.out.println(8/0);	
		String s = "Jack";
		System.out.println(s.charAt(7));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
