package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.crm.listeners.Screenshot.class)

public class EditLockedMessage {
	public EditLockedMessage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//i[@class='fe fe-edit']") WebElement editIcon;

	private @FindBy(xpath = "//input[@name='price']") WebElement amt;

	private @FindBy(xpath = "//textarea[@name='visibleMessage']") WebElement msg;

	private @FindBy(xpath = "//button[text()='Submit']") WebElement submitBtn;

	private @FindBy(xpath = "//textarea[@name='premiumContent']") WebElement premContent;
	
	public void clickEditIcon() {
		editIcon.click();
	}

	public void enterAmount(String amount) {
		amt.sendKeys(amount);
	}

	public void writeMsg(String message) {
		msg.sendKeys(message);
	}

	public void premiumContent(String msg) {
		premContent.sendKeys(msg);
	}

	public void clickSubmit() {
		submitBtn.click();
	}

}
