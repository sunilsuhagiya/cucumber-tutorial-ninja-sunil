Feature: Account Login

  @smoke
  Scenario: User Should Navigate To Login Page Successfully
    Given User is on homepage
    When User click on my account link
    And User click on my account option "Login"
    Then Verify the message returning customer "Returning Customer"

  @sanity
  Scenario: User Should Login And Logout Successfully
    Given User is on homepage
    When User click on my account link
    And User click on my account option "Login"
    And User enter email "dev123@gmail.com"
    And User enter password "Dev123"
    And User click on login
    Then Verify text my account "My Account"
    And User click on my account tab
    And User select my account option "Logout"
    Then verify account logout text "Account Logout"
    And User click on final continue