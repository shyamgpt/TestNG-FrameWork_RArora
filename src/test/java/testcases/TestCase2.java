//Adding the Assertion and Reporting Failures -->

package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test(groups="smoke")
	public void validateTitles() {
		
		String expected_title = " Google.com";
		String actual_title = "Gamil.com";
		
		Assert.assertEquals(actual_title, expected_title);
//		isElementPresent("xpath") - true, false
		
//		Assert.assertTrue(false, "element Not found");
//		Assert.fail("failing the test case as the condition is not met");
		
	}

}
