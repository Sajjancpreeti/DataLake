Feature: User Profile in the Portal

		Scenario: Verify Settings of the User
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on User Profile
    And I click on Settings
    And edit the last name in the settings as "Sajjan"
    And I click on save to save the User Profile
    
    Scenario: Verify Change Password of the User
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on User Profile
    And I click on Change Password
    And I enter the Current Password "hello1234"
    And I enter the New Password "hello123"
    And I enter the Confirm New Password "hello1234"
    And I click on save password
    
    Scenario: Verify Sign out of the User
    Given I launch the application
    And I enter the UserID "preeti.sajjan@diatoz.com" 
    And I enter the Password "hello123"
    And I click on Next
    And I click on User Profile
    And I click on Sign Out