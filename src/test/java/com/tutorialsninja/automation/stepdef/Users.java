package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.UsersPage;

import cucumber.api.java.en.*;

public class Users {
	
	UsersPage user = new UsersPage();
	
	@And("^I click on Users$")
	public void i_click_on_Users() {
		
		Elements.click(UsersPage.users);
		Assert.assertTrue(Elements.isDisplayed(UsersPage.usersNavSuccess));
		
	}

	@And("^I click on Users Search tab$")
	public void i_click_on_Users_Search_tab() {
		
		Elements.click(UsersPage.userSearchTab);
		
	}

	@And("^I enter the User name \"([^\"]*)\"$")
	public void i_enter_the_User_name(String arg1) {
		
		Elements.TypeText(UsersPage.userSearchTab, arg1);
		
	}

	@And("^I click on Sort by User$")
	public void i_click_on_Sort_by_User() {
		
		Elements.click(UsersPage.sortByUser);
		
	}

	@And("^I click on Sort by Email$")
	public void i_click_on_Sort_by_Email() {
		
		Elements.click(UsersPage.sortByEmail);
		
	}
	
	@Given("^I click on Create User$")
	public void i_click_on_Create_User(){
		
		Elements.click(UsersPage.createUser);
		
	}

	@Given("^I enter the First name \"([^\"]*)\"$")
	public void i_enter_the_First_name(String arg1){
		
		Elements.TypeText(UsersPage.firstName, arg1);
		
	}

	@Given("^I enter the Last name \"([^\"]*)\"$")
	public void i_enter_the_Last_name(String arg1){
		
		Elements.TypeText(UsersPage.lastName, arg1);
		
	}

	@Given("^I enter the Email \"([^\"]*)\"$")
	public void i_enter_the_Email(String arg1){
		
		Elements.TypeText(UsersPage.email, arg1);
		
	}

	@Given("^I enter the Organization \"([^\"]*)\"$")
	public void i_enter_the_Organization(String arg1){
		
		Elements.TypeText(UsersPage.organization, arg1);
		
	}

	@Given("^I click on Add User$")
	public void i_click_on_Add_User(){
		
		Elements.click(UsersPage.saveUser);
		
	}
	
	@Given("^I select Internal User$")
	public void i_select_Internal_User(){
		
		Elements.click(UsersPage.selectInternal);
		
	}

	@Given("^I enter Certis User ID \"([^\"]*)\"$")
	public void i_enter_Certis_User_ID(String arg1){
		
		Elements.TypeText(UsersPage.certisID, arg1);
		
	}
	
	@Given("^I click on next button of the Users Page$")
	public void i_click_on_next_button_of_the_Users_Page(){
		
		Elements.click(UsersPage.nextPage);
		
	}

	@Given("^I click on last button of the Users Page$")
	public void i_click_on_last_button_of_the_Users_Page(){
		
		Elements.click(UsersPage.lastPage);
		
	}



}
