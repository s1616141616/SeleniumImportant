package importantSelenium;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot {

	@Test
	public void screenShot() throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");

		driver.findElement(By.name("email")).sendKeys("test");
		driver.findElement(By.name("pass")).sendKeys("test");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/facebook.png"));
		System.out.println("Screenshot Taken");

		Thread.sleep(3000);

		driver.close();

	}
}