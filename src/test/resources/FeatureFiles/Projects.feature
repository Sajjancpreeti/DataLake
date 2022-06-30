Feature: Projects of the Portal
	
	 	Scenario: Verify whether Searched Projects appear on the screen
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I Click on Search Tab
    And I enter the Project Name as "Mercury"
    
		Scenario: Verify the sorting of Projects
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I sort by Customer
    And I sort by Project
    And I sort by Folder
    And I sort by Project Start Date
    And I sort by Project End Date

		Scenario: Verify whether the Project Start Date Filter is working
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Project Start Date Filter
    And I click on Yesterday
    And I click on the Apply Filter of StartDate
    And I click on Reset Page of StartDate
    
    Scenario: Verify whether the Project End Date Filter is working
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Project End Date Filter
    And I click on This Month
    And I click on the Apply Filter of EndDate
    And I click on Reset Page of EndDate