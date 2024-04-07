package customListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Capturing  screenshot for the failed test --" +result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test -" +result.getName());
	}

}
