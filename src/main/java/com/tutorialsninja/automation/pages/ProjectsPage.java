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
	
	@FindBy(xpath = "//span[contains(text(),'›')]")
	public static WebElement nextProject;
	
	@FindBy(xpath = "//span[normalize-space()='»']")
	public static WebElement lastProject;
	
	@FindBy(xpath = "//a[@id='jh-create-entity']")
	public static WebElement addProject;
	
	@FindBy(xpath = "//input[@id='project-endDate']")
	public static WebElement endDateTab;
	
	@FindBy(xpath = "//input[@id='project-customer']")
	public static WebElement customer;
	
	@FindBy(xpath = "//input[@id='project-projectName']")
	public static WebElement projectName;
	
	@FindBy(xpath = "//input[@id='project-folderName']")
	public static WebElement folderName;
	
	@FindBy(xpath = "//input[@id='confidential']")
	public static WebElement confidential;
	
	@FindBy(xpath = "//button[@id='save-entity']")
	public static WebElement saveProject;
	
	@FindBy(xpath = "//tbody/tr[3]/td[7]/div[1]/a[1]/span[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement projectMembers;
	
	@FindBy(xpath = "//span[normalize-space()='Project Member Management']")
	public static WebElement projectMembersManage;
	
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public static WebElement saveProjectMembers;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/div[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
	public static WebElement elipsis;
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	public static WebElement editButton;
	
	@FindBy(xpath = "//input[@id='nonConfiential']")
	public static WebElement nonConfidential;
	
	@FindBy(xpath = "//span[normalize-space()='Save Project']")
	public static WebElement saveEdit;
	 
}
