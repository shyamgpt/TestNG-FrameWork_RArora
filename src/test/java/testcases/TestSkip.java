 package testcases;

 
 // This id for when you want to forcefully skip a test
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip extends testBase {
	
	
	@Test
	public void isSkip() {
		
		throw new SkipException("Skipping the test as the condition is not met");
	}

}
