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
	
	@FindBy(xpath = "//span[normalize-space()='Create User']")
	public static WebElement createUser;
	
	@FindBy(xpath = "//input[@id='first-name']")
	public static WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public static WebElement lastName;
	
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement email;
	
	@FindBy(xpath = "//input[@id='organization']")
	public static WebElement organization;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement saveUser;
	
	@FindBy(xpath = "//div[@class='bg-white text-secondary modal-body']//div[2]//input[1]")
	public static WebElement selectInternal;
	
	@FindBy(xpath = "//input[@id='certisUserId']")
	public static WebElement certisID;
	
	@FindBy(xpath = "//button[@aria-label='Next']")
	public static WebElement nextPage;
	
	@FindBy(xpath = "//button[@aria-label='Last']")
	public static WebElement lastPage;
}
