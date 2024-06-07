package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {
	
	//It will executed before all the entire Suite--> means before everyMethod
	@BeforeSuite
	public void setUp() {
		/*
		 * We initilised everythingd here
		 * Login(), Database connectivity, WebDriver
		 * 
		 * */
		
		System.out.println("Intiliazing Everythying!!!!--> Before Suite");
	}
	
	//It will execute after executing all the entire suite
	@AfterSuite
	public void tearDown() {
		
		/*We gonna quit Everythings here
		 * 
		 * 
		 * 
		 * */
		System.out.println("Quiting Everything !!!--> After Suite");
	}

}
