package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class UserProfilePage {
	
	public UserProfilePage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//img[@src='content/images/up-caret.svg']")
	public static WebElement profileButton;
	
	@FindBy(xpath = "//img[@id='settings-caret']")
	public static WebElement settingsButton;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public static WebElement lastName;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public static WebElement saveEdit;
	
	@FindBy(xpath = "//span[normalize-space()='Change Password']")
	public static WebElement changePasswordButton;
	
	@FindBy(xpath = "//input[@id='currentPassword']")
	public static WebElement currentPassord;
	
	@FindBy(xpath = "//input[@id='newPassword']")
	public static WebElement newPassord;
	
	@FindBy(xpath = "//input[@id='confirmPassword']")
	public static WebElement confirmPassword;
	
	@FindBy(xpath = "//span[contains(.,'Save')]")
	public static WebElement savePassword;

}
