package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.LoginPage;

import cucumber.api.java.en.*;

public class Login {
	
	LoginPage logPage = new LoginPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws InterruptedException{
		
		Base.driver.get(Base.reader.getUrl());
		
	}
	
	@And("^I enter the UserID \"([^\"]*)\"$")
	public void i_enter_the_UserID(String userN){
		
		Elements.TypeText(LoginPage.userName, userN);
		
	}

	@And("^I enter the Password \"([^\"]*)\"$")
	public void i_enter_the_Password(String pass){
		
		Elements.TypeText(LoginPage.password, pass);
		
	}
	
	@And("^I click on Next$")
	public void i_click_on_Next() throws InterruptedException { 
		
		Elements.click(LoginPage.next);
		Thread.sleep(3000);
		Assert.assertTrue(Elements.isDisplayed(LoginPage.loginSuccess));
		System.out.println("Login Success");
		
	}

}
