package com.crm.baseClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.fileUtility.ReadProperties;
import com.crm.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void preConition() throws IOException
	{
	String expected_result = "https://app.thepric.com/";
	String browser = ReadProperties.readData("browser");
	String url = ReadProperties.readData("url");
	
	if(browser.equals("chrome"))
	{
		 driver = new ChromeDriver();
	}
	
	else if(browser.equals("edge"))
	{
		 driver = new EdgeDriver();
	}
	
	else if(browser.equals("firefox"))
	{
		 driver = new FirefoxDriver();
	}
	
	else
	{
		driver= new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	String actual_result = driver.getCurrentUrl();
	assertEquals(expected_result, actual_result);
	
	
}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		LoginPage log = new LoginPage(driver);
		log.phoneNumber("7020213197");
		log.sendOtp();
		Thread.sleep(15000);
		log.clickVerify();
		Thread.sleep(5000);
	}
	
//	@AfterClass
//	public void postCondition() {
//		driver.quit();
//	}
	

}
