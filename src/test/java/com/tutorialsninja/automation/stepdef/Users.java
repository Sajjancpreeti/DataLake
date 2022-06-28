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

}
