package importantSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

	@Test
	public void signInTest() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.honest.com");
		driver.findElement(By.id("bx-element-622589-Fb4KQ0e")).click();

		WebElement element = driver.findElement(By.xpath("//a[@href='/log-in']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

		Thread.sleep(3000);

		driver.close();
	}
}
