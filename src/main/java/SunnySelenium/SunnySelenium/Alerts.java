package SunnySelenium.SunnySelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//http://admin:admin@the-internet.herokuapp.com/basic_auth
//http://username:password@hostname/path
//1) autoit tool
//2) developer ki type='file'
// Assuming 'driver' is your WebDriver instance and 'element' is the WebElement you want to scroll into view
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'end', inline: 'nearest' });", driver.findElement(By.xpath("//img[@alt='facebook logo']")));

// Assuming 'driver' is your WebDriver instance
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollTo({ top: arguments[0], left: arguments[1], behavior: 'smooth' });", 7719,1319);

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		new Util(driver);
		//driver.manage().window().maximize();
		//driver.get("https://www.orangehrm.com/");
		Util.luanchtheurl("https://www.orangehrm.com/");

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//img[@alt='facebook logo']")));
//		js.executeScript("window.scrollBy(100000, 100000);"); 
//		Util.hardcorewait(100);
//		driver.findElement(By.xpath("//img[@alt='facebook logo']")).click();
//		Util.hardcorewait(1000);
//		System.out.println(driver.getTitle());
//		String parentwindow= driver.getWindowHandle();
//		System.out.println(driver.getWindowHandles().size());//here we get total window that is been opened
//		Set<String> set =driver.getWindowHandles();
//		//ArrayList<String> allwindow = new ArrayList<String>(Arrays.asList("asdsda","asdasd"));
//		for (String windowHandle : set) {
//            if (!windowHandle.equals(parentwindow)) {
//                driver.switchTo().window(windowHandle);
//                break;
//            }
//        }
//		System.out.println(driver.getTitle());
//		driver.close();
//		System.out.println(parentwindow);
//		driver.switchTo().window(parentwindow);
//		System.out.println(driver.getTitle());
		Util.quitthebrowser();
	}

}
