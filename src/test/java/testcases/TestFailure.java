package testcases;

/* 
 * Listeners -- it is basically a triggered
 * */

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure extends testBase {

	@Test
	public void doLogin() {
		Assert.fail("failing the login test");
		System.out.println("capture screenshot");
	}
}
