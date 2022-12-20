Feature: Top menu test
  As user I want to navigate to appropriate page

  @smoke
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given I am on home page
    When I click on Desktop
    And I select show all desktop
    Then verify user is on desktop page

  @sanity
  Scenario: Verify User Should Navigate To Laptop nad notebook Page Successfully
    Given I am on home page
    When I click on Laptop and notebook
    And I select show all Laptop and notebook
    Then verify user is on Laptop and notebook page

  @regression
  Scenario: Verify User Should Navigate To Components Page Successfully
    Given I am on home page
    When I click on Components
    And I select show all Components
    Then verify user is on Components page