package ParallerlTest;

import java.util.Date;

//import java.sql.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser {
	
	
	@Parameters
	@Test
	public void doLogin(String b) throws InterruptedException {
		
		Date d = new Date();
		System.out.println("BrowserName :" +b+ "--"+d);
		Thread.sleep(1000);
	}

}
