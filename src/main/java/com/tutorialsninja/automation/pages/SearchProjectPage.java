package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SearchProjectPage {
	
public SearchProjectPage() {
	
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='🔍 Search by Customer, Project, Folder']")
	public static WebElement searchTab;
	

}
