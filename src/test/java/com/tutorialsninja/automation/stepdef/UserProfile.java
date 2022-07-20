package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.UserProfilePage;

import cucumber.api.java.en.*;

public class UserProfile {
	
	UserProfilePage userProfile= new UserProfilePage();
	
	@And("^I click on User Profile$")
	public void i_click_on_User_Profile(){
		
		Elements.click(UserProfilePage.profileButton);
		
	}

	@And("^I click on Settings$")
	public void i_click_on_Settings(){
		
		Elements.click(UserProfilePage.settingsButton);
		
	}

	@And("^edit the last name in the settings as \"([^\"]*)\"$")
	public void edit_the_last_name_in_the_settings_as(String arg1){
		
		Elements.clearTxtBox(UserProfilePage.lastName);
		Elements.TypeText(UserProfilePage.lastName, arg1);
		
	}

	@And("^I click on save to save the User Profile$")
	public void i_click_on_save_to_save_the_User_Profile(){
		
		Elements.click(UserProfilePage.saveEdit);
		
	}
	
	@And("^I click on Change Password$")
	public void i_click_on_Change_Password(){
		
		Elements.click(UserProfilePage.changePasswordButton);
		
	}

	@And("^I enter the Current Password \"([^\"]*)\"$")
	public void i_enter_the_Current_Password(String arg1){
		
		Elements.TypeText(UserProfilePage.currentPassord, arg1);
		
	}

	@And("^I enter the New Password \"([^\"]*)\"$")
	public void i_enter_the_New_Password(String arg1){
		
		Elements.TypeText(UserProfilePage.newPassord, arg1);
		
	}

	@And("^I enter the Confirm New Password \"([^\"]*)\"$")
	public void i_enter_the_Confirm_New_Password(String arg1){
		
		Elements.TypeText(UserProfilePage.confirmPassword, arg1);
		
	}

	@And("^I click on save password$")
	public void i_click_on_save_password(){
		
		Elements.click(UserProfilePage.savePassword);
		
	}
	
	@And("^I click on Sign Out$")
	public void i_click_on_Sign_Out(){
		
		Elements.click(UserProfilePage.signOut);
		
	}

}
