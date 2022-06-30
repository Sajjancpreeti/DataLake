package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ProjectsPage;

import cucumber.api.java.en.*;

public class Projects {
	
	ProjectsPage project = new ProjectsPage();
	
	@And("^I Click on Search Tab$")
	public void i_Click_on_Search_Tab(){
		
		Elements.click(ProjectsPage.searchTab);
		
	}

	@And("^I enter the Project Name as \"([^\"]*)\"$")
	public void i_enter_the_Project_Name_as(String arg1){
		
		Elements.TypeText(ProjectsPage.searchTab, arg1);
		
	}

	@And("^I sort by Customer$")
	public void i_sort_by_Customer(){
		
		Elements.click(ProjectsPage.sortByCustomer);
		
	}

	@And("^I sort by Project$")
	public void i_sort_by_Project(){
		
		Elements.click(ProjectsPage.sortByProject);
		
	}

	@And("^I sort by Folder$")
	public void i_sort_by_Folder(){
		
		Elements.click(ProjectsPage.sortByFolder);
	}

	@And("^I sort by Project Start Date$")
	public void i_sort_by_Project_Start_Date(){
		
		Elements.click(ProjectsPage.sortByProjectStartDate);
		
	}

	@And("^I sort by Project End Date$")
	public void i_sort_by_Project_End_Date(){
		
		Elements.click(ProjectsPage.sortByProjectEndDate);
		
	}

	@And("^I click on Project Start Date Filter$")
	public void i_click_on_Project_Start_Date_Filter(){
		
		Elements.click(ProjectsPage.startDateFilter);
		
	}

	@And("^I click on Yesterday$")
	public void i_click_on_Yesterday(){
		
		Elements.click(ProjectsPage.yesterday);
		
	}

	@And("^I click on the Apply Filter of StartDate$")
	public void i_click_on_the_Apply_Filter_of_StartDate(){
		
		Elements.click(ProjectsPage.applyFilter);
		
	}

	@And("^I click on Reset Page of StartDate$")
	public void i_click_on_Reset_Page_of_StartDate(){
		
		Elements.click(ProjectsPage.resetPage);
		
	}

	@And("^I click on Project End Date Filter$")
	public void i_click_on_Project_End_Date_Filter(){
		
		Elements.click(ProjectsPage.enddateFilter);
		
	}

	@And("^I click on This Month$")
	public void i_click_on_This_Month(){
		
		Elements.click(ProjectsPage.thisMonth);
		
	}

	@And("^I click on the Apply Filter of EndDate$")
	public void i_click_on_the_Apply_Filter_of_EndDate(){
		
		Elements.click(ProjectsPage.applyFilter);
		
	}

	@And("^I click on Reset Page of EndDate$")
	public void i_click_on_Reset_Page_of_EndDate(){
		
		Elements.click(ProjectsPage.resetPage);
		
	}

}
