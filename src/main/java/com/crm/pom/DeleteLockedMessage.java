package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.crm.listeners.Screenshot.class)

public class DeleteLockedMessage {

	public DeleteLockedMessage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "(//i[@class='fe fe-trash'])[2]") WebElement deleteIcon;

	private @FindBy(xpath = "//button[text()='Delete']") WebElement deleteButton;

	private @FindBy(xpath = "//button[text()='Cancel']") WebElement cancelButton;

	public void clickDeleteIcon() {
		deleteIcon.click();
	}

	public void clickDeleteButton() {
		deleteButton.click();
	}

	public void clickCancelButton() {
		cancelButton.click();
	}
}
