Feature: File Formats of the portl
		
	  Scenario: Verify whether the User is Navigated to the File Formats Page
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    
    Scenario: Verify whether the User is able to search the File Formats
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    And I click on Format Search tab
    And I enter the Format name "htm"
     
    Scenario: Verify whether the User is able to Sort the Formats
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    And I click on Sort by Format
    And I click on Sort by Format Type