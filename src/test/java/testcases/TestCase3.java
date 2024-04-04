//Creating test Dependencies -->

package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	@Test(priority=1,groups = {"functional", "smoke"})
	public void doUserRegistration() {
		System.out.println("Executing the User registration test");
		Assert.fail("User is not registeres succesfully");
	}
	
	
//	Mutiple dependecies-->
	
//	@Test(priority=2, dependsOnMethods={"doUserRegistration", "thirdTest"})
//	public void doLogin() {
//		System.out.println("Executing the login test");
//	}
	

	@Test(priority=2, dependsOnMethods="doUserRegistration", groups = {"functional", "smoke"})
	public void doLogin() {
		System.out.println("Executing the login test");
	}
	
//	Soft dependences --> AlwaysRun = true
	@Test(priority=3, dependsOnMethods="doUserRegistration", alwaysRun=true, groups = {"functional", "smoke"})
	public void thirdTest() {
		System.out.println("Exectuing third Test");
	}
	
	@Test(priority=4 , groups="bvt")
	public void fourthTest() {
		System.out.println("Executing fourth test");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
