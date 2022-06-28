Feature: Search for Projects
	
		@SearchProj
	  Scenario: Verify whether Searched Projects appear on the screen
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I Click on Search Tab
    And I enter the Project Name as "Mercury"
     