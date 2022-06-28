package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class FileFormatPage {
	
	public FileFormatPage() {
	
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//span[normalize-space()='File Formats']")
	public static WebElement fileFormat;
	
	@FindBy(xpath = "//span[normalize-space()='Supported formats']")
	public static WebElement formatNaviSuccess;
	
	@FindBy(xpath = "//input[@placeholder='🔍 Search by Format, Format Type']")
	public static WebElement formatSearchTab;
	
	@FindBy(xpath = "//th[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement sortByFormat;
	
	@FindBy(xpath = "//th[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement sortByFormtType;

}
