package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class LoginPage {
	
public LoginPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='username']")    
	public static WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//span[normalize-space()='Next']")
	public static WebElement next;
	
	@FindBy(xpath = "//a[@class='active']//span[contains(text(),'Projects')]")
	public static WebElement loginSuccess;

}
