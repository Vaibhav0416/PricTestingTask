package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	private @FindBy(xpath = "//input[@name='tel']")
	WebElement telephone;
	
	private @FindBy(xpath = "//button[text()='Send OTP']")
	WebElement sendBtn;
	
	private @FindBy(xpath = "//button[text()='Verify OTP']")
	WebElement verify;
	
	public void phoneNumber(String num)
	{
		telephone.sendKeys(num);
	}
	
	public void sendOtp()
	{
		sendBtn.click();
	}
	
	public void clickVerify()
	{
		verify.click();
	}

}
