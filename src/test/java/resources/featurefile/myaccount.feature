Feature: Account register page

  @smoke
  Scenario: User should navigate to register page successfully
    Given User is on homepage
    When User click on my account link
    And User select my account option "Register"
    Then verify the message "Register Account"


  @sanity
  Scenario: User Register Account Successfully
    Given User is on homepage
    When User click on my account link
    And User select my account option "Register"
    And User enter first name "Dev"
    And User enter last name "Coldo"
    And User enter email id "dev123@gmail.com"
    And User enter phone number "0987654321"
    And User enter password "Dev123"
    And User enter confirm password "Dev123"
    And User click on subscribe button
    And User click on checkbox button
    And User click on continue
    Then Verify text account created "Your Account Has Been Created!"
    And User click on second continue button
    And User click on my account tab
    And User select account option "Logout"
    Then verify account logout text "Account Logout"
    And User click on final continue
