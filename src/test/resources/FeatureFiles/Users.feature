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
    
    Scenario: Verify adding new external user into the portal
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Create User
    And I enter the First name "Peeyu"
    And I enter the Last name "Sajjan"
    And I enter the Email "peeyusajjan@gmail.com"
    And I enter the Organization "Diatoz"
    And I click on Add User
    
    Scenario: Verify adding new internal user into the portal
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Create User
    And I select Internal User
    And I enter Certis User ID "SG000000"
    And I click on Add User
    
    Scenario: Verify edit user
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Edit button of User
    And I edit the Last name of User "Koti"
    And I save the edited user changes
    
    Scenario: Verify Delete user
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Delete button of User
    And I click on Delete User
    
    Scenario: Verify Status of user
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Enabled to disable user
    And I click on Disabled to enable user
    
    Scenario: Verify Assign Project of user
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on Assign Projects btn
    And I select all projects from the drop-down
    And I select the first project
    And I select save changes
    
    Scenario: Verify navigating to the next page of Users
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on next button of the Users Page
    
    Scenario: Verify navigating to the last page of Users
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on Users
    And I click on last button of the Users Page
    