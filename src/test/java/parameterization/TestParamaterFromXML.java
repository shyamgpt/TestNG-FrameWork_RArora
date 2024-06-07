package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 * Seleneium grid --> is used to distribute the task, not for parallel
 * excecution as it is used for distribution of test cases on mutilple 
 * nodes and browser
 * for the parallel task -- we used the testng Framework
 * */

public class TestParamaterFromXML {
	
	@Parameters({"browser","env"})
    @Test
	public void getBrowser(String browser, String env) {
		
	}

}
