package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.SortProjectPage;

import cucumber.api.java.en.*;

public class SortProjects {
	
	SortProjectPage sort = new SortProjectPage();
	
	@And("^I sort by Customer$")
	public void i_sort_by_Customer() {
		
		Elements.click(SortProjectPage.sortByCustomer);
		System.out.println("Sort by Customer");
		
	}

	@And("^I sort by Project$")
	public void i_sort_by_Project() {
		
		Elements.click(SortProjectPage.sortByProject);
		System.out.println("Sort by Projects");
		
	}

	@And("^I sort by Folder$")
	public void i_sort_by_Folder() {
		
		Elements.click(SortProjectPage.sortByFolder);
		System.out.println("Sort by Folder");
		
	}

	@And("^I sort by Project Start Date$")
	public void i_sort_by_Project_Start_Date() {
		
		Elements.click(SortProjectPage.sortByProjectStartDate);
		System.out.println("Sort by Project Start Date");
		
	}

	@And("^I sort by Project End Date$")
	public void i_sort_by_Project_End_Date() {
		
		Elements.click(SortProjectPage.sortByProjectEndDate);
		System.out.println("Sort by Project End Date");
		
	}

}
