package importantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleAssert {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D://QA Job//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gmail.com");
	}

	@Test
	public void hardAssertTest() {
		driver.findElement(By.name("identifier")).sendKeys("s1616141616@gmail.com");
		// WebElement actual= driver.findElement(By.name("saaa"));
		Assert.assertEquals("identifier", "saaa");
		System.out.println("Completed");
	}

	@Test
	public void softAssertTest() throws InterruptedException {

		SoftAssert soft_assert = new SoftAssert();
		driver.findElement(By.name("identifier")).sendKeys("s1616141616@gmail.com");
		soft_assert.assertEquals("identifier", "saaa");
		driver.findElement(By.className("CwaK9")).click();
		System.out.println("Soft assertion completed with ERRrrrrrorrrrr!!!");
		soft_assert.assertAll();

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}