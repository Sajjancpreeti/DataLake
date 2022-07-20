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
	
	@And("^I click on Create User$")
	public void i_click_on_Create_User(){
		
		Elements.click(UsersPage.createUser);
		
	}

	@And("^I enter the First name \"([^\"]*)\"$")
	public void i_enter_the_First_name(String arg1){
		
		Elements.TypeText(UsersPage.firstName, arg1);
		
	}

	@And("^I enter the Last name \"([^\"]*)\"$")
	public void i_enter_the_Last_name(String arg1){
		
		Elements.TypeText(UsersPage.lastName, arg1);
		
	}

	@And("^I enter the Email \"([^\"]*)\"$")
	public void i_enter_the_Email(String arg1){
		
		Elements.TypeText(UsersPage.email, arg1);
		
	}

	@And("^I enter the Organization \"([^\"]*)\"$")
	public void i_enter_the_Organization(String arg1){
		
		Elements.TypeText(UsersPage.organization, arg1);
		
	}

	@And("^I click on Add User$")
	public void i_click_on_Add_User(){
		
		Elements.click(UsersPage.saveUser);
		
	}
	
	@And("^I select Internal User$")
	public void i_select_Internal_User(){
		
		Elements.click(UsersPage.selectInternal);
		
	}

	@And("^I enter Certis User ID \"([^\"]*)\"$")
	public void i_enter_Certis_User_ID(String arg1){
		
		Elements.TypeText(UsersPage.certisID, arg1);
		
	}
	
	@Given("^I enter Certis email \"([^\"]*)\"$")
	public void i_enter_Certis_email(String arg1) {
		
		Elements.TypeText(UsersPage.cretisEmail, arg1);
		
	}
	
	@And("^I click on next button of the Users Page$")
	public void i_click_on_next_button_of_the_Users_Page(){
		
		Elements.click(UsersPage.nextPage);
		
	}

	@And("^I click on last button of the Users Page$")
	public void i_click_on_last_button_of_the_Users_Page(){
		
		Elements.click(UsersPage.lastPage);
		
	}

	@And("^I click on Edit button of User$")
	public void i_click_on_Edit_button_of_User(){
		
		//Elements.click(UsersPage.editUserButton);
		
	}

	@And("^I edit the Last name of User \"([^\"]*)\"$")
	public void i_edit_the_Last_name_of_User(String arg1){
		
		/*Elements.clearTxtBox(UsersPage.editLastName);
		Elements.TypeText(UsersPage.editLastName, arg1);*/
		
	}

	@And("^I save the edited user changes$")
	public void i_save_the_edited_user_changes(){
		
		//Elements.click(UsersPage.saveEditUser);
		
	}
	
	@And("^I click on Delete button of User$")
	public void i_click_on_Delete_button_of_User(){
		
		Elements.click(UsersPage.deleteButton);
		
	}

	@And("^I click on Delete User$")
	public void i_click_on_Delete_User(){
		
		Elements.click(UsersPage.deleteUserConfirm);
		
	}
	
	@And("^I click on Enabled to disable user$")
	public void i_click_on_Enabled_to_disable_user(){
		
		//Elements.click(UsersPage.statusUser);  //Disabled User
		
	}

	@And("^I click on Disabled to enable user$")
	public void i_click_on_Disabled_to_enable_user(){
		
		//Elements.click(UsersPage.statusUser);  //Enabled User
		 
	}
	
	@Given("^I click on Assign Projects btn$")
	public void i_click_on_Assign_Projects_btn(){
		
		//Elements.click(UsersPage.assignButton);
		
	}

	@Given("^I select all projects from the drop-down$")
	public void i_select_all_projects_from_the_drop_down(){
		
		//Elements.click(UsersPage.projDropDown);
		
	}

	@Given("^I select the first project$")
	public void i_select_the_first_project(){
		
		//Elements.click(UsersPage.firstAssignProj);
				
	}

	@Given("^I select save changes$")
	public void i_select_save_changes(){
		
		//Elements.click(UsersPage.saveAssign);
		
	}

}
