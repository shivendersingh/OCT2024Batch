package TestNG;

import org.testng.annotations.Test;

public class Invvocationcount {

	@Test(invocationCount = 2)
	public void login() {
		System.out.println("User able to login");
	}

}
