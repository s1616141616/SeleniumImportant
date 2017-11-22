package importantSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupClose {
	
	@Test
	public void popupClose() {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.honest.com");
		driver.findElement(By.id("bx-element-622589-Fb4KQ0e")).click();
	}

}
