package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import SunnySelenium.SunnySelenium.Basebrowser;

public class Amazon extends Basebrowser{


	@Test
	public void verifythetitle() {
		Assert.assertEquals(driver.getTitle(), "Amazon.com");
	}

	@Test
	public void verifytheurl() {
		Assert.assertTrue((driver.getCurrentUrl().contains("https://www.amazon.com/")), "Url is not correct");

	}


}
