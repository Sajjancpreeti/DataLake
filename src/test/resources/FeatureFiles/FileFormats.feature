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
    
    Scenario: Verify add new Format
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    And I click on Add Format
    And I enter Format name "GIF"
    And I enter Format type ".gif"
    And I click on save
    
    Scenario: Verify Edit Format
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    And I click on edit button of the format
    And I edit the format name "GIF File"
    And I save the edited format
    
    Scenario: Verify Delete Format
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    And I click on Delete Formats
    And I click on confirm Delete
    
    
    Scenario: Verify navigating to the next File Formats Page
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    And I click on Next to navigate to next page of File Format
    
    Scenario: Verify navigating to the last File Formats Page
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on File Formats
    And I click on last to navigate to last page of File Format
