Feature: Login into the portal
		
		@Login
	  Scenario: Verify whether the User Login is sucessful
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
     