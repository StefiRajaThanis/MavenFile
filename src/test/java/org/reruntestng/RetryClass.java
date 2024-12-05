package org.reruntestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {

	int min = 0;
	int max = 20;
	
	public boolean retry(ITestResult results) {
		
		if(min < max) {
			min++;
		return true;
	}
		return false;

}
}