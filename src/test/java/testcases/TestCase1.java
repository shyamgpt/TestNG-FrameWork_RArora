//Creating the First Test Case--->

package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@BeforeTest
	public void createDBConn() {
		System.out.println("Creating Db Connection");
	}
	
	@AfterTest
	public void closeDBConn() {
		System.out.println("Closing DB Connection");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing browser");
		
	}
	
	@Test(priority=1)
	public void doUserRegistration() {
		System.out.println("Executing the User registration test");
	}

	@Test(priority=2)
	public void doLogin() {
		System.out.println("Executing the login test");
	}
	
	
}
