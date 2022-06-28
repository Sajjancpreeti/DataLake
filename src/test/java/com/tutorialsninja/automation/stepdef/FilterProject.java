package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.FilterProjectPage;

import cucumber.api.java.en.And;

public class FilterProject {
	
	FilterProjectPage fil = new FilterProjectPage();

	@And("^I click on Project Start Date Filter$")
	public void i_click_on_Project_Start_Date_Filter() throws InterruptedException {
		
		Elements.click(FilterProjectPage.projectStartDateFilter);
		Thread.sleep(5000);
		
	}
	
	@And("^I click on This Month$")
	public void i_click_on_This_Month() throws InterruptedException {
		
		Elements.click(FilterProjectPage.thisMonth);
		Thread.sleep(5000);
		
	}


	@And("^I click on the Apply Filter$")
	public void i_click_on_the_Apply_Filter() throws InterruptedException {
		
		Elements.click(FilterProjectPage.applyFilter);
		Thread.sleep(5000);
		
	}

	@And("^I click on Reset Page$")
	public void i_click_on_Reset_Page() throws InterruptedException {
		
		Elements.click(FilterProjectPage.reSetPage);
		Thread.sleep(5000);
		
	}
	
	@And("^I click on Project End Date Filter$")
	public void i_click_on_Project_End_Date_Filter() throws InterruptedException {
		
		Elements.click(FilterProjectPage.projectEndDateFilter);
		Thread.sleep(5000);
		
	}
}
