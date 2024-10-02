package TestNG;

import org.testng.annotations.Test;

public class TestNGAnnotations {

	String str = "Tom";
	@Test(expectedExceptions = {ArithmeticException.class,
			NullPointerException.class})
	public void login() {
		TestNGAnnotations obj=null;
		System.out.println(obj.str);
		int i=9/0;
		System.out.println("User need to login");
	}
	@Test(dependsOnMethods="login",priority = 1)
	public void verifythetitle() {
		System.out.println("title is verified");
	}
	@Test(dependsOnMethods="login",priority = 1)
	public void verifytheCurrentURL() {
		System.out.println("URL is verified");
	}
	@Test(dependsOnMethods={"login","verifythetitle","verifytheCurrentURL"},priority = 2)
	public void logout() {
		System.out.println("User need to logout");
	}

	
}
