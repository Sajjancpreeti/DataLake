Feature: Filters for the Project Start Date and End Date
		
	  Scenario: Verify whether the Project Start Date Filter is working
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Project Start Date Filter
    And I click on This Month
    And I click on the Apply Filter
    And I click on Reset Page 
    
    Scenario: Verify whether the Project End Date Filter is working
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Project End Date Filter
    And I click on This Month
    And I click on the Apply Filter
    And I click on Reset Page 