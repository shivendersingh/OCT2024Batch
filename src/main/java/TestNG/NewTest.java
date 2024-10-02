package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

 */
/**
 * 
 * 1) luanch the url
 * 2) you need to passd and userbame
 * 3)then do some test
 * 4) lopgout
 *
 */
public class NewTest {
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BS--Launching the driver");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BT-- test the project");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC---");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM-- test login password");
  }
  
  @Test
  public void verifythetitle() {
	  System.out.println("title has been verifed");
  }
  
  @AfterMethod
  public void AfterMethod() {
	  System.out.println("AM-- close the data");
  }
  @AfterClass
  public void afterClass() {
  System.out.println("AC------");
  }
  @AfterTest
  public void afterTest() {
  System.out.println("AT----");	  
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("AS----");	 
  }
}


