package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ProjectsPage {
	
	public ProjectsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='🔍 Search by Customer, Project, Folder']")
	public static WebElement searchTab;

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
	
	@FindBy(xpath = "//th[4]//*[name()='svg'][2]/*[name()='path'][1]")
	public static WebElement startDateFilter;
	
	@FindBy(xpath = "//span[normalize-space()='Yesterday']")
	public static WebElement yesterday;
	
	@FindBy(xpath = "//span[normalize-space()='Apply']")
	public static WebElement applyFilter;
	
	@FindBy(xpath = "//span[normalize-space()='Reset Page']")
	public static WebElement resetPage;
	
	@FindBy(xpath = "//th[5]//*[name()='svg'][2]/*[name()='path'][1]")
	public static WebElement enddateFilter;
	
	@FindBy(xpath = "//span[normalize-space()='This Month']")
	public static WebElement thisMonth;

}
