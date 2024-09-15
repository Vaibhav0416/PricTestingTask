package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.baseClass.BaseClass;
import com.crm.pom.HomePage;
@Listeners(com.crm.listeners.Screenshot.class)

public class ViewLockedMessage extends BaseClass{
	
	@Test
	public void viewLockedMsg() throws InterruptedException
	{
		HomePage hm = new HomePage(driver);
		hm.clickLockedMsg();
		
		List<WebElement> viewAll = driver.findElements(By.xpath("//i[@class='fe fe-eye']"));
		
		
		for (WebElement web : viewAll) {
			
			web.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(4000);
			
		}
		
	}

}
