package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.SearchProjectPage;

import cucumber.api.java.en.And;

public class SearchProject {
	
	SearchProjectPage src = new SearchProjectPage();
	
	@And("^I Click on Search Tab$")
	public void i_Click_on_Search_Tab(){
		
		Elements.click(SearchProjectPage.searchTab);
		
	}

	@And("^I enter the Project Name as \"([^\"]*)\"$")
	public void i_enter_the_Project_Name_as(String arg1) throws InterruptedException{
		
		Elements.TypeText(SearchProjectPage.searchTab, arg1);
		System.out.println("Search Successful");
		Thread.sleep(3000);
		
	}

}
