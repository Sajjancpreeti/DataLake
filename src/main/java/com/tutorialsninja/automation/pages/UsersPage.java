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
	
	@FindBy(xpath = "//a[@id='jh-create-entity']//*[name()='svg']")
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
	
	@FindBy(xpath = "//tr[@id='preetisajjan2@gmail.com']//a[@class='p-0 shadow-none btn btn-white btn-sm']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement editUserButton;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public static WebElement editLastName;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public static WebElement saveEditUser;
	
	@FindBy(xpath = "//tr[@id='peeyusajjan@gmail.com']//button[@type='button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement deleteButton;
	
	@FindBy(xpath = "//div[@class='btn-danger pointer-onhover']")
	public static WebElement deleteUserConfirm;
	
	@FindBy(xpath = "//tr[@id='preetisajjan2@gmail.com']//span[@class='slider round']")
	public static WebElement statusUser;
	
	@FindBy(xpath = "//tr[@id='preetisajjan2@gmail.com']//div[@class='assignProjectImage mt-2 pointer-onhover']")
	public static WebElement assignButton;
	
	@FindBy(xpath = "//div[@class=' css-qc6sy-singleValue']")
	public static WebElement projDropDown;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	public static WebElement firstAssignProj;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public static WebElement saveAssign;
	
}
