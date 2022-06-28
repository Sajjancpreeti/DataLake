Feature: Sorting of the Project
	
		@SortProj
	  Scenario: Verify whether the User Login is sucessful
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I sort by Customer
    And I sort by Project
    And I sort by Folder
    And I sort by Project Start Date
    And I sort by Project End Date