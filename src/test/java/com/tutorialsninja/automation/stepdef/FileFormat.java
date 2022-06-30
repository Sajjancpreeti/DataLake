package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.FileFormatPage;

import cucumber.api.java.en.*;


public class FileFormat {
	
	FileFormatPage format = new FileFormatPage();
	
	@And("^I click on File Formats$")
	public void i_click_on_File_Formats() {
		
		Elements.click(FileFormatPage.fileFormat);
		Assert.assertTrue(Elements.isDisplayed(FileFormatPage.formatNaviSuccess));
		System.out.println("Navigation to FileFormat success");
		
	}

	@And("^I click on Format Search tab$")
	public void i_click_on_Format_Search_tab() {
		
		Elements.click(FileFormatPage.formatSearchTab);
		
	}

	@And("^I enter the Format name \"([^\"]*)\"$")
	public void i_enter_the_Format_name(String arg1) {
		
		Elements.TypeText(FileFormatPage.formatSearchTab, arg1);
		
	}

	@And("^I click on Sort by Format$")
	public void i_click_on_Sort_by_Format() {
		
		Elements.click(FileFormatPage.sortByFormat);
		
	}

	@And("^I click on Sort by Format Type$")
	public void i_click_on_Sort_by_Format_Type() {
		
		Elements.click(FileFormatPage.sortByFormtType);
		
	}
	
	@Given("^I click on Add Format$")
	public void i_click_on_Add_Format(){
		
		Elements.click(FileFormatPage.addFormat);
		
	}

	@Given("^I enter Format name \"([^\"]*)\"$")
	public void i_enter_Format_name(String arg1){
		
		Elements.TypeText(FileFormatPage.formatName, arg1);
		
	}

	@Given("^I enter Format type \"([^\"]*)\"$")
	public void i_enter_Format_type(String arg1){
		
		Elements.TypeText(FileFormatPage.formatType, arg1);
		
	}

	@Given("^I click on save$")
	public void i_click_on_save(){
		
		Elements.click(FileFormatPage.saveFormat);
		
	}
	
	@Given("^I click on Next to navigate to next page of File Format$")
	public void i_click_on_Next_to_navigate_to_next_page_of_File_Format(){
		
		Elements.click(FileFormatPage.nextPage);
		
	}

	@Given("^I click on last to navigate to last page of File Format$")
	public void i_click_on_last_to_navigate_to_last_page_of_File_Format(){
		
		Elements.click(FileFormatPage.lastPage);
		
	}
}
