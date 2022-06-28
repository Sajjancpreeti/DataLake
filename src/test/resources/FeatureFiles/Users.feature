Feature: Users of the portal
		
	  Scenario: Verify whether the User is Navigated to the Users Page
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    
    Scenario: Verify whether the User is able to search the Users
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Users Search tab
    And I enter the User name "preeti"
     
    Scenario: Verify whether the User is able to Sort thr Users
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Sort by User
    And I click on Sort by Email