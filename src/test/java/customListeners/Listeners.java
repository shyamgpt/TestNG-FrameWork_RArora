package customListeners;

import org.testng.ITestListener;

/*
 * Listeners -> It is something related to triggers, triggers are like
 * set of procedured / code thet get executed whenever a particular event 
 * is fired.
 * */
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Capturing  screenshot for the failed test --" +result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test -" +result.getName());
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Capturing  screenshot for the failed test --" +result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Capturing  screenshot for the failed test --" +result.getName());
	}
	public void onTestFinished(ITestResult result) {
		System.out.println("Capturing  screenshot for the failed test --" +result.getName());
	}
	

}
