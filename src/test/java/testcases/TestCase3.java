//Creating test Dependencies -->

package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	@Test(priority=1)
	public void doUserRegistration() {
		System.out.println("Executing the User registration test");
		Assert.fail("User is not registeres succesfully");
	}
	
	
//	Mutiple dependecies-->
	
//	@Test(priority=2, dependsOnMethods={"doUserRegistration", "thirdTest"})
//	public void doLogin() {
//		System.out.println("Executing the login test");
//	}
	

	@Test(priority=2, dependsOnMethods="doUserRegistration")
	public void doLogin() {
		System.out.println("Executing the login test");
	}
	
//	Soft dependences --> AlwaysRun = true
	@Test(priority=3, dependsOnMethods="doUserRegistration", alwaysRun=true)
	public void thirdTest() {
		System.out.println("Exectuing third Test");
	}
	
	@Test(priority=4 , dependsOnMethods="doUserRegistration")
	public void fourthTest() {
		System.out.println("Executing fourth test");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
