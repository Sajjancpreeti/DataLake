package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class UsersPage {
	
	public UsersPage() {
	
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//span[normalize-space()='Users']")
	public static WebElement users;
	
	@FindBy(xpath = "//h3[@class='text-secondary font-weight-bolder text-nowrap h2']")
	public static WebElement usersNavSuccess;
	
	@FindBy(xpath = "//input[@id='inputSmall']")
	public static WebElement userSearchTab;
	
	@FindBy(xpath = "//th[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement sortByUser;
	
	@FindBy(xpath = "//th[3]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement sortByEmail;
}
