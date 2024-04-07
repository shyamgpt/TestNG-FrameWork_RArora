package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {
	
	//It will executed before all the entire Suite--> means before everyMethod
	@BeforeSuite
	public void setUp() {
		System.out.println("Intiliazing Everythying!!!!");
	}
	
	//It will execute after executing all the entire suite
	@AfterSuite
	public void tearDown() {
		System.out.println("Quiting Everything !!!");
	}

}
