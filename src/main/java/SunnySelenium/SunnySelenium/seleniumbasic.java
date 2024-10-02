package SunnySelenium.SunnySelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Implicit and Explicit waits
 * 
 * @author shive
 *
 *         id :- id="APjFqb" // unique dev change karte name:- name="q" // non
 *         unqiue class:-class="gLFyf" // non unique
 *
 *
 *         why you are using WebDriver driver = new ChromeDriver();
 *
 *         1) As webdriver directly extrends Search context interface which 2
 *         methods findElement(null) and findElements(null). 2) As you cannot
 *         create an object of two different class sumiltanously ChromeDriver
 *         driver1 = new FirefoxDriver(); so you use webdriver(interface) where
 *         you can create multiple object of different driver WebDriver driver =
 *         new ChromeDriver(); WebDriver driver2 = new FirefoxDriver();
 *
 *
 *         List<WebElement>listoflanguage=
 *         driver.findElements(By.xpath("//*[@id='SIvCob']//child::a")); for
 *         (WebElement webElement : listoflanguage) { if
 *         ("मराठी".contains(webElement.getText())) { webElement.click(); break;
 *         } }
 * 
 * 
 * 
 */
public class seleniumbasic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Util.luanchtheurlandverifyitstitle(driver,
				"https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html",
				"IRCTC Next Generation eTicketing System");
		Util.clickanelemtwithbasicxpath(driver, "*", "id", "datepicker");
		 By locator = By.cssSelector("table.ui-datepicker-calendar a");
		 Util.datepicker(driver, locator, "35");
		
		Thread.sleep(2000);

		Util.quitthebrowser(driver);

	}
	
}