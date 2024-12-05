package org.testsuiteexample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestFailureAndSuccessMethod {
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(RunnerClass.class);
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {
			String string = failure.toString();
			System.out.println(string);
			
		}
		boolean wasSuccessful = runClasses.wasSuccessful();
		System.out.println(wasSuccessful);
	}

}
