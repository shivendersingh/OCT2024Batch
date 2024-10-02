package SunnySelenium.SunnySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionunderstading {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//parameterize Consutructor
		driver.get("https://www.google.co.in/");
		//driver.refresh();
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"))).sendKeys("sunny")
.build().perform();		
	
		
		Util.hardcorewait(5000);
		//System.out.println(driver.findElement(By.xpath("/html/body/h2")).getText());
		driver.quit();
	}
}
