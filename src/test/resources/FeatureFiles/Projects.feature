Feature: Projects of the Portal

		Scenario: Verify uploading files to the Project
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Upload
    And I click on Browse Files
    And I agree for Tearms and Conditions
    And I click on Continue
    And I upload files from the path
    And I click on Upload file 

		Scenario: Verify Add Projects
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Add Project
    And I enter the Customer "Diatoz"
    And I enter the Project "DataLake"
    And I enter the Folder "Data"
    And I enter the Project end date "20052023"
    And I select the Project Confidentiality
    And I save the new Project 
    
    Scenario: Verify Project Members
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Projects member
    And I click on Project member management
    And I click on save Project member
    
    Scenario: Verify Edit Project
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on ellipsis
    And I click on Edit 
    And I edit confidentiality
    And I save edited project
	
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
    
    Scenario: Verify navigating to the next page of Projects
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on next button of the Projects Page
    
    Scenario: Verify navigating to the last page of Projects
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on last button of the Projects Page   
    
    