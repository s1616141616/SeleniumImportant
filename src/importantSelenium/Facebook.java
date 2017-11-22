package importantSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {
	
	
	@Test
	public void selectDropDownValues() throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement month_droop_down = driver.findElement(By.id("month"));
		
		Select drop_down= new Select(month_droop_down);
		
		WebElement default_value = drop_down.getFirstSelectedOption();
		System.out.println("Before selection value is " + default_value.getText());
		Thread.sleep(3000);
		
		drop_down.selectByIndex(5);
		Thread.sleep(3000);
		
		drop_down.selectByValue("9");
		Thread.sleep(3000);
		
		drop_down.selectByVisibleText("Apr");
		Thread.sleep(3000);
		
		WebElement default_value1 =drop_down.getFirstSelectedOption();
		System.out.println("After Selection value is " + default_value1.getText());
		
		Assert.assertEquals("Apr", "Apr");
		
		
		List<WebElement>month_list =drop_down.getOptions();
		int total_month = month_list.size();
		System.out.println("Total Month is "+total_month);
		
		//Enhance Loop
		for (WebElement element:month_list)
		{
			String month_name= element.getText();
			System.out.println("Name of month are " +month_name);
			
		}
		
		driver.close();
	}
}