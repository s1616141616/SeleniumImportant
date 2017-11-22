package importantSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {

	@Test
	public void mouseHoverTest() {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");

		Actions action = new Actions(driver);

		WebElement element = driver.findElement(By.id("nav-link-shopall"));

		action.moveToElement(element).perform();

		List<WebElement> lst = driver.findElements(By.xpath("//*[@class='nav-text']"));

		int totalCat = lst.size();
		System.out.println(totalCat);

		for (int i = 0; i < totalCat; i++) {
			WebElement element1 = lst.get(i);
			String text = element1.getAttribute("innerHTML");
			// boolean status=element1.isEnabled();
			System.out.println(text);

			if (text.equalsIgnoreCase("Fire TV")) {
				element1.click();
				break;
			}

			driver.quit();
		}
		// Enhance Loop
		/*
		 * for (WebElement element1:lst) { String cat_name= element1.getText();
		 * System.out.println("Department list are " +cat_name); }
		 */
	}

}