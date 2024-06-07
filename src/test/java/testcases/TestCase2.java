//Adding the Assertion and Reporting Failures -->

package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends testBase {
	
	@Test(groups="smoke")
	public void validateTitles() {
		
		System.out.println("Staring");
		String expected_title = " Google.com";
		String actual_title = "Gamil.com";
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Validating title");
		
//		Assert.assertEquals(actual_title, expected_title);
		softAssert.assertEquals(actual_title, expected_title);
		
		System.out.println("Valiadting Image");
//		Assert.assertEquals(true, false, "image not present");
		softAssert.assertEquals(true, false, "image not present");
		
		System.out.println("Validate text box presence");
//		Assert.assertEquals(true, false, "tect box not present");
		softAssert.assertEquals(true, false, "tect box not present");
		
		
		
		System.out.println("Ending");
		softAssert.assertAll();
		
		
		
		
		
		
		
		
		
		
//		isElementPresent("xpath") - true, false
//		isELementPresent("xpath")
//		Assert.assertTrue(false, "element Not found");
//		Assert.fail("failing the test case as the condition is not met"); 
//		System.out.println("Ending");
//		
//		Assert.asserTrue();
//		Assert is class and Assert true is overloaded method → Example of polymorphism
//		Assert.fail("failing the test case as the condition is not met"); 

		
	}

}
