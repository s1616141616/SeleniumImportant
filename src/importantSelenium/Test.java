package importantSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {

		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("s1616141616@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		
		
	}

}
