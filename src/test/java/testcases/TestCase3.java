//Creating test Dependencies -->

package testcases;

/*
 Let doLogin is depenedent on doUserRegistration() then , if doRegisatration get falied then all the
test cases dependent on doUserRegistration will get skipped, it will not execute.

Soft Dependency -->Soft dependencies. You will always be run after the methods you depend on, 
even if some of them have failed. This is useful when you just want to make sure that your test 
methods are run in a certain order but their success doesn’t really depend on the success of others. 
A soft dependency is obtained by adding "alwaysRun=true" in your @Test annotation.
URL : https://testng.org/#_dependencies
Thr
*/
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends testBase {

	@Test(priority = 1, groups = { "functional", "smoke" })
	public void doUserRegistration() {
		System.out.println("Executing the User registration test");
		Assert.fail("User is not registeres succesfully");
	}

//	Mutiple dependecies-->

//	@Test(priority=2, dependsOnMethods={"doUserRegistration", "thirdTest"})
//	public void doLogin() {
//		System.out.println("Executing the login test");
//	}

	@Test(priority = 2, dependsOnMethods = "doUserRegistration", groups = { "functional", "smoke" })
	public void doLogin() {
		System.out.println("Executing the login test");
	}

//	Soft dependences --> AlwaysRun = true
	@Test(priority = 3, dependsOnMethods = "doUserRegistration", alwaysRun = true, groups = { "functional", "smoke" })
	public void thirdTest() {
		System.out.println("Exectuing third Test");
	}

	@Test(priority = 4, groups = "bvt")
	public void fourthTest() {
		System.out.println("Executing fourth test");
	}

}
