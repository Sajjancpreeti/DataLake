package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class FilterProjectPage {
	
	 public FilterProjectPage() {
			
			PageFactory.initElements(Base.driver, this);
			
		}
	 
	 @FindBy(xpath = "//th[4]//*[name()='svg'][2]/*[name()='path'][1]")
	 public static WebElement projectStartDateFilter;
	 
	 @FindBy(xpath = "//span[normalize-space()='This Month']")
	 public static WebElement thisMonth;
	 
	 @FindBy(xpath = "//span[normalize-space()='Apply']")
	 public static WebElement applyFilter;
	 
	 @FindBy(xpath = "//span[normalize-space()='Reset Page']")
	 public static WebElement reSetPage;
	 
	 @FindBy(xpath = "//th[5]//*[name()='svg'][2]/*[name()='path'][1]")
	 public static WebElement projectEndDateFilter;
}
