package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SortProjectPage {
	
	public SortProjectPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath = "//th[1]//*[name()='svg']")
	public static WebElement sortByCustomer;
	
	@FindBy(xpath = "//th[2]//*[name()='svg']")
	public static WebElement sortByProject;
	
	@FindBy(xpath = "//th[3]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement sortByFolder;
	
	@FindBy(xpath = "//th[4]//*[name()='svg'][1]/*[name()='path'][1]")
	public static WebElement sortByProjectStartDate;
	
	@FindBy(xpath = "//th[5]//*[name()='svg'][1]/*[name()='path'][1]")
	public static WebElement sortByProjectEndDate;

}
