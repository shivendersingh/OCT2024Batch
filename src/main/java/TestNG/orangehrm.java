package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import SunnySelenium.SunnySelenium.Basebrowser;

public class orangehrm extends Basebrowser {

	@Test
	public void verifythetitle() {
		Assert.assertEquals(driver.getTitle(), "Human Resources Management Software | OrangeHRM");
	}

	@Test
	public void verifytheurl() {
		Assert.assertTrue((driver.getCurrentUrl().contains("https://www.orangehrm.com/")), "Url is not correct");

	}

}
