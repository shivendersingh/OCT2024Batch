package SunnySelenium.SunnySelenium;
//html

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 	//index
		System.out.println(driver.switchTo().frame(2).getPageSource());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		//driver.switchTo().frame(driver.findElement(By.name("main")));
 * @author shive
 *
 */
public class Frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
	
		
		System.out.println(driver.findElement(By.xpath("/html/body/h2")).getText());
		driver.quit();
	}

}
