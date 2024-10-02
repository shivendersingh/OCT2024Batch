package SunnySelenium.SunnySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Basebrowser {
	public WebDriver driver;

	@Parameters({"browser","URL"})
	@BeforeTest
	public void setup(String browser, String url) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("IE")){
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Browser not found>>>>");
		}
		
		driver.get(url);
	}

	@AfterTest
	public void teardown() {
		new Util(driver);
		Util.quitthebrowser();
	}
}
