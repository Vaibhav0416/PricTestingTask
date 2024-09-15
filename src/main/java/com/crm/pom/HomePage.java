package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	private @FindBy(xpath = "//span[text()='Locked Message']")
	WebElement lockedMsg;
	
	private @FindBy(xpath = "(//button[@class='btn btn-link'])[2]")
	WebElement edit;
	
	private @FindBy(xpath = "(//button[@class='btn btn-link'])[3]")
	WebElement delete;
	 
	public void clickLockedMsg()
	{
		lockedMsg.click();
	}
	
	public void clickEdit()
	{
		lockedMsg.click();
	}
	
	public void clickDelete()
	{
		delete.click();
	}

}
